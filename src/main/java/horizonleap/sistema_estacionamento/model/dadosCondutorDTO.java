package horizonleap.sistema_estacionamento.model;

import java.util.List;

import horizonleap.sistema_estacionamento.enums.MetodoPagamento;

public record dadosCondutorDTO(
        int id,
        String nome,
        String endereço,
        String infoContato,
        MetodoPagamento metodoFavorito,
        List<Veiculo> veiculos) {

}
