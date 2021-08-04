import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CaminhãoAlfa extends Caminhões{
    public int quantidade;
    private static List<Pluviometro> pluviometro = new ArrayList<Pluviometro>();
    int peso;
    public void construtor(int num) {
        this.quantidade =num;
    }


    public void inserePluviometro(Pluviometro novo) {
        if (peso+novo.getPeso() <15){
            pluviometro.add(novo);
            setCapacidade_total(novo.getCapacidade());
        }else{
            System.out.println("o caminhão está cheio");
        }
    }

    public List<Pluviometro> getPluviometro() {
        return pluviometro;
    }
    public int getCapacidade_total() {
        return super.capacidade_total;
    }
}
