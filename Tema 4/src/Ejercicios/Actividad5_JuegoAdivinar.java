package Ejercicios;

import java.util.Scanner;

public class Actividad5_JuegoAdivinar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int random = (int)(Math.random()*100);
        System.out.println(random);
        int respuestaUsuario;
        int intentos = 0;

        do {
            System.out.println("Adivina el numero random: ");
            respuestaUsuario = teclado.nextInt();
            intentos ++;
            if (respuestaUsuario < random){
                System.out.println("Es mayor");
            }else {
                System.out.println("Es menor");
            }
        }while (respuestaUsuario != random);

        System.out.println("Has acertado!!!");
        System.out.println("El numero de intentos ha sido de: " + intentos);


    }
}
