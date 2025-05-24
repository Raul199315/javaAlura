package tajetas;

import java.util.ArrayList;
import java.util.List;

public class TarjetaCredito  {
        private double cupo =2000000;
        private double cupoUsado;
        private List<Compra> Compras = new ArrayList<>();


    public TarjetaCredito(double cupo, double numero, double fv, double ccv) {
    }

    public TarjetaCredito() {
    }

    public double getCupo() {
        return cupo;
    }

    public void setCupo(double cupo) {
        this.cupo = cupo;
    }

    public double getCupoUsado() {
        return cupoUsado;
    }

    public void setCupoUsado(double cupoUsado) {
        this.cupoUsado = cupoUsado;
    }

    public List<Compra> getCompras() {
        return Compras;
    }

    public void setCompras(List<Compra> compras) {
        Compras = compras;
    }
}
