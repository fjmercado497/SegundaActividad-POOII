import java.util.Scanner;

public class Punto7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese el valor de compra: ");
        float compra = entrada.nextFloat();
        System.out.print("ingrese el valor de venta: ");
        float venta = entrada.nextFloat();

        float util = venta-compra;
        float util1 = (util/venta)*100;
        System.out.printf("el porcentaje de utilidad es: %.2f \n",util1);

    }
}