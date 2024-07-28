package horizonleap.sistema_estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import horizonleap.sistema_estacionamento.model.Bilhete;

public interface BilheteRepository extends JpaRepository<Bilhete,Integer>{

}
