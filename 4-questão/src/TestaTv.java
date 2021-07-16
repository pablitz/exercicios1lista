public class TestaTv {
    public static void main(String[] args) {
        Televisão tv = new Televisão();

        ControleRemoto controleRemoto = new ControleRemoto(tv);

        controleRemoto.AumentaCanal();
        controleRemoto.AumentaVolume();
        controleRemoto.Display();
        controleRemoto.DiminuiCanal();
        controleRemoto.DiminuiVolume();
        controleRemoto.Display();
        controleRemoto.SelecCanal(32);
        controleRemoto.Display();
        controleRemoto.SelecCanal(-50);
        controleRemoto.DiminuiVolume();
        controleRemoto.DiminuiVolume();
        controleRemoto.DiminuiVolume();
        controleRemoto.Display();
        controleRemoto.SelecCanal(1);
        controleRemoto.Display();
        controleRemoto.DiminuiCanal();
        controleRemoto.DiminuiCanal();
        controleRemoto.DiminuiCanal();
        controleRemoto.Display();


    }

}
