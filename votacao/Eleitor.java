public class Eleitor {

    private int titulo;
    private String nome;
    private boolean votou;

    public Eleitor(int titulo, String nome) {
        this.titulo = titulo;
        this.nome = nome;
        votou = false;
    }

    public boolean jaVotou() {
        return votou;
    }

    public boolean registrarParticipacao() {
        if (votou == false) {
            votou = true;
            return true;
        }

        return false;
    }

    public void exibirDados() {
        System.out.println(titulo + " - " + nome + " - Votou: " + votou);
    }
}