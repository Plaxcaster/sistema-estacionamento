
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private LocalDateTime timestampInicio;
    public void setTimestampInicio(LocalDateTime timestampInicio) {
        this.timestampInicio = timestampInicio;
    }

    public void setTimestampFim(LocalDateTime timestampFim) {
        this.timestampFim = timestampFim;
    }

    @Column
    private LocalDateTime timestampFim;
    @Column
    private String infoContato;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Veiculo veiculo;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the timestampInicio
     */
    public LocalDateTime getTimestampInicio() {
        return timestampInicio;
    }

    

    /**
     * @return the timestampFim
     */
    public LocalDateTime getTimestampFim() {
        return timestampFim;
    }

    /**
     * @return the infoContato
     */
    public String getInfoContato() {
        return infoContato;
    }

    /**
     * @return the veiculo
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }


}
