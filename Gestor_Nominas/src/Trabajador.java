public class Trabajador {
    protected String dni;
    protected String nombre;
    protected double salarioBase;
    protected double salarioFinal;

    public Trabajador() {
    }

    public Trabajador(String nombre, String dni, double salarioBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.salarioFinal = salarioBase;
    }

    public String toString(){
        return "DNI: "+this.dni+"\tNombre: "+this.nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }
}
