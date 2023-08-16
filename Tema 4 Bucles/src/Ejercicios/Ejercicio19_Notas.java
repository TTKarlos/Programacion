package Ejercicios;

import java.util.Scanner;

public class Ejercicio19_Notas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int notas;
        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;
        for(int i = 1; i <= 6;i++ ){
            do {
                System.out.println("Escribe la nota " + i);
                notas = teclado.nextInt();
            }while (notas < 0 || notas >10 );
            if (notas >= 5 ){
                aprobados ++;
            } else if (notas == 4) {
                condicionados ++;
            }else {
                suspensos ++;
            }

        }
        System.out.println("Los alumnos aprobados son: " + aprobados);
        System.out.println("Los alumnos condicionados son: " + condicionados);
        System.out.println("Los alumnos suspendidos son: " + suspensos);
    }
}
