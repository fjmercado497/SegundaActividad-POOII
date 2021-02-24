import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("escribe tu peso dado en kg: ");
        float pes = entrada.nextFloat();
        System.out.print("escribe tu altura dadoa en m: ");
        float alt = entrada.nextFloat();

        float bmi = pes/(alt*alt);
        System.out.printf("Tu BMI es : %f\n", bmi);
    }
}