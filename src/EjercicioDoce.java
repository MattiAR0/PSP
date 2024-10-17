import java.util.Scanner;

public class EjercicioDoce {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] notas = new int[10];
        int suspensos = 0;
        int aprobados = 0;
        int notables = 0;
        int sobresaliente = 0;
        int matricula= 0;
        int nota;

        for(int i = 0;i<10;i++){
            do {
                System.out.println("Introduzca una nota:");
                 nota = entrada.nextInt();
            }while(nota<0 || nota>10);

            notas[i] = nota;

        }

        for(int i = 0;i<10;i++){

            if(notas[i]<5){
            suspensos++;
            } else if(notas[i]==5 || notas[i]==6){
                aprobados++;
            } else if(notas[i]==7 || notas[i]==8){
                notables++;
            } else if(notas[i]==9){
                sobresaliente++;
            } else if(notas[i]==10){
                matricula++;
            }
        }

        System.out.println("Hay " + suspensos + " suspensos, " + aprobados + "aprobados, " + notables + "notables, " + sobresaliente + "sobresalientes, " + matricula + "matricula");

    }
}
