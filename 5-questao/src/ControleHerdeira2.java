import java.util.*;

public class ControleHerdeira2 extends Controle{

    int numero_de_pluviometros;
    String temp = "KEKW";

    // private static Vector caminhão = new Vector<Caminhão>();
    private static List<Caminhão> caminhão = new ArrayList<Caminhão>();
    Pluviometro novo_pluviometro = new Pluviometro();

    public void listaCaminhão(){
        while (!temp.equals("fim")){

            System.out.println("digite o tipo do caminhão");

            this.temp = leString();

            if(temp.equals("Alfa") || temp.equals("Beta")){

            Caminhão caminhão_temp = new Caminhão();

            caminhão_temp.setTipo(temp);

            System.out.println("tipo do caminhão  escolhido : "+ temp);

            System.out.println("digite o numero de pluviometros");

            this.numero_de_pluviometros = leInt();

            caminhão_temp.quantidade = numero_de_pluviometros;

            CaminhãoServices caminhão_temp_service = new CaminhãoServices(caminhão_temp);

            for(int i= 0 ; i < caminhão_temp.quantidade; i++ ){

                System.out.println("digite  tipo do pluviometro de número: " + i);

                novo_pluviometro.setTipo(leString());

                caminhão_temp_service.inserePluviometro(novo_pluviometro);

            }

                caminhão.add(caminhão_temp);

            }else if (this.temp == "fim"){

                return;

            }else{

                System.out.println("tipo de caminhão indisponivel");

            }


        }

    }


    public void selecionaCaminhão(){

        Caminhão selecionado =  caminhão.stream().max(Comparator.comparing(Caminhão::getCapacidade_total)).orElse(new Caminhão());
        System.out.println("tipo :" + selecionado.getTipo());
        System.out.println("Capacidade :" + selecionado.getCapacidade_total());
    }
}