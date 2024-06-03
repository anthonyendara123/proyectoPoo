public class Chef {
    private int idChef;
    private String nombre;
    private String especialidad;
    private boolean disponible;
    private boolean premium;
    private int experiencia;
    private int edad;

    public Chef(int idChef, String nombre, String especialidad, boolean disponible, boolean premium, int experiencia, int edad) {
        this.idChef = idChef;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.disponible = disponible;
        this.premium = premium;
        this.experiencia = experiencia;
        this.edad = edad;
    }

    public int getIdChef() {
        return idChef;
    }

    public void setIdChef(int idChef) {
        this.idChef = idChef;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos adicionales

    public void trabajar() {
        disponible = false;
        System.out.println("Chef " + nombre + " trabajando en la cocina");
    }

    public void descansar() {
        disponible = true;
        System.out.println("Chef " + nombre + " descansando");
    }

    public void actualizarEspecialidad(String nuevaEspecialidad) {
        especialidad = nuevaEspecialidad;
        System.out.println("Especialidad de Chef " + nombre + " actualizada");
    }

    public void celebrarCumpleaños() {
        edad++;
        System.out.println("¡Feliz cumpleaños Chef " + nombre + "!");
    }
}