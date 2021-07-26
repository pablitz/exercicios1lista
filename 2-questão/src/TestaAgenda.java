import java.math.BigDecimal;

public class TestaAgenda {

    public static void main(String[] args) {
        //Pessoa jack = new PessoaTratamento( );
        Pessoa jackson = new PessoaTratamento( );
        Pessoa Dio = new PessoaTratamento();
        AgendaTratamento agenda = new AgendaTratamento();

        agenda.armazenaPessoa("jack",25,1.80);

        agenda.armazenaPessoa(jackson);

        agenda.armazenaPessoa(Dio);

        agenda.imprimeAgenda();

        //agenda.adiciona(jack);

        //System.out.println(agenda.buscaPessoa("jack"));

        //agenda.removePessoa("jack");

        //agenda.adiciona(jack);



        //agenda.imprimePessoa(1);



        //System.out.println(agenda.buscaPessoa("Dio"));
       // System.out.println(agenda.buscaPessoa("HEHEXD"));
        //agenda.removePessoa("jack");
        //agenda.removePessoa("jack");
    }


}
