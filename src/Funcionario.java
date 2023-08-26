public class Funcionario {
    int matricula;
    String area;
    double salario;
    String cargo;
    String email;
    int ddd;
    int telefone;

    public Funcionario(int matricula, String area, double salario, String cargo, String email, int ddd, int telefone){
        this.matricula = matricula;
        this.area = area;
        this.salario = salario;
        this.cargo = cargo;
        this.email = email;
        this.ddd = ddd;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", area='" + area + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                ", email='" + email + '\'' +
                ", ddd=" + ddd +
                ", telefone=" + telefone +
                '}';
    }
}
