import java.util.Scanner;

public class Punto10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite el peso dado en kilogramos: ");
        float kg = entrada.nextFloat();

        float gramos = kg * 1000;
        double libras = kg * 2.2046;
        float ton = kg/1000;

        System.out.println("el peso en kilogramos fue converto a :"+" \ngramos:"+gramos+" \nlibras:"+libras+" \ntoneladas:"+ton);
    }
}
