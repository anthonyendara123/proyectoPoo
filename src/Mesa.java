public class Mesa {
    private int numeroMesa;
    private int capacidad;
    private boolean ocupada;
    private boolean reservada;
    private String ubicacion;
    private boolean accesoDiscapacitados;
    private boolean aireAcondicionado;

    public Mesa(int numeroMesa, int capacidad, boolean ocupada, boolean reservada, String ubicacion, boolean accesoDiscapacitados, boolean aireAcondicionado) {
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
        this.ocupada = ocupada;
        this.reservada = reservada;
        this.ubicacion = ubicacion;
        this.accesoDiscapacitados = accesoDiscapacitados;
        this.aireAcondicionado = aireAcondicionado;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isAccesoDiscapacitados() {
        return accesoDiscapacitados;
    }

    public void setAccesoDiscapacitados(boolean accesoDiscapacitados) {
        this.accesoDiscapacitados = accesoDiscapacitados;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    // Métodos adicionales

    public void reservarMesa() {
        reservada = true;
        System.out.println("Mesa " + numeroMesa + " reservada");
    }

    public void liberarMesa() {
        reservada = false;
        ocupada = false;
        System.out.println("Mesa " + numeroMesa + " liberada");
    }

    public void ocuparMesa() {
        ocupada = true;
        System.out.println("Mesa " + numeroMesa + " ocupada");
    }

    public void desocuparMesa() {
        ocupada = false;
        System.out.println("Mesa " + numeroMesa + " desocupada");
    }
}