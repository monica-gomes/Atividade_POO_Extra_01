public class Cliente {
    String nomeCompleto;
    String dataDeNascimento;
    String cpf;
    int senha;
    String email;
    int ddd;
    int telefone;

    Cliente(String nomeCompleto, String dataDeNascimento, String cpf, int senha, String email, int ddd, int telefone){
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.senha = senha;
        this.email = email;
        this.ddd = ddd;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", cpf='" + cpf + '\'' +
                ", senha=" + senha +
                ", email='" + email + '\'' +
                ", ddd=" + ddd +
                ", telefone=" + telefone +
                '}';
    }
}

