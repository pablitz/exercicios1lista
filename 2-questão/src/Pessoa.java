import java.time.LocalDate;
import java.time.Period;
import java.math.BigDecimal;
import java.util.Optional;
import java.util.Scanner;

public class Pessoa {

    private String nome;
    private Double altura;
    private String data = "1999-05-03" ;
    private int idade;
    boolean valido;

    public boolean getValido() {
        return this.valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public String getNome() {
        return this.nome;
    }

    public Double getAltura() {
        return this.altura;
    }

    public String getData() {
        return this.data;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(Double altura) {
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
        //System.out.println("A data de nascimento é : " + getData());
        System.out.println("A pessoa é um individuo valido : " + getValido());

    }

}
