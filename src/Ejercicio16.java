import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (ddmmaaaa): ");
        int fecha = sc.nextInt();
        int suma = 0;

        while (fecha > 0) {
            suma += fecha % 10;
            fecha /= 10;
        }

        while (suma > 9) {
            int temp = 0;
            while (suma > 0) {
                temp += suma % 10;
                suma /= 10;
            }
            suma = temp;
        }

        System.out.println("Tu número de la suerte es: " + suma);
    }
}
