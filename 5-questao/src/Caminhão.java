import java.util.ArrayList;
import java.util.List;

public class Caminhão {

    public int quantidade;
    private static List<Pluviometro> pluviometro = new ArrayList<Pluviometro>();
    int peso;
    protected int capacidade_total;
    String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static List<Pluviometro> getPluviometro() {
        return pluviometro;
    }

    public static void setPluviometro(List<Pluviometro> pluviometro) {
        Caminhão.pluviometro = pluviometro;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCapacidade_total() {
        return capacidade_total;
    }

    public void setCapacidade_total(int capacidade_total) {
        this.capacidade_total = capacidade_total;
    }


}
