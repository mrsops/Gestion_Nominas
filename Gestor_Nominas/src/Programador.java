public class Programador extends Informatico{

    public Programador(String dni, String nombre, double salarioBase, String titulacion) {
        super(dni, nombre, salarioBase, titulacion);
        this.salarioFinal = this.salarioBase +(this.salarioBase * 15 / 100);
    }

    public Programador() {
        super();
    }
}
