public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private boolean disponible;
    private String categoria;
    private String descripcion;
    private int cantidadStock;

    public Producto(int idProducto, String nombre, double precio, boolean disponible, String categoria, String descripcion, int cantidadStock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.cantidadStock = cantidadStock;
    }

    // Getters y Setters

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    // Métodos adicionales

    public void mostrarInformacion() {
        System.out.println("ID: " + idProducto);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
        System.out.println("Categoría: " + categoria);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Cantidad en Stock: " + cantidadStock);
    }

    public void ajustarStock(int cantidad) {
        cantidadStock += cantidad;
        System.out.println("Stock ajustado en " + cantidad + " unidades");
    }

    public void actualizarPrecio(double nuevoPrecio) {
        precio = nuevoPrecio;
        System.out.println("Precio actualizado correctamente");
    }

    public void cambiarDisponibilidad() {
        disponible = !disponible;
        System.out.println("Disponibilidad cambiada correctamente");
    }
}