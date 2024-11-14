package repaso;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su numero de DNI:");
        int dni = sc.nextInt();
        char letra;
        int calcularLetra = dni % 23;

       char[] letras = {'T','R','W','A','G','H','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

       letra = letras[calcularLetra];
        String dniCompleto = String.valueOf(dni) + letra;
        System.out.println(dniCompleto);

    }
}
