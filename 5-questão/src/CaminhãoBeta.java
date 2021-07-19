import java.util.Vector;
public class CaminhãoBeta extends Caminhões{
    public int quantidade;
    //int capacidade_total;
    Pluviometro temp = new Pluviometro();
    private static Vector pluviometro = new Vector<Pluviometro>();

    //@Override
    public void construtor(int num) {
        this.quantidade= num;
    }

    //@Override
    public void inserePluviometro(Pluviometro novo) {
        if(pluviometro.size() == 0){
            temp = novo;
        }

        if (temp.getTipo() == novo.getTipo()){
            pluviometro.add(novo);
            setCapacidade_total(novo.getCapacidade());
        }else{
            System.out.println("o caminhão está cheio");
        }
        temp = novo;
    }

    public Vector getPluviometro() {
        return pluviometro;
    }
    //@Override
    public int getCapacidade_total() {
        return super.capacidade_total;
    }

}
