public class TestaControle {

    public static void main(String[] args){

        ControleHerdeira controleHerdeira = new ControleHerdeira();
        Controle controle = new Controle();
        ControleHerdeira2 controleHerdeira2= new ControleHerdeira2();
        controleHerdeira2.listaCaminhão();
        System.out.println("o caminhão selecionado foi o de número :" );
        controleHerdeira2.selecionaCaminhão();


    }

}
