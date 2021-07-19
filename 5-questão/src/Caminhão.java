import java.util.Vector;
public interface Caminhão {

    public static Vector pluviometro = new Vector<Pluviometro>();


    Vector getPluviometro();

    public int getCapacidade_total();

    public void construtor(int num);

    public void inserePluviometro ( Pluviometro x);

}
