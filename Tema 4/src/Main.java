import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Estructura condicional if
        System.out.println("-----------IF-------------\n\n");

        int numeroif;
        System.out.println("Ingrese un numero para el if: ");
        Scanner entrada = new Scanner (System.in);

        numeroif = entrada.nextInt();

        if (numeroif > 0) {
            System.out.println("El numero: " + numeroif + " Es Positivo.\n");
        }else if (numeroif < 0) {
            System.out.println("El Numero: " + numeroif + " Es Negativo.\n");
        }else {
            System.out.println("El Numero: " + numeroif + " Es Cero.\n");
        }

        // Estructura Iterativa while
        System.out.println("-----------WHILE-------------\n\n");

        int numeroWhile;
        System.out.println("Ingrese un numero para el while: ");

        numeroWhile = entrada.nextInt();

        while (numeroWhile < 3) {
            System.out.println("(while)El valor es: " + numeroWhile + "\n\n");
            numeroWhile++;
        }

        //Estructura Iterativa Do while
        System.out.println("-----------DOWHILE-------------\n\n");

        int numeroDoWhile = 2;

        do {
            System.out.println("(doWhile)El valor ahora es: " + numeroDoWhile + "\n");
            numeroDoWhile++;
        }while(numeroDoWhile < 3);

        //Estructura Iterativa For
        System.out.println("-----------FOR-------------\n\n");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("(For)El valor es: " + numeroFor + "\n");
        }

        //Estructura switch
        System.out.println("-----------SWITCH-------------\n\n");

        var estacion = "primavera";

        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("No se ingreso ninguna estacion del año.");
        }
    }
}