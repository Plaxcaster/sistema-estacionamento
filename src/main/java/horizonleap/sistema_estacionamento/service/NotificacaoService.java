package horizonleap.sistema_estacionamento.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import horizonleap.sistema_estacionamento.model.Bilhete;
import horizonleap.sistema_estacionamento.repository.BilheteRepository;

@Service
public class NotificacaoService {

    @Autowired
    private BilheteRepository bilheteRepository;

    @Scheduled(fixedRate = 60000) // Checa a cada minuto
    public void checarVencimentoBilheteFixo() {
        List<Bilhete> bilhetes = bilheteRepository.findAll();
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Debug: executada busca de bilhetes próximos de expirar");

        for (Bilhete bilhete : bilhetes) {
            if (bilhete.getTimestampFim().isBefore(now.plusMinutes(5)) && bilhete.getTimestampFim().isAfter(now)
                    && bilhete.getBilheteAtivo() == true && bilhete.getIsFixo()) {

                sendNotification("Seu bilhete de número " + bilhete.getId() + " está próximo de expirar.");
            }
        }
    }

    public void checarVencimentoBilheteVariavel() {
        List<Bilhete> bilhetes = bilheteRepository.findAll();
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Debug: executada busca de bilhetes próximos de expirar (variavel)");

        for (Bilhete bilhete : bilhetes) {
            if (bilhete.getTimestampFim().isBefore(now.plusMinutes(5)) && bilhete.getTimestampFim().isAfter(now)
                    && bilhete.getBilheteAtivo() == true && !bilhete.getIsFixo()) {
                        
                bilhete.setTimestampFim(bilhete.getTimestampFim().plusHours(1));
                sendNotification("Seu bilhete de número " + bilhete.getId() + " será renovado por mais uma hora.");
            }
        }
    }

    public void sendNotification(String message) {
        // Como não há frontend, a notificação é um sysout
        System.out.println("Alerta: " + message);
    }
}
