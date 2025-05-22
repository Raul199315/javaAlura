package tajetas;

public class TarjetaDebito {
      private double saldo;
      private double numero;
      private double fv;
      private double ccv;

    public TarjetaDebito(double saldo, double numero, double fv, double ccv) {
        this.saldo = saldo;
        this.numero = numero;
        this.fv = fv;
        this.ccv = ccv;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getFv() {
        return fv;
    }

    public void setFv(double fv) {
        this.fv = fv;
    }

    public double getCcv() {
        return ccv;
    }

    public void setCcv(double ccv) {
        this.ccv = ccv;
    }
}
