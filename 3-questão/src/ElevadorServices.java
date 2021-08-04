import java.math.BigDecimal;
import java.util.List;

public class ElevadorServices {

    Elevador elevador = new Elevador();
    List<Pessoa> temp = elevador.getPessoas();



    public  ElevadorServices(Elevador elevador){
       this.elevador= elevador;
   }

    public BigDecimal getPesoTotal(){
       return  elevador.getPessoas().stream().map(s-> s.getPeso()).reduce(BigDecimal.ZERO,BigDecimal::add);
    }

    public void Entra(){

        if(this.elevador.getQtd_de_pessoas() < this.elevador.getCapacidade()){
            this.elevador.setQtd_de_pessoas(this.elevador.getQtd_de_pessoas() + 1);
        }else {
            System.out.println("o elevador está cheio");
        }

    }



    public void EntraPeso(Pessoa pessoa){

        if(getPesoTotal().add(pessoa.getPeso()).compareTo(elevador.getPeso_max()) <=0){
                temp.add(pessoa);
                elevador.setPessoas(temp);
        }else {
            System.out.println("o elevador está cheio");
        }

    }

    public void SaiPessoa(Pessoa pessoa){

        if(temp.contains(pessoa)){
            temp.remove(pessoa);
        }else{
            System.out.println("pessoa não está no elevador");
        }



    }

    public void Sai(){
        if( this.elevador.getQtd_de_pessoas() > 0){
            this.elevador.setQtd_de_pessoas(this.elevador.getQtd_de_pessoas() - 1);
        }else {
            System.out.println("o elevador está vazio");
        }
    }

    public void Sobe(){
        if(elevador.getAndar_atual() <elevador.getAndar_total()){
            elevador.setAndar_atual(this.elevador.getAndar_atual()+ 1 );
        }else{
            System.out.println("o elevador está no ultimo andar");
        }
    }

    public void Desce(){
        if(elevador.getAndar_atual() >0){
            elevador.setAndar_atual(this.elevador.getAndar_atual()+ -1 );
        }else{
            System.out.println("o elevador está no ultimo terreo");
        }
    }


}
