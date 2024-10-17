import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una contraseña: ");
        String contraseña = sc.nextLine();

        if (validarContraseña(contraseña)) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña no cumple los requisitos.");
        }
    }

    public static boolean validarContraseña(String contraseña) {
        if (contraseña.length() < 5) {
            return false;
        }

        boolean tieneNumero = false;
        boolean tieneMayuscula = false;

        for (char c : contraseña.toCharArray()) {
            if (Character.isDigit(c)) {
                tieneNumero = true;
            }
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
        }

        return tieneNumero && tieneMayuscula;
    }
}
