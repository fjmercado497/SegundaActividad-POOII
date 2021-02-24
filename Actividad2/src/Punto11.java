import java.util.Scanner;

public class Punto11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        while (true) {
            System.out.print("ingrese un numero entre 0 y 1000: ");
            numero = entrada.nextInt();
            if (numero > 1000 || numero < 0) {
                System.out.println("numero fuera de rango");
                continue;

            }
            break;

        }
        int uni = numero/1;
        int dec = numero/10;
        int cent = numero/100;
        System.out.println("las unidad del numero son: "+uni);
        System.out.println("las decena del numero son: "+dec);
        System.out.print("las centenas del numero som: "+cent);
    }
}
