public class Funcionario {
    int matricula;
    String area;
    double salario;
    String cargo;
    String email;
    int telefone;

    public Funcionario(int matricula, String area, double salario, String cargo, String email, int telefone){
        this.matricula = matricula;
        this.area = area;
        this.salario = salario;
        this.cargo = cargo;
        this.email = email;
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
                ", telefone=" + telefone +
                '}';
    }
}
