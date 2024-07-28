
package horizonleap.sistema_estacionamento.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bilhete")

public class Bilhete {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private LocalDateTime timestampInicio;
    @Column
    private LocalDateTime timestampFim;
    @Column
    private String infoContato;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Veiculo veiculo;

}
