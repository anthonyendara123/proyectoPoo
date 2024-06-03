public class Inventario {
    private Producto[] productos;
    private int capacidadMaxima;
    private int cantidadProductos;

    public Inventario(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.productos = new Producto[capacidadMaxima];
        this.cantidadProductos = 0;
    }

    // Getters y Setters

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    // Métodos adicionales
    public void agregarProducto(Producto producto) {
        System.out.println("Producto agregado");
    }

    public void eliminarProducto(int idProducto) {
        System.out.println("Producto eliminado");
    }

    public void buscarProducto(int idProducto) {
        System.out.println("Producto encontrado");
    }

    public void mostrarInventario() {
        System.out.println("Inventario mostrado");
    }
}