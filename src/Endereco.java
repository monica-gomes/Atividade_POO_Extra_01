public class Endereco {
    int cep;
    String cidade;
    String bairro;
    String logradouro;
    int numero;
    String estado;
    String complemento;

    Endereco(int cep, String cidade, String bairro, String logradouro, int numero, String estado, String complemento){
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.estado = estado;
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep=" + cep +
                ", cidade=" + cidade +
                ", bairro=" + bairro +
                ", logradouro=" + logradouro +
                ", numero=" + numero +
                ", estado=" + estado +
                ", complemento=" + complemento +
                '}';
    }
}
