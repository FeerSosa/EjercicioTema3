public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(21);
        persona.setNombre("Fernando");
        persona.setTelefono(1239304931);

        System.out.println("Nombre es: " + persona.getNombre() + "\n");
        System.out.println("Edad es: " + persona.getEdad() + "\n");
        System.out.println("Telefono es: " + persona.getTelefono() + "\n");

    }
}

class Persona {
    private int edad, telefono;
    private String nombre;

    // setter de cada propiedad
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //getter de cada propiedad
    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getTelefono(){
        return telefono;
    }
}
