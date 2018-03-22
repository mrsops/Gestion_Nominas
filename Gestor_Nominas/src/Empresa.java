import java.util.ArrayList;

public class Empresa {
    private String cif;
    private String nombre;
    private ArrayList<Trabajador> trabajadores;

    public Empresa() {
        this.trabajadores = new ArrayList<Trabajador>();
    }

    public Empresa(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
        this.trabajadores = new ArrayList<Trabajador>();
    }

    public void nuevoTrabajador(Trabajador t){
        this.trabajadores.add(t);
    }

    public void listarTrabajadores(){
        for (Trabajador t:this.trabajadores) {
            System.out.println(t);
        }
    }

    public void listarCostes(){
        double total=0;
        for (Trabajador t:this.trabajadores) {
            System.out.println("Nombre: "+t.getNombre()+ "\tSalario Final: "+t.getSalarioFinal());
            total+=t.getSalarioFinal();
        }
        System.out.println("El total a pagar por parte de la empresa es: "+total);
    }
}
