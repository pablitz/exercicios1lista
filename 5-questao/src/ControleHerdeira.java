import java.util.*;

public class ControleHerdeira extends Controle{

    int numero_de_pluviometros;
    String temp = "KEKW";

    // private static Vector caminhão = new Vector<Caminhão>();
    private static List<Caminhões> caminhão = new ArrayList<Caminhões>();
    Pluviometro novo_pluviometro = new Pluviometro();

    public void listaCaminhão(){
        while (!temp.equals("fim")){



            System.out.println("digite o tipo do caminhão");

            this.temp = leString();



            if ( this.temp.equals("Alfa")){

                CaminhãoAlfa caminhão_temp = new CaminhãoAlfa();

                System.out.println("tipo do caminhão  escolhido : "+ temp);

                System.out.println("digite o numero de pluviometros");

                this.numero_de_pluviometros = leInt();

                caminhão_temp.quantidade = numero_de_pluviometros;

                for(int i= 0 ; i < caminhão_temp.quantidade; i++ ){

                    System.out.println("digite  tipo do pluviometro de número: " + i);

                    novo_pluviometro.setTipo(leString());

                    caminhão_temp.inserePluviometro(novo_pluviometro);

                }

                caminhão.add(caminhão_temp);

            }else if (this.temp.equals("Beta")){

                CaminhãoBeta caminhão_temp = new CaminhãoBeta();

                System.out.println("tipo do caminhão  escolhido :"+temp);

                System.out.println("digite o numero de pluviometros");

                this.numero_de_pluviometros = leInt();




                caminhão_temp.quantidade = numero_de_pluviometros;

                for(int i= 0 ; i < caminhão_temp.quantidade; i++ ){

                    System.out.println("digite  tipo do pluviometro de número: " + i);

                    novo_pluviometro.setTipo(leString());

                    caminhão_temp.inserePluviometro(novo_pluviometro);



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

        Caminhões selecionado =  caminhão.stream().max(Comparator.comparing(Caminhões::getCapacidade_total)).orElse(new Caminhões());
        System.out.println("tipo :" + selecionado.getClass());

    }
}