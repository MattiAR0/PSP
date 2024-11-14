package repaso;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        do{
            System.out.println("introduzca un numero: ");
             num1 = entrada.nextInt();

            System.out.println("Introduzca otro numero:");
            num2 = entrada.nextInt();

        } while(num1 != num2);

    }
}
