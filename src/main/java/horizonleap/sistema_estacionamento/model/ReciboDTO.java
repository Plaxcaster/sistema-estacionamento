package horizonleap.sistema_estacionamento.model;

import java.math.BigDecimal;

public record ReciboDTO(
    String nomeCondutor,
    String placaCarro,
    long tempoEstacionado,
    String tarifaAplicada,
    BigDecimal valorTotal
) {

}
