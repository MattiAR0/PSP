package repaso;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sumaTotal = 0;
        for(int i =0;i<5;i++){
            System.out.println("Introduzca un numero: ");
            int numero = entrada.nextInt();

            sumaTotal += numero;

        }
        System.out.println("La suma total de los numero es "+ sumaTotal);
    }
}
