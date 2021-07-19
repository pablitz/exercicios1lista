public class TestaControle {

    public static void main(String[] args){

        ControleHerdeira controleHerdeira = new ControleHerdeira();
        Controle controle = new Controle();
        controleHerdeira.listaCaminhão();
        System.out.println("o caminhão selecionado foi o de número :" + controleHerdeira.selecionaCaminhão());


    }

}
