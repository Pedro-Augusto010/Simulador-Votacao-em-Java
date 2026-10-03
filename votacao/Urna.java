public class Urna {

    private boolean encerrada;
    private int totalDeVotos;

    public Urna() {
        encerrada = false;
        totalDeVotos = 0;
    }

    public boolean registrarVoto(Eleitor eleitor, Candidato candidato) {

        if (encerrada == true) {
            return false;
        }

        if (eleitor == null || candidato == null) {
            return false;
        }

        if (eleitor.jaVotou() == true) {
            return false;
        }

        candidato.receberVoto();
        eleitor.registrarParticipacao();
        totalDeVotos++;

        return true;
    }

    public void encerrarVotacao() {
        encerrada = true;
    }

    public int getTotalDeVotos() {
        return totalDeVotos;
    }

    public void exibirResultado(
            Candidato candidato1,
            Candidato candidato2,
            Candidato candidato3) {

        System.out.println("\nRESULTADO:");

        candidato1.exibirResultado();
        candidato2.exibirResultado();
        candidato3.exibirResultado();

        System.out.println("Total de votos: " + totalDeVotos);

        int votos1 = candidato1.getQuantidadeDeVotos();
        int votos2 = candidato2.getQuantidadeDeVotos();
        int votos3 = candidato3.getQuantidadeDeVotos();

        if (votos1 > votos2 && votos1 > votos3) {
            System.out.println("Vencedor: " + candidato1.getNome());
        } else if (votos2 > votos1 && votos2 > votos3) {
            System.out.println("Vencedor: " + candidato2.getNome());
        } else if (votos3 > votos1 && votos3 > votos2) {
            System.out.println("Vencedor: " + candidato3.getNome());
        } else {
            System.out.println("Houve empate!");
        }
    }
}