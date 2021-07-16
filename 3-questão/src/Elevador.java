public class Elevador {

    private int Andar_atual=0;
    private int Andar_total;
    private int Capacidade;
    private int Qtd_de_pessoas=0;

    public int getAndar_atual() {
        return Andar_atual;
    }

    public void setAndar_atual(int andar_atual) {
        Andar_atual = andar_atual;
    }

    public int getAndar_total() {
        return Andar_total;
    }

    public void setAndar_total(int andar_total) {
        Andar_total = andar_total;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int capacidade) {
        Capacidade = capacidade;
    }

    public int getQtd_de_pessoas() {
        return Qtd_de_pessoas;
    }

    public void setQtd_de_pessoas(int qtd_de_pessoas) {
        Qtd_de_pessoas = qtd_de_pessoas;
    }

    public void inicializa(int capacidade, int andar_total ){
            setCapacidade(capacidade);
            setAndar_total(andar_total);
    }

    public void Entra(){

        if( Qtd_de_pessoas < Capacidade){
            setQtd_de_pessoas(Qtd_de_pessoas + 1);
        }else {
            System.out.println("o elevador está cheio");
        }

    }

    public void Sai(){
        if( Qtd_de_pessoas > 0){
            setQtd_de_pessoas(Qtd_de_pessoas - 1);
        }else {
            System.out.println("o elevador está vazio");
        }
    }

    public void Sobe(){
        if(Andar_atual <Andar_total){
            setAndar_atual(this.Andar_atual + 1 );
        }else{
            System.out.println("o elevador está no ultimo andar");
        }
    }

    public void Desce(){
        if(Andar_atual >0){
            setAndar_atual(this.Andar_atual - 1);
        }else{
            System.out.println("o elevador está no terreo");
        }
    }

}
