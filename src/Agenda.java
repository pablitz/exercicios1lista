import java.util.Vector;
public class Agenda {
    //private Pessoa pessoa;
    private static int total_pessoas=0;
    private static Vector pessoas = new Vector<Pessoa>();

    public void armazenaPessoa(String nome, int idade, float altura){

        Pessoa pessoa2 = new Pessoa(nome , altura, idade);


        adiciona(pessoa2);
    }

    public void imprimePessoa(int i){

        if (this.pessoas.get(i) != null ){
            Pessoa temp = (Pessoa) this.pessoas.get(i);
            temp.getDados();


        }


    }

    public void imprimeAgenda(){
        for(int i = 0 ; i< total_pessoas ;i++ ){
            imprimePessoa(i);

        }

    }

    public boolean adiciona(Pessoa pessoa){
        if (total_pessoas <=10 && buscaPessoa(pessoa.getNome() ) < 0){

            pessoas.add(total_pessoas, pessoa);

            total_pessoas++;

            return true;
        }else{

            System.out.println("A agenda está Cheia =( ou a pessoa já está na lista");

            return false;
        }


    }


    public static int buscaPessoa(String nome_busca) {
        // informa em que posição da agenda está a pessoa
        int position = -1;// se retornar negativo quer dizer que o nome nao consta na lista

        for (int i = 0; i < total_pessoas; i++) {



            Pessoa temp = (Pessoa) pessoas.get(i);

            if (temp.getNome().equals(nome_busca)) {

                position = i;

            }
        }

        return position;
    }



    public void removePessoa(String nome_busca){

        int index = buscaPessoa(nome_busca);

        if (index >=0){

            pessoas.remove(index);
            total_pessoas--;

        }else{

            System.out.println("pessoa não encontrada =(");



        }
    }


}
