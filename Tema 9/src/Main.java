public class Main {

    public static void main(String[] args) {
        // cliente
        Cliente cliente = new Cliente();
        cliente.edad = 21;
        cliente.telefono = 123948238;
        cliente.nombre = "Fernando";
        cliente.credito = 3900.58;

        System.out.println("INFORMACION DEL CLIENTE: \n");
        System.out.println("Tu nombre es: " + cliente.nombre + "\n");
        System.out.println("Tu edad es: " + cliente.edad + "\n");
        System.out.println("Tu credito es: " + cliente.credito + "\n");
        System.out.println("Tu numero Tel es: " + cliente.telefono + "\n");

        // trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 33;
        trabajador.telefono = 122845841;
        trabajador.nombre = "Cristian";
        trabajador.salario = 8900.58;

        System.out.println("INFORMACION DEL TRABAJADOR: \n");
        System.out.println("Tu nombre es: " + trabajador.nombre + "\n");
        System.out.println("Tu edad es: " + trabajador.edad + "\n");
        System.out.println("Tu salario es: " + trabajador.salario + "\n");
        System.out.println("Tu numero Tel es: " + trabajador.telefono + "\n");
    }
}

class Persona {
    int edad, telefono;
    String nombre;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}