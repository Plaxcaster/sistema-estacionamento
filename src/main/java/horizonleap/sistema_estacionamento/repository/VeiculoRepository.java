package horizonleap.sistema_estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import horizonleap.sistema_estacionamento.model.Condutor;
import horizonleap.sistema_estacionamento.model.Veiculo;
import java.util.List;


@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo,Integer> {
    List<Veiculo> findByCondutor(Condutor condutor);

}
