public class Gestor extends Trabajador{
    protected int antiguedad;

    public Gestor() {
        super();
    }

    public Gestor(String dni, String nombre, double salarioBase, int antiguedad) {
        super(dni, nombre, salarioBase);
        this.antiguedad = antiguedad;
    }

    public String toString(){
        return super.toString()+ "\tAntiguedad: "+this.antiguedad;
    }
}
