import java.util.Scanner;

public class EjercicioSiete {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int sumaTotal = 0;
            int cantNumeros = 0;
            while(cantNumeros < 5) {
                System.out.println("Introduzca un numero: ");
                int numero = entrada.nextInt();

                sumaTotal += numero;
                cantNumeros++;

            }
            System.out.println("La suma total de los numero es "+ sumaTotal);
        }
    }
