import java.util.Scanner;

public class Punto9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("numero de dia de viajes: ");
        int dias = entrada.nextInt();
        System.out.print("total de kilometros conducido por dia: ");
        float dis = entrada.nextFloat();
        System.out.print("costo por litro de gasolina: ");
        int costo = entrada.nextInt();
        System.out.print("promedio de kilometro por litro de gasolina : ");
        float pro = entrada.nextFloat();
        System.out.print("pago de estacionamiento por dia: ");
        int esta = entrada.nextInt();
        System.out.print("pago de peajes por dia: ");
        int peaje = entrada.nextInt();

        float cost1 = costo*pro;
        float dia = esta+peaje;
       float total = (dis*cost1)+(dia*dias);


        System.out.printf("el total gastatado fue: %.0f\n",total);
    }
}