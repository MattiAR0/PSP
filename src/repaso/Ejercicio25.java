package repaso;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar tres números al usuario
        System.out.println("Introduce el primer número (entre 1 y 10):");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número (entre 1 y 10):");
        int numero2 = sc.nextInt();
        System.out.println("Introduce el tercer número (entre 1 y 10):");
        int numero3 = sc.nextInt();

        // Generar un número aleatorio entre 1 y 10
        int numeroAleatorio = (int) (Math.random() * 10) + 1;
        System.out.println("Número aleatorio generado: " + numeroAleatorio);

        // Comprobar si alguno de los números introducidos coincide con el número aleatorio
        if (numero1 == numeroAleatorio || numero2 == numeroAleatorio || numero3 == numeroAleatorio) {
            System.out.println("¡Ganaste un premio!");
        } else {
            System.out.println("No coincidieron, mejor suerte la próxima vez.");
        }
    }
}
