public class Banco {
    int numeroDoBanco;
    String nome;
    int agencia;

    Banco(int numeroDoBanco, String nome, int agencia){
        this.numeroDoBanco = numeroDoBanco;
        this.nome = nome;
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "numeroDoBanco=" + numeroDoBanco +
                ", nome='" + nome + '\'' +
                ", agencia=" + agencia +
                '}';
    }
}
