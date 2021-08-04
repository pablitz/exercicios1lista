import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class PessoaTratamento {

    Pessoa pessoa = new Pessoa();
    boolean valido= true;
    public PessoaTratamento(Pessoa nova_pessoa){
        pessoa =nova_pessoa;
        valida();
    }

    public PessoaTratamento() {

        //System.out.println("digite a data no formato yyyy-mm-dd");
        System.out.println("Digite o novo nome a ser adicionado na agenda");
        //Optional<String> nome2 = Optional.ofNullable(nome);
        Scanner scan = new Scanner(System.in);
        pessoa.setNome(Optional.ofNullable(scan.nextLine()).orElseGet(()->""));

        try{

            System.out.println("Digite a nova altura a ser adicionado na agenda");
            pessoa.setAltura(Optional.ofNullable(scan.nextDouble()).orElseGet(()-> -1.0));

        }catch (InputMismatchException ex){

            System.out.println("erro ao digitar altura:digite números por favor");

        }

        try{

            System.out.println("Digite a nova idade a ser adicionado na agenda");
            pessoa.setIdade(Optional.ofNullable(scan.nextInt()).orElseGet(()-> -1));


        }catch (InputMismatchException ex){

            System.out.println("erro ao digitar idade : digite números por favor");

        }
        //scan.close();
        valida();

    }



    public boolean getValido() {
        return this.valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public int getIdadeData(){


        LocalDate l = LocalDate.parse(pessoa.getData());
        LocalDate now = LocalDate.now(); //gets localDate
        Period diff = Period.between(l, now); //difference between the dates is calculated

        return diff.getYears();

    }

    void valida(){
        if (pessoa.getIdade() <=0 || pessoa.getNome().equals("") || pessoa.getAltura() <=0){

            setValido(false);
            return;
        }
        setValido(true);
    }


}
