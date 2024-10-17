import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        String nombre;

        do {
            System.out.println("Introduce un nombre (o 0 para finalizar):");
            nombre = sc.nextLine();
            if (!nombre.equals("0")) {
                nombres.add(nombre);
            }
        } while (!nombre.equals("0"));

        System.out.println("Nombres introducidos:");
        for (String n : nombres) {
            System.out.println(n);
        }
    }
}
