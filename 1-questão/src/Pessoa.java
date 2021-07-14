import java.time.LocalDate;
import java.time.Period;


public class Pessoa {

    private String nome;
    private double altura;
    private String data;

    public Pessoa(String nome, double altura ,String data) {
        System.out.println("digite a data no formato yyyy-mm-dd");
        this.nome = nome;
        this.altura = altura;
        this.data = data;

    }





    public int getIdade(){


        LocalDate l = LocalDate.parse(this.data);

        LocalDate now = LocalDate.now(); //gets localDate
        Period diff = Period.between(l, now); //difference between the dates is calculated

        return diff.getYears();

    }

    public String getNome() {
        return this.nome;
    }

    public double getAltura() {
        return this.altura;
    }

    public String getData() {
        return this.data;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void getDados(){
        System.out.println("O nome é : " + getNome() );
        System.out.println("A idade é : " + getIdade()+ " anos");
        System.out.println("A altura é : " + getAltura()+ " metros");
        System.out.println("A data de nascimento é : " + getData());
    }

}
