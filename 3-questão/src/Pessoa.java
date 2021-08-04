import java.math.BigDecimal;

public class Pessoa {
    private BigDecimal peso;
    private String nome;

    public Pessoa(BigDecimal peso,String nome){
        this.nome = nome;
        this.peso = peso;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}