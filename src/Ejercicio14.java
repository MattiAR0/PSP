import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor del radio: ");
        double radio = sc.nextDouble();

        double diametro = 2 * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.printf("El diámetro es: %.3f\n", diametro);
        System.out.printf("El área es: %.3f\n", area);
    }
}
