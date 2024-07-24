package horizonleap.sistema_estacionamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import horizonleap.sistema_estacionamento.model.Cliente;
import horizonleap.sistema_estacionamento.repository.clienteRepository;

@Service
public class clienteService {
    @Autowired
    private clienteRepository clienteRepo;

    public Cliente salvar(String nome){
        var cliente = new Cliente();
        cliente.setnome(nome);

        return clienteRepo.save(cliente);
    }

}
