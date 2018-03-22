public class Auxiliar extends Gestor{

    public Auxiliar() {
        super();
    }

    public Auxiliar(String dni, String nombre, double salarioBase, int antiguedad) {
        super(dni, nombre, salarioBase, antiguedad);
        this.salarioFinal=salarioBase+100;
    }
}
