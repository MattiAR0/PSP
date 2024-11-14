package repaso;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu DNI (sin letra): ");
        int dni = sc.nextInt();

        char letra = calcularLetraDNI(dni);
        System.out.println("Tu DNI completo es: " + dni + letra);
    }

    public static char calcularLetraDNI(int dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(dni % 23);
    }
}
