public class Main {
    public static void main(String[] args) {

        Banco bancoUm = new Banco(111, "UM BANCO", 433);
        System.out.println(bancoUm);

        Endereco enderecoBanco = new Endereco(67543209,  "Recife", "Boa Vista", "Av. Conde da Boa Vista", 456, "Pernambuco", "N/A");
        System.out.println(enderecoBanco);

        Funcionario novoFuncionario1 = new Funcionario(233456,"Adm", 500.00, "Analista", "nome@email.com", 987654321);
        System.out.println(novoFuncionario1);

        Cliente novoCliente1 = new Cliente("Mônica Gomes", "13/10/000", "12345678901", 1234, "nome@emial.com", 819345678);
        System.out.println(novoCliente1);

        Conta novaConta1 = new Conta(12345, 500.00, 800.00, 300.00, 5000.00);
        System.out.println(novaConta1);
        }
}