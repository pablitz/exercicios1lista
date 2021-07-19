import java.util.Iterator;
import java.util.Vector;
public class ControleHerdeira extends Controle{

        int numero_de_pluviometros;
        String temp = "KEKW";

       // private static Vector caminhão = new Vector<Caminhão>();
        private static Vector caminhão = new Vector<Caminhões>();
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


        public int selecionaCaminhão(){
            int max=-1;
            int selec=0;
            //Iterator caminhões = caminhão.iterator();
            //class classe = caminhão.get(0).getClass();
            //classe caminhão1 = (classe) caminhão.get(0);
          //  Pluviometro cam = (Pluviometro) caminhão1.getPluviometro();
            for(int index=0; index < caminhão.size(); index++){

              Caminhões cam_temp = (Caminhões) this.caminhão.get(index);
              //System.out.println("lul :" + cam_temp.getClass());
              if(max < cam_temp.getCapacidade_total()){
                  //System.out.println("lul :" + cam_temp.getCapacidade_total());
                  max=cam_temp.getCapacidade_total();
                  selec= index;
              }
            }
            return selec;
        }
}
