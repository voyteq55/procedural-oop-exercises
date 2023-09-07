public class Konto {
    private int nrKonta;
    private double saldo;

    public Konto() {
        nrKonta = 0;
        saldo = 0;
    }

    public Konto(int nrKonta, double saldo) {
        this.nrKonta = nrKonta;
        this.saldo = saldo;
    }

    public int getNrKonta() {
        return nrKonta;
    }

    public void setNrKonta(int nrKonta) {
        this.nrKonta = nrKonta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void getStan() {
        System.out.printf("%d: %.2f\n", nrKonta, saldo);
    }
}
