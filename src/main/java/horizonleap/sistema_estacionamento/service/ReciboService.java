package horizonleap.sistema_estacionamento.service;

import java.math.BigDecimal;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import horizonleap.sistema_estacionamento.model.Bilhete;
import horizonleap.sistema_estacionamento.model.Condutor;
import horizonleap.sistema_estacionamento.model.ReciboDTO;
import horizonleap.sistema_estacionamento.repository.BilheteRepository;

@Service
public class ReciboService {

    @Autowired
    private BilheteRepository bilheteRepository;

    public ReciboDTO emitirRecibo(int id_bilhete) {
        Bilhete bilhete = bilheteRepository.getReferenceById(id_bilhete);
        var veiculo = bilhete.getVeiculo();
        Condutor condutor = veiculo.getCondutor();
        long minutosDecorrido = ChronoUnit.MINUTES.between(bilhete.getTimestampInicio(), bilhete.getTimestampFim());
        long horasDecorrido = (long) Math.ceil(minutosDecorrido / 60.0);

        String mensagemTarifa;
        BigDecimal valorCobrado;

        switch (condutor.getMetodoFavorito()) {
            case CREDITO:
                mensagemTarifa = "Pagamento por crédito, 12 reais a hora";
                valorCobrado = BigDecimal.valueOf(12 * horasDecorrido);
                break;
            case DEBITO:
                mensagemTarifa = "Pagamento por debito, 10 reais a hora";
                valorCobrado = BigDecimal.valueOf(10 * horasDecorrido);
                break;
            case PIX:
                mensagemTarifa = "Pagamento por PIX, 7 reais a hora";
                valorCobrado = BigDecimal.valueOf(7 * horasDecorrido);
                break;
            default:
                mensagemTarifa = "Não conseguimos consultar forma de pagamento, é por nossa conta";
                valorCobrado = BigDecimal.valueOf(0);
        }

        return new ReciboDTO(condutor.getNome(), veiculo.getPlaca(), minutosDecorrido, mensagemTarifa, valorCobrado);
    }
}
