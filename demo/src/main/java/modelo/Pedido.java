package modelo;

public class Pedido {
    private String cliente;
    private String producto;
    private double precio;

    public Pedido(String cliente, String producto, double precio) {
        this.cliente = cliente;
        this.producto = producto;
        this.precio = precio;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente='" + cliente + '\'' +
                ", producto='" + producto + '\'' +
                ", precio=" + precio +
                '}';
    }
}
