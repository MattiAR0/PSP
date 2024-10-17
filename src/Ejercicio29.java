import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        String tipo, marca, modelo;

        while (true) {
            System.out.println("Introduce el tipo de vehículo (o 0 para terminar):");
            tipo = sc.nextLine();
            if (tipo.equals("0")) break;

            System.out.println("Introduce la marca:");
            marca = sc.nextLine();
            System.out.println("Introduce el modelo:");
            modelo = sc.nextLine();

            vehiculos.add(new Vehiculo(tipo, marca, modelo));
        }

        System.out.println("Vehículos introducidos:");
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
        }
    }
}
