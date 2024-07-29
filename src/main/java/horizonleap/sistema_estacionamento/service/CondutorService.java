package horizonleap.sistema_estacionamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import horizonleap.sistema_estacionamento.enums.MetodoPagamento;
import horizonleap.sistema_estacionamento.model.Condutor;
import horizonleap.sistema_estacionamento.model.dadosCondutorDTO;
import horizonleap.sistema_estacionamento.repository.CondutorRepository;
import horizonleap.sistema_estacionamento.repository.VeiculoRepository;

@Service
public class CondutorService {
    @Autowired
    private CondutorRepository condutorRepository;

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Condutor save(String nome, String endereco, String infoContato, MetodoPagamento metodoPagamento) {
        var condutor = new Condutor(nome, endereco, infoContato, metodoPagamento);

        return condutorRepository.save(condutor);
    }

    public Condutor busca(int id_condutor) {
        return condutorRepository.findById(id_condutor).get();
    }

    public dadosCondutorDTO consultarDadosCondutor(Integer id_condutor) {
        Condutor condutor = condutorRepository.findById(id_condutor).get();
        var listaVeiculos = veiculoRepository.findByCondutor(condutor);

        return new dadosCondutorDTO(condutor.getId(), condutor.getNome(), condutor.getEndereco(),
                condutor.getInfoContato(), condutor.getMetodoFavorito(), listaVeiculos);

    }

    public Condutor updateFormaPagamento(Integer idCondutor, String formaPagamento) {
        var condutor = condutorRepository.findById(idCondutor).get();
        condutor.setMetodoFavorito(MetodoPagamento.valueOf(formaPagamento));
        return condutorRepository.save(condutor);
    }

}
