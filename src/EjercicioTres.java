import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();
        int sum = num1 + num2;
        System.out.println("La suma de los numeros es: " + sum);
    }
}
