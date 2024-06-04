import java.util.ArrayList;
import java.util.List;

public class Orden {
    private int idOrden;
    private List<Producto> productos;
    private boolean entregada;
    private double total;
    private boolean pagada;
    private boolean cancelada;

    public Orden(int idOrden) {
        this.idOrden = idOrden;
        this.productos = new ArrayList<>();
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public boolean isEntregada() {
        return entregada;
    }

    public void setEntregada(boolean entregada) {
        this.entregada = entregada;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    // Métodos adicionales

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio();
    }

    public void removerProducto(Producto producto) {
        productos.remove(producto);
        total -= producto.getPrecio();
    }

    public void removerProducto() {
        entregada = true;
        System.out.println("Orden " + idOrden + " entregada");
    }

    public void pagarOrden() {
        pagada = true;
        System.out.println("Orden " + idOrden + " pagada");
    }
}