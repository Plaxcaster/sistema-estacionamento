
package horizonleap.sistema_estacionamento.model;

import horizonleap.sistema_estacionamento.enums.MetodoPagamento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "condutor")

public class Condutor {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;
    @Column
    private String endereco;
    @Column
    private String infoContato;
    @Column
    MetodoPagamento metodoFavorito;


    public Condutor() {
    }

    public Condutor(String nome, String endereco, String infoContato, MetodoPagamento metodoFavorito) {
        this.nome = nome;
        this.endereco = endereco;
        this.infoContato = infoContato;
        this.metodoFavorito = metodoFavorito;
    }

    public MetodoPagamento getMetodoFavorito() {
        return metodoFavorito;
    }

    public void setMetodoFavorito(MetodoPagamento metodoFavorito) {
        this.metodoFavorito = metodoFavorito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getInfoContato() {
        return infoContato;
    }

    public void setInfoContato(String infoContato) {
        this.infoContato = infoContato;
    }
}
