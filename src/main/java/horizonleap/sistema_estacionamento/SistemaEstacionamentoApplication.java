package horizonleap.sistema_estacionamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SistemaEstacionamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaEstacionamentoApplication.class, args);
	}

}
