package horizonleap.sistema_estacionamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import horizonleap.sistema_estacionamento.enums.MetodoPagamento;
import horizonleap.sistema_estacionamento.model.Condutor;
import horizonleap.sistema_estacionamento.repository.CondutorRepository;

@Service
public class CondutorService {
    @Autowired
    private CondutorRepository condutorRepository;

    public Condutor save(String nome, String endereco, String infoContato, MetodoPagamento metodoPagamento) {
        var condutor = new Condutor(nome, endereco, infoContato, metodoPagamento);

        return condutorRepository.save(condutor);
    }

    public Condutor busca(int id_condutor) {
        return condutorRepository.getReferenceById(id_condutor);
    }

}
