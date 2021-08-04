import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Elevador {

    private int Andar_atual;
    private int Andar_total;
    private static List<Pessoa> pessoas = new ArrayList<Pessoa>();
    private int Capacidade;
    private BigDecimal peso_max;
    private int Qtd_de_pessoas;

    public static List<Pessoa> getPessoas() {
        return pessoas;
    }

    public BigDecimal getPeso_max() {
        return peso_max;
    }

    public void setPeso_max(BigDecimal peso_max) {
        this.peso_max = peso_max;
    }

    public static void setPessoas(List<Pessoa> pessoas) {
        Elevador.pessoas = pessoas;
    }



    public int getAndar_atual() {
        return Andar_atual;
    }

    public void setAndar_atual(int andar_atual) {
        Andar_atual = andar_atual;
    }

    public int getAndar_total() {
        return Andar_total;
    }

    public void setAndar_total(int andar_total) {
        Andar_total = andar_total;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int capacidade) {
        Capacidade = capacidade;
    }

    public int getQtd_de_pessoas() {return Qtd_de_pessoas; }

    public void setQtd_de_pessoas(int qtd_de_pessoas) {
        Qtd_de_pessoas = qtd_de_pessoas;
    }

    public void inicializa(int capacidade, int andar_total ){
            setCapacidade(capacidade);
            setAndar_total(andar_total);
            setPeso_max(new BigDecimal(capacidade*80));
    }



}
