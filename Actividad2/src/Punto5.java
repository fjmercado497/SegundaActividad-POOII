import java.util.Scanner;

public class Punto5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un caracter: ");
        char cat = entrada.next().charAt(0);
        System.out.printf("El valor es: %d\n", (int)cat);
    }

}
