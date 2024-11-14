package repaso;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entre el 1 y el 10: ");
        int numeroUsuario = sc.nextInt();
        int numeroAleatorio = (int) (Math.random() * 10) + 1;

        System.out.println("Número del usuario: " + numeroUsuario);
        System.out.println("Número aleatorio: " + numeroAleatorio);

        if (numeroUsuario == numeroAleatorio) {
            System.out.println("¡Ganaste un premio!");
        } else {
            System.out.println("No coincidieron.");
        }
    }
}

