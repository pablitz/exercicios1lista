import java.util.List;
import java.util.stream.IntStream;

public class AgendaTratamento  {


    Agenda agenda = new Agenda();
    List<Pessoa> pessoas = agenda.getPessoas();
    public void armazenaPessoa(String nome, int idade, Double altura){
        Pessoa pessoa = new Pessoa(nome, altura, idade);
        PessoaTratamento pessoaT=new PessoaTratamento(pessoa);

        if (this.pessoas.size()<10
                && !pessoas.contains(pessoa)
                && pessoaT.getValido()){
            pessoas.add(pessoa);
            agenda.setPessoas(pessoas);
            return;
        }
        System.out.println("A agenda está Cheia =( ou a pessoa já está na lista ou nome nulo");

    }

    public void armazenaPessoa(Pessoa pessoa){

        PessoaTratamento pessoaT=new PessoaTratamento(pessoa);

        if (this.pessoas.size()<10
                && !pessoas.contains(pessoa)
                && pessoaT.getValido()){
            pessoas.add(pessoa);
            agenda.setPessoas(pessoas);
            return;
        }
        System.out.println("A agenda está Cheia =( ou a pessoa já está na lista ou nome nulo");

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




    public int buscaPessoa(String nome_busca) {


        return  IntStream.range(0, this.pessoas.size())
                .filter(i -> this.pessoas.get(i).getNome().equals(nome_busca))
                .findFirst()
                .orElse(-1);

    }



    public void removePessoa(String nome_busca){
        try{
            this.pessoas.remove(buscaPessoa(nome_busca));
            agenda.setPessoas(pessoas);
        }catch(IndexOutOfBoundsException ex){
            System.out.println("A pessoa não está na lista");
        }

    }



}
