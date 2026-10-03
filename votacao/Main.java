public class Main {

    public static void main(String[] args) {

        Candidato candidato1 = new Candidato(10, "Ana");
        Candidato candidato2 = new Candidato(20, "Bruno");
        Candidato candidato3 = new Candidato(30, "Carla");

        Eleitor eleitor1 = new Eleitor(1001, "Joao");
        Eleitor eleitor2 = new Eleitor(1002, "Maria");
        Eleitor eleitor3 = new Eleitor(1003, "Pedro");
        Eleitor eleitor4 = new Eleitor(1004, "Luisa");
        Eleitor eleitor5 = new Eleitor(1005, "Rafael");

        Urna urna = new Urna();

        // Votos válidos
        System.out.println(urna.registrarVoto(eleitor1, candidato1));
        System.out.println(urna.registrarVoto(eleitor2, candidato2));
        System.out.println(urna.registrarVoto(eleitor3, candidato3));
        System.out.println(urna.registrarVoto(eleitor4, candidato1));
        System.out.println(urna.registrarVoto(eleitor5, candidato2));

        // Tentando votar novamente
        System.out.println("João votando novamente:");
        System.out.println(urna.registrarVoto(eleitor1, candidato3));

        // Encerrando a votação
        urna.encerrarVotacao();

        // Tentando votar depois de encerrar
        System.out.println("Maria votando depois do encerramento:");
        System.out.println(urna.registrarVoto(eleitor2, candidato3));

        // Resultado
        urna.exibirResultado(candidato1, candidato2, candidato3);
    }
}