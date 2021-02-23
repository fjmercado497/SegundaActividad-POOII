import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("ecriba un numero decimal :");
        float n1 = entrada.nextFloat();
        System.out.print("ecriba un numero decimal :");
        float n2 = entrada.nextFloat();
        System.out.print("ecriba un numero decimal :");
        float n3 = entrada.nextFloat();

        // Operaciones
        float suma = n1+n2+n3;
        float prom = suma/3;
        float produ = n1*n2*n3;
        float cociente = n1/n2/n3;
        float modu = n1%n2%n3;

        System.out.printf("la Suma de lo numeros son: %.2f\n", suma);
        System.out.printf("el Promedio de los numeros son : %.2f\n", prom);
        System.out.printf("el producto de los numero son: %.2f\n", produ);
        System.out.printf("el cociente de los numero son: %.2f\n", cociente);
        System.out.printf("el Modulo de los numeros son: %.2f\n", modu);

    }

}
