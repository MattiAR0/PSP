import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una contraseña: ");
        String contraseña = sc.nextLine();

        System.out.println("Repite la contraseña: ");
        String repetirContraseña = sc.nextLine();

        if (contraseña.equals(repetirContraseña) && validarContraseña(contraseña)) {
            System.out.println("Contraseña válida y coinciden.");
        } else {
            System.out.println("Las contraseñas no coinciden o no es válida.");
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
