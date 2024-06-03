public class Cliente {
    private int idCliente;
    private String nombre;
    private String telefono;
    private String direccion;
    private boolean registrado;
    private double saldo;
    private boolean premium;

    public Cliente(int idCliente, String nombre, String telefono, String direccion, boolean registrado, double saldo, boolean premium) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.registrado = registrado;
        this.saldo = saldo;
        this.premium = premium;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isRegistrado() {
        return registrado;
    }

    public void setRegistrado(boolean registrado) {
        this.registrado = registrado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    // Métodos adicionales

    public void realizarPedido() {
        System.out.println("Pedido realizado por el cliente: " + nombre);
    }

    public void registrar() {
        registrado = true;
        System.out.println("Cliente registrado exitosamente");
    }

    public void cancelarPedido() {
        System.out.println("Pedido cancelado por el cliente: " + nombre);
    }

    public void actualizarInformacion(String nuevaDireccion) {
        direccion = nuevaDireccion;
        System.out.println("Información actualizada exitosamente");
    }
}
