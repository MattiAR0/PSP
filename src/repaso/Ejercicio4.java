package repaso;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int num2 = entrada.nextInt();

        if(num1>num2){
            System.out.println("EL " +  num1 + " es mayor que " + num2);
        } else if(num1<num2){
            System.out.println("EL " +  num2 + " es mayor que " + num1);
        } else {
            System.out.println("son iguales");
        }
    }
}
