public class Analista extends Informatico{

    public Analista(String dni, String nombre, double salarioBase, String titulacion) {
        super(dni, nombre, salarioBase, titulacion);
        this.salarioFinal = this.salarioBase +(this.salarioBase * 30 / 100);
    }

    public Analista() {
        super();
    }
}
