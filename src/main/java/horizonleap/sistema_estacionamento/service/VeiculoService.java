package horizonleap.sistema_estacionamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import horizonleap.sistema_estacionamento.model.Veiculo;
import horizonleap.sistema_estacionamento.repository.VeiculoRepository;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository veiculoRepository; 

    @Autowired
    private CondutorService condutorService;

    public Veiculo salvar(String nomeModelo, String placa, int id_condutor) {
        Veiculo veiculo = new Veiculo();

        veiculo.setCondutor(condutorService.busca(id_condutor));
        veiculo.setNomeModelo(nomeModelo);
        veiculo.setPlaca(placa);

        return veiculoRepository.save(veiculo);
    }

    public Veiculo busca(int id_veiculo) {
        return veiculoRepository.findById(id_veiculo).get();
    }

}
