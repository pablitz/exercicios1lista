import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private double altura;
    private String data = "1999-05-03" ;
    private int idade;

    public Pessoa(String nome, double altura , int idade) {
        //System.out.println("digite a data no formato yyyy-mm-dd");
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;

    }





    public int getIdadeData(){

        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern(this.data);
        //formatter =  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);  // Locale specifies human language for translating, and cultural norms for lowercase/uppercase and abbreviations and such. Example: Locale.US or Locale.CANADA_FRENCH
        LocalDate l = LocalDate.parse(this.data);

        LocalDate now = LocalDate.now(); //gets localDate
        Period diff = Period.between(l, now); //difference between the dates is calculated
        //System.out.println(diff.getYears() + " years " + diff.getMonths() + " months " + diff.getDays() + " days ");
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

    public void setIdade(int idade){ this.idade = idade; }

    public int getIdade(){ return this.idade; }

    public void getDados(){
        System.out.println("O nome é : " + getNome() );
        System.out.println("A idade é : " + getIdade()+ " anos");
        System.out.println("A altura é : " + getAltura()+ " metros");
        System.out.println("A data de nascimento é : " + getData());
    }

}
