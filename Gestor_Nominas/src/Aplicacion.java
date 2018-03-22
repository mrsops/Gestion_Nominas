import java.util.Scanner;

public class Aplicacion {
    static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        String opcion;
        Empresa miEmpresa = new Empresa();
        Trabajador nuevo;



        do {
            menu();
            opcion = tc.nextLine();
            switch (opcion){ //MENU DEL PROGRAMA
                case "1":
                    do { //MENU DE ALTAS DE TRABAJADORES
                        menuAltas();
                        opcion = tc.nextLine();
                        switch (opcion){
                            case "1":
                                do { //ALTAS DE INFORMATICOS
                                    menuInformaticos();
                                    opcion = tc.nextLine();
                                    switch (opcion){
                                        case "1":
                                            nuevo = nuevoTrabajador(1);
                                            if (nuevo!=null){
                                                miEmpresa.nuevoTrabajador(nuevo);
                                            }
                                            break;
                                        case "2":
                                            nuevo = nuevoTrabajador(2);
                                            if (nuevo!=null){
                                                miEmpresa.nuevoTrabajador(nuevo);
                                            }
                                            break;
                                        case "3":
                                            break;
                                            default:
                                                System.out.println("Opcion Incorrecta");
                                    }
                                }while (!opcion.equals("3"));
                                opcion="";
                                break;
                            case "2":
                                do { // ALTAS DE GESTORES
                                    menuGestores();
                                    opcion = tc.nextLine();
                                    switch (opcion){
                                        case "1":
                                            nuevo = nuevoTrabajador(3);
                                            if (nuevo!=null){
                                                miEmpresa.nuevoTrabajador(nuevo);
                                            }
                                            break;
                                        case "2":
                                            nuevo = nuevoTrabajador(4);
                                            if (nuevo!=null){
                                                miEmpresa.nuevoTrabajador(nuevo);
                                            }
                                            break;
                                        case "3":
                                            break;
                                        default:
                                            System.out.println("Opcion Incorrecta");
                                    }
                                }while (!opcion.equals("3"));
                                opcion="";
                                break;
                            case "3":
                                break;
                                default:
                                    System.out.println("Opcion incorrecta");
                        }
                    }while (!opcion.equals("3"));
                    break;
                case "2": // LISTAR TRABAJADORES
                    limpiar();
                    miEmpresa.listarTrabajadores();
                    System.out.println("");
                    break;
                case "3": // LISTAR COSTES
                    limpiar();
                    miEmpresa.listarCostes();
                    System.out.println("");
                    break;
                case "0":
                    break;
                    default:
                        limpiar();
                        System.out.println("Opcion incorrecta.");
            }
        }while(!opcion.equals("0"));
    }

    private static void menu(){
        System.out.println("1. Altas de trabajadores");
        System.out.println("2. Listado de trabajadores");
        System.out.println("3. Listado de sueldos de los trabajadores");
        System.out.println("0. Salir");
    }

    private static void limpiar(){
        for (int i = 0; i <50 ; i++) {
            System.out.println("");
        }
    }

    private static void menuAltas(){
        System.out.println("1. Dar de alta Informaticos");
        System.out.println("2. Dar de alta Gestores");
        System.out.println("3. Atras");
    }

    private static void menuInformaticos(){
        System.out.println("1. Dar de alta programador");
        System.out.println("2. Dar de alta analista");
        System.out.println("3. Atras");
    }

    private static void menuGestores(){
        System.out.println("1. Dar de alta auxiliar.");
        System.out.println("2. Dar de alta administrativo");
        System.out.println("3. Atras");
    }

    private static Trabajador nuevoTrabajador(int n){
        System.out.print("Introduce el nombre: ");
        String nombre = tc.nextLine();
        System.out.print("Introduce el dni: ");
        String dni =tc.nextLine();
        System.out.print("Introduce el salario base: ");
        String salario = tc.nextLine();
        if (isDouble(salario)){
            double base = Double.parseDouble(salario);
            if (n==1){
                System.out.print("Introduce titulacion: ");
                String titulacion = tc.nextLine();
                return new Programador(nombre, dni, base, titulacion);
            }else if (n==2){
                System.out.print("Introduce titulacion: ");
                String titulacion = tc.nextLine();
                return new Analista(nombre, dni, base, titulacion);
            }else if (n==3){
                System.out.print("Introduce antiguedad: ");
                String anti = tc.nextLine();
                if(isNumeric(anti)){
                    int antiguedad = Integer.parseInt(anti);
                    return new Auxiliar(nombre, dni, base, antiguedad);
                }else {
                    System.out.println("La antiguedad no es correcta o no es un numero");
                    return null;
                }
            }else if (n==4){
                System.out.print("Introduce antiguedad: ");
                String anti = tc.nextLine();
                if(isNumeric(anti)){
                    int antiguedad = Integer.parseInt(anti);
                    return new Administrativo(nombre, dni, base, antiguedad);
                }else {
                    System.out.println("La antiguedad no es correcta o no es un numero");
                    return null;
                }
            }else {
                return null;
            }
        }else {
            System.out.println("El salario introducido no es correcto, o no es un numero.");
        }
        return null;
    }

    private static boolean isDouble(String s){
        try {
            Double.parseDouble(s);
            return true;
        }catch (NumberFormatException nfe){
            return false;
        }
    }

    private static boolean isNumeric(String s){
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException nfe){
            return false;
        }
    }

}
