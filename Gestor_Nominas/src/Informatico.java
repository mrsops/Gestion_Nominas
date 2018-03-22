public class Informatico extends Trabajador{
    protected String titulacion;

    public Informatico() {
        super();
    }

    public Informatico(String dni, String nombre, double salarioBase, String titulacion) {
        super(dni, nombre, salarioBase);
        this.titulacion = titulacion;
    }

    public String toString(){
        return super.toString()+"\tTitulacion: "+this.titulacion;
    }
}
