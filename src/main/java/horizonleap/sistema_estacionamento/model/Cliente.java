package horizonleap.sistema_estacionamento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String nome;
    
    public void setnome(String nome) {
        this.nome = nome;
    }
}
