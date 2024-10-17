import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduzca un numero entre el 1 y el 12");
             num = entrada.nextInt();
        }while(num <1 || num >12);

        if(num == 1){
            System.out.println("ENERO");
        }else if(num == 2){
            System.out.println("FEBRERO");
        } else if (num == 3){
            System.out.println("MARZO");
        } else if (num == 4){
            System.out.println("ABRIL");
        } else if (num == 5){
            System.out.println("MAYO");
        } else if (num == 6){
            System.out.println("JUNIO");
        } else if (num == 7){
            System.out.println("JULIO");
        } else if (num == 8){
            System.out.println("AGOSTO");
        } else if (num == 9){
            System.out.println("SEPTIEMBRE");
        } else if (num == 10){
            System.out.println("OCTUBRE");
        } else if (num == 11){
            System.out.println("NOVIEMBRE");
        } else {
            System.out.println("DICIEMBRE");
        }


    }
}
