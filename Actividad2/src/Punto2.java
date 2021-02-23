import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1,n2,suma,dife;
        float produ;

        System.out.print("ingrese un numero: ");
        n1 = entrada.nextInt();
        System.out.print("ingrese otro numero: ");
        n2 = entrada.nextInt();
        suma = n1+n2;
        produ= (float)n1/n2;
        dife= n1-n2;

        System.out.printf("La suma de los numeros son: %d\n", suma);
        System.out.printf("El producto de los numeros es: %d\n", produ);
        System.out.printf("La diferencia  de los numeros son: %f\n", dife);

    }
}
