package horizonleap.sistema_estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import horizonleap.sistema_estacionamento.model.Cliente;

@Repository
public interface clienteRepository extends JpaRepository<Cliente, Integer> {

}
