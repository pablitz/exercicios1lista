import java.math.BigDecimal;

public class TestaElevador {

    public static void main(String[] args) {

    Elevador elevador = new Elevador();
    elevador.inicializa(10,15);
    ElevadorServices elevadorServices = new ElevadorServices(elevador);
    Pessoa pessoa1 = new Pessoa(new BigDecimal(80),"a");
    Pessoa pessoa2 = new Pessoa(new BigDecimal(80),"b");
    Pessoa pessoa4 = new Pessoa(new BigDecimal(80),"c");
    Pessoa pessoa5 = new Pessoa(new BigDecimal(80),"d");
    Pessoa pessoa6 = new Pessoa(new BigDecimal(80),"e");
    Pessoa pessoa7 = new Pessoa(new BigDecimal(80),"f");
    Pessoa pessoa8 = new Pessoa(new BigDecimal(720),"g");

    elevadorServices.EntraPeso(pessoa8);
    elevadorServices.EntraPeso(pessoa1);
    elevadorServices.EntraPeso(pessoa2);
    elevadorServices.SaiPessoa(pessoa8);
    }

}
