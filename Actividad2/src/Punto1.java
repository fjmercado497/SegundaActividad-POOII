
import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1,n2 ;
        System.out.print("Escribe un numero entero : ");
        n1 = entrada.nextInt();
        System.out.print("Escribe otro numero entero : ");
        n2 = entrada.nextInt();

        /*a)*/System.out.printf("n1 = %d\n", n1 );
        /*b)*/System.out.printf("El valor de %d + %d es %d\n", n1, n1, ( n1 + n1 ) );
        /*c)*/System.out.printf("x=%.2f", (float)n1 );
        /*d)*/System.out.printf("%d - %d\n", ( n1 + n2 ), ( n2 + n1 ) );
    }
}
