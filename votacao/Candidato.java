public class Candidato {

    private int numero;
    private String nome;
    private int quantidadeDeVotos;

    public Candidato(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        quantidadeDeVotos = 0;
    }

    public void receberVoto() {
        quantidadeDeVotos++;
    }

    public int getQuantidadeDeVotos() {
        return quantidadeDeVotos;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void exibirResultado() {
        System.out.println(nome + " - " + quantidadeDeVotos + " votos");
    }
}