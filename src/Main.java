public class Main {

    public static void main(String[] args){
        //Primera parte
        int num1 = 24;
        int num2 = 10;
        int num3 = 5;

        var sum = suma(num1 , num2, num3);

        System.out.println(sum);

        //Segunda parte
        coche miAuto = new coche();
        miAuto.addPuertas();

        System.out.println(miAuto.puertas);
    }
    //Primera parte
    public static int suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        return(resultado);
    }
}
//Segunda parte
class coche {
    public int puertas = 0;

    public void addPuertas() {
        this.puertas++;
    }
}