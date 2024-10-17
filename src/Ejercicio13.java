import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca los grados en celsius: ");
        double celsius = entrada.nextDouble();
        double farenheit = (celsius * 9/5) + 32;
        System.out.println("Farenheit: " + farenheit);

    }
}
