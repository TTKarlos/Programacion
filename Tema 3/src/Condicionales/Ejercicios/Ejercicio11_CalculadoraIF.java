package Condicionales.Ejercicios;

import java.util.Scanner;

public class Ejercicio11_CalculadoraIF {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        int solucion;
        String respuestaUsuario;
        System.out.println("1.| Suma: [S-s] \n" + "2.| Resta: [R-r] \n" + "3.| Multiplicación: [M-m || P-p] \n" + "4.| Division: [D-d]\n");
        System.out.println("Elige una de las opciones: ");
        respuestaUsuario = teclado.next();
        if (respuestaUsuario.equals("S")|| respuestaUsuario.equals("s") ){
            System.out.println("Escribe el valor del numero 1: ");
            numero1 = teclado.nextInt();
            System.out.println("Escribe el valor del numero 2: ");
            numero2 = teclado.nextInt();
            solucion = numero1 + numero2;
            System.out.println("La suma entre "+ numero1 + "+" + numero2 + " es: " + solucion);
        } else if (respuestaUsuario.equals("R")|| respuestaUsuario.equals("r")) {
            System.out.println("Escribe el valor del numero 1: ");
            numero1 = teclado.nextInt();
            System.out.println("Escribe el valor del numero 2: ");
            numero2 = teclado.nextInt();
            solucion = numero1 - numero2;
            System.out.println("La resta entre " + numero1 + "-" + numero2 + " es: " + solucion);
        } else if (respuestaUsuario.equals("P")|| respuestaUsuario.equals("p") || respuestaUsuario.equals("M") || respuestaUsuario.equals("m")) {
            System.out.println("Escribe el valor del numero 1: ");
            numero1 = teclado.nextInt();
            System.out.println("Escribe el valor del numero 2: ");
            numero2 = teclado.nextInt();
            solucion = numero1 * numero2;
            System.out.println("La multiplicación entre "+ numero1 + "*" + numero2 + " da: " + solucion);
        } else if (respuestaUsuario.equals("D") || respuestaUsuario.equals("d")) {
            System.out.println("Escribe el valor del numero 1: ");
            numero1 = teclado.nextInt();
            System.out.println("Escribe el valor del numero 2: ");
            numero2 = teclado.nextInt();
            solucion = numero1 / numero2;
            System.out.println("La division entre "+ numero1 + "/" + numero2 + " da: " + solucion);
        }else {
            System.out.println("Fuera del rango");
        }


    }
}
