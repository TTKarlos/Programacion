package Ejercicios;

import java.util.Scanner;

public class Ejercicio22_5Notas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int notas;
        boolean suspendidos = false;
        for (int i = 1;i<=5;i ++){
            System.out.println("Escribe la nota nº" + i);
            notas = teclado.nextInt();
            if (notas <5){
                suspendidos = true;
            }
        }
        if(suspendidos){
            System.out.println("Hay al menos 1 suspendido");
        }else {
            System.out.println("No hay ningun suspendido");
        }

        
    }
}
