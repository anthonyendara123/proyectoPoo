public class Factura {
    private int numeroFactura;
    private Cliente cliente;
    private double total;
    private boolean pagada;
    private boolean cancelada;

    public Factura(int numeroFactura, Cliente cliente, double total) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.total = total;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public void pagarFactura() {
        pagada = true;
        System.out.println("Factura " + numeroFactura + " pagada");
    }

    public void cancelarFactura() {
        cancelada = true;
        System.out.println("Factura " + numeroFactura + " cancelada");
    }
}