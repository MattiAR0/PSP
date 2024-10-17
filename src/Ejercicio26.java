import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[10];

        System.out.println("Introduce 10 notas:");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextInt();
        }

        clasificarNotas(notas);
    }

    public static void clasificarNotas(int[] notas) {
        int suspensos = 0, aprobados = 0, notables = 0, sobresalientes = 0;

        for (int nota : notas) {
            if (nota < 5) suspensos++;
            else if (nota < 7) aprobados++;
            else if (nota < 9) notables++;
            else sobresalientes++;
        }

        System.out.println("Suspensos: " + suspensos);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Notables: " + notables);
        System.out.println("Sobresalientes: " + sobresalientes);
    }
}
