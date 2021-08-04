public class CaminhãoServices {

    Caminhão caminhão;
    public CaminhãoServices(Caminhão caminhão){
        this.caminhão = caminhão;
    }

    public void inserePluviometro(Pluviometro novo) {
        if (caminhão.getPeso()+novo.getPeso() <15){
            caminhão.getPluviometro().add(novo);
            caminhão.setCapacidade_total(caminhão.getCapacidade_total()+novo.getCapacidade());
        }else{
            System.out.println("o caminhão está cheio");
        }
    }

}
