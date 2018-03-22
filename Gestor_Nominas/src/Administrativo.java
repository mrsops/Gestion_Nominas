public class Administrativo extends Gestor{
    public Administrativo() {
        super();
    }

    public Administrativo(String dni, String nombre, double salarioBase, int antiguedad) {
        super(dni, nombre, salarioBase, antiguedad);
        this.salarioFinal= this.salarioBase + (antiguedad*20);
    }
}
