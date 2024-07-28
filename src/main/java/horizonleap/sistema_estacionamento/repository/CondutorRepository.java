package horizonleap.sistema_estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import horizonleap.sistema_estacionamento.model.Condutor;

@Repository
public interface CondutorRepository extends JpaRepository<Condutor,Integer>{

}
