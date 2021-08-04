import java.math.BigDecimal;

public class TestaAgenda {

    public static void main(String[] args) {
        Pessoa jack = new Pessoa("jack",1.80,25 );
        Pessoa jackson = new Pessoa("jackson",1.80,25);
        Pessoa Dio = new Pessoa("dio",1.80,24);
        AgendaTratamento agenda = new AgendaTratamento();

        agenda.armazenaPessoa(Dio);

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
