package repaso;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce el nombre de la persona " + (i + 1) + ":");
            nombres[i] = sc.nextLine();
        }

        System.out.println("Nombres introducidos:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
