package tajetas;

public class Compra {
    private String tienda;
    private double precio;
    private String producto;


    public Compra(String tienda, double precio, String producto) {
        this.tienda = tienda;
        this.precio = precio;
        this.producto = producto;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
}
