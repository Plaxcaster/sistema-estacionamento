package horizonleap.sistema_estacionamento.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import horizonleap.sistema_estacionamento.model.Bilhete;
import horizonleap.sistema_estacionamento.repository.BilheteRepository;

@Service
public class BilheteService {

    @Autowired
    private BilheteRepository bilheteRepository;
    @Autowired
    private VeiculoService veiculoService;

    public Bilhete salvarBilheteFixo(int id_veiculo, int duracao) {
        Bilhete bilhete = new Bilhete();

        bilhete.setTimestampInicio(LocalDateTime.now());
        bilhete.setTimestampFim(LocalDateTime.now().plusHours(duracao));
        bilhete.setVeiculo((veiculoService.busca(id_veiculo)));

        return bilheteRepository.save(bilhete);
    }

    public Bilhete salvarBilheteVariavel(int id_veiculo) {
        Bilhete bilhete = new Bilhete();

        bilhete.setTimestampInicio(LocalDateTime.now());
        bilhete.setVeiculo((veiculoService.busca(id_veiculo)));

        return bilheteRepository.save(bilhete);
    }

    // public Optional<Bilhete> buscarBilhetePorNumeroPlaca(String numeroPlaca) {
    //     return bilheteRepository.findByVeiculo_NumeroPlaca(numeroPlaca);
    // }
}
