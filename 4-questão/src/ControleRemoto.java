public class ControleRemoto {

    private Televisão Tv;

    public ControleRemoto ( Televisão tv ){
        Tv = new Televisão();
        Tv = tv;

    }

    public void AumentaVolume(){
        Tv.setVolume(Tv.getVolume()+1);
    }

    public void DiminuiVolume(){
        if (Tv.getVolume() <= 0){
            Tv.setVolume(0);
        }else{
            Tv.setVolume(Tv.getVolume()-1);
        }

    }

    public void AumentaCanal(){
        Tv.setCanal(Tv.getCanal()+1);
    }

    public void DiminuiCanal(){
        if (Tv.getCanal() <=1){
            Tv.setCanal(1);
        }else{
            Tv.setCanal(Tv.getCanal()-1);
        }

    }

    public void SelecCanal(int canal){
        if (canal <=0){
            Tv.setCanal(Tv.getCanal());
        }else{
            Tv.setCanal(canal);
        }

    }

    public void Display(){
        System.out.println("canal: " + Tv.getCanal());
        System.out.println("volume: " + Tv.getVolume());
    }
}
