public class TestaElevador {

    public static void main(String[] args) {
        Elevador elevador = new Elevador();

        elevador.inicializa(3,5);
        System.out.println(elevador.getAndar_atual());
        elevador.Sobe();
        System.out.println(elevador.getAndar_atual());
        elevador.Desce();
        elevador.Desce();
        System.out.println(elevador.getAndar_atual());

        elevador.Sobe();
        elevador.Sobe();
        elevador.Sobe();
        elevador.Sobe();
        elevador.Sobe();
        System.out.println(elevador.getAndar_atual());
        elevador.Sobe();
        System.out.println(elevador.getAndar_atual());

        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        System.out.println(elevador.getQtd_de_pessoas());
        elevador.Entra();
        System.out.println(elevador.getQtd_de_pessoas());

        elevador.Sai();
        elevador.Sai();
        elevador.Sai();
        System.out.println(elevador.getQtd_de_pessoas());
        elevador.Sai();
        System.out.println(elevador.getQtd_de_pessoas());

    }

}
