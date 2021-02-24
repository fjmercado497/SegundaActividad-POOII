import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("ecriba el radio de si circuferencia: ");
        float rad = entrada.nextFloat();

        double longitu = 2 * Math.PI * rad;
        double area = (rad * rad) * Math.PI;

        System.out.printf("la longitud de la circuferencia es : %.2f\n", longitu);
        System.out.printf("el area de la circuferencia es : %.2f\n", area);
    }
}
