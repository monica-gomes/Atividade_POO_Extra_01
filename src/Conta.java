public class Conta {
    int numero;
    double saldo;
    double limiteCredito;
    double chequeEspecial;
    double creditoFinanciamento;

    Conta(int numero, double saldo, double limiteCredito, double chequeEspecial, double creditoFinanciamento){
        this.numero = numero;
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
        this.chequeEspecial = chequeEspecial;
        this.creditoFinanciamento = creditoFinanciamento;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", limiteCredito=" + limiteCredito +
                ", chequeEspecial=" + chequeEspecial +
                ", creditoFinanciamento=" + creditoFinanciamento +
                '}';
    }
}
