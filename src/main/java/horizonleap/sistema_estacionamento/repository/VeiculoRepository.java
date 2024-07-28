package horizonleap.sistema_estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import horizonleap.sistema_estacionamento.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo,Integer> {

}
