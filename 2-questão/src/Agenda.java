
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Agenda {
    //private Pessoa pessoa;
    private static List<Pessoa> pessoas = new ArrayList<Pessoa>();
    ;

    public static List<Pessoa> getPessoas() {
        return pessoas;
    }

    public static void setPessoas(List<Pessoa> pessoas) {
        Agenda.pessoas = pessoas;
    }


/**
    public void armazenaPessoa(String nome, int idade, Double altura){
        adiciona(new PessoaTratamento(nome , altura, idade));
    }



    public void imprimeAgenda(){
      this.pessoas.forEach(s -> s.getDados());

    }
    public void imprimePessoa(int i){
        try{
            this.pessoas.get(i).getDados();
        }catch (IndexOutOfBoundsException ex){
            System.out.println("A pessoa não está na lista");
        }

    }


    public void adiciona(Pessoa pessoa){



        if (this.pessoas.size()<10
                && !pessoas.contains(pessoa)
                && pessoa.getValido()){
            pessoas.add(pessoa);
            return;
        }
            System.out.println("A agenda está Cheia =( ou a pessoa já está na lista ou nome nulo");

    }


    public int buscaPessoa(String nome_busca) {
        //int[] position = {-1};
        //int a;


        return  IntStream.range(0, this.pessoas.size())
                .filter(i -> this.pessoas.get(i).getNome().equals(nome_busca))
                .findFirst()
                .orElse(-1);

    }



    public void removePessoa(String nome_busca){
        try{
            this.pessoas.remove(buscaPessoa(nome_busca));
        }catch(IndexOutOfBoundsException ex){
            System.out.println("A pessoa não está na lista");
        }

    }
    */

}
