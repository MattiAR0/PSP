package repaso;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor del radio: ");
        double radio = sc.nextDouble();

        double diametro = 2 * radio;
        double area = Math.PI * Math.pow(radio, 2);
        double volumen = (4.0 / 3) * Math.PI * Math.pow(radio, 3);

        System.out.printf("El diámetro es: %.3f\n", diametro);
        System.out.printf("El área es: %.3f\n", area);
        System.out.printf("El volumen es: %.3f\n", volumen);
    }
}
