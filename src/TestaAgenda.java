public class TestaAgenda {

    public static void main(String[] args) {
        Pessoa jack = new Pessoa("jack", 1.80, 25 );
        Pessoa jackson = new Pessoa("jackson", 1.80, 25 );
        Pessoa Dio = new Pessoa("Dio", 1.80, 25 );
        Agenda agenda = new Agenda();

        agenda.adiciona(jack);

        agenda.adiciona(jackson);

        agenda.adiciona(jack);

        System.out.println(agenda.buscaPessoa("jackson"));

        agenda.removePessoa("jack");

        agenda.adiciona(jack);

        agenda.adiciona(Dio);

        agenda.imprimePessoa(1);

        agenda.imprimeAgenda();
    }


}
