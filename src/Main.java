public class Main {
    public static void main(String[] args) {

        Banco bancoUm = new Banco(111, "UM BANCO", 433);
        System.out.println(bancoUm);

        bancoUm.agencia = 789;
        System.out.println(bancoUm);

        Banco umBanco = new Banco(111, "UM BANCO", 584);
        System.out.println(umBanco);

        umBanco.agencia = 345;
        System.out.println(umBanco);

        Endereco enderecoBancoUm = new Endereco(67543209,  "Recife", "Boa Vista", "Av. Conde da Boa Vista", 456, "Pernambuco", "N/A");
        System.out.println(enderecoBancoUm);

        enderecoBancoUm.complemento = "Ao lado do Shopping Boa Vista";
        System.out.println(enderecoBancoUm);

        Endereco enderecoUmBanco = new Endereco(67903401,  "Recife", "Boa Viagem", "Av. Boa Viagem", 78, "Pernambuco", "N/A");
        System.out.println(enderecoUmBanco);

        enderecoUmBanco.numero = 128;
        System.out.println(enderecoUmBanco);

        Funcionario novoFuncionario1 = new Funcionario(233456,"Administrativo", 2000.00, "Analista Júnior", "nome@email.com", 81, 987654321);
        System.out.println(novoFuncionario1);

        novoFuncionario1.area = "Comercial";
        System.out.println(novoFuncionario1);

        Funcionario novoFuncionario2 = new Funcionario(781130,"Financeiro", 5000.00, "Analista Pleno", "nome@email.com", 81, 990065723);
        System.out.println(novoFuncionario2);

        novoFuncionario2.salario = 5500.00;
        System.out.println(novoFuncionario2);

        Cliente novoCliente1 = new Cliente("Mônica Gomes", "13/10/000", "12345678901", 1234, "nome@emial.com", 81, 9945678);
        System.out.println(novoCliente1);

        novoCliente1.senha = 6789;
        System.out.println(novoCliente1);

        Cliente novoCliente2 = new Cliente("Moara Gomes", "28/01/000", "12345678901", 4321, "nome@emial.com", 81, 989678450);
        System.out.println(novoCliente2);

        novoCliente2.email = "contato@email.com";
        System.out.println(novoCliente2);

        Conta novaConta1 = new Conta(12345, 500.00, 800.00, 300.00, 5000.00);
        System.out.println(novaConta1);

        novaConta1.limiteCredito = 10000.00;
        System.out.println(novaConta1);

        Conta novaConta2 = new Conta(98765, 10000.00, 2000.00, 7000.00, 20000.00);
        System.out.println(novaConta1);

        novaConta2.chequeEspecial = 9000.00;
        System.out.println(novaConta2);

    }

}