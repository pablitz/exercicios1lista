import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class PessoaTratamento extends Pessoa{

    public PessoaTratamento(String nome, Double altura , String data){
        setNome(Optional.ofNullable(nome).orElseGet(()->"nome nulo"));
        try{


            setAltura(Optional.ofNullable(altura).orElseGet(()-> -1.0));

        }catch (InputMismatchException ex){

            System.out.println("erro ao digitar altura:digite números por favor");

        }

        try{


            setData(Optional.ofNullable(data).orElseGet(()-> ""));
            setIdade(getIdadeData());

        }catch (InputMismatchException ex){

            System.out.println("erro ao digitar idade : digite números por favor");

        }
        valida();
    }

    public PessoaTratamento() {
        //System.out.println("digite a data no formato yyyy-mm-dd");
        System.out.println("Digite o novo nome a ser adicionado na agenda");
        //Optional<String> nome2 = Optional.ofNullable(nome);
        Scanner scan = new Scanner(System.in);
        setNome(Optional.ofNullable(scan.nextLine()).orElseGet(()->""));

        try{

            System.out.println("Digite a nova altura a ser adicionado na agenda");
            setAltura(Optional.ofNullable(scan.nextDouble()).orElseGet(()-> -1.0));

        }catch (InputMismatchException ex){

            System.out.println("erro ao digitar altura:digite números por favor");

        }

        try{

            System.out.println("Digite a nova data de nascimento a ser adicionado na agenda");
            setData(Optional.ofNullable(scan.nextLine()).orElseGet(()-> ""));
            setIdade(getIdadeData());

        }catch (InputMismatchException ex){

            System.out.println("erro ao digitar idade : digite números por favor");

        }
        //scan.close();
        valida();

    }

    public int getIdadeData(){


        LocalDate l = LocalDate.parse(getData());
        LocalDate now = LocalDate.now(); //gets localDate
        Period diff = Period.between(l, now); //difference between the dates is calculated

        return diff.getYears();

    }

    void valida(){
        if (getIdade() <=0 || getNome().equals("") || getAltura() <=0){
            setValido(false);
            return;
        }
        setValido(true);
    }


}
