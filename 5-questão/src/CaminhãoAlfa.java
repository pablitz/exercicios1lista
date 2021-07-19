import java.util.Vector;

public class CaminhãoAlfa extends Caminhões{
    public int quantidade;
    private static Vector pluviometro = new Vector<Pluviometro>();
    int peso;
    //int capacidade_total;
    //@Override
    public void construtor(int num) {
        this.quantidade =num;
    }

    //@Override
    public void inserePluviometro(Pluviometro novo) {
        if (peso+novo.getPeso() <15){
            pluviometro.add(novo);
            setCapacidade_total(novo.getCapacidade());
        }else{
            System.out.println("o caminhão está cheio");
        }
    }

    public Vector getPluviometro() {
        return pluviometro;
    }
    //@Override
    public int getCapacidade_total() {
        return super.capacidade_total;
    }
}
