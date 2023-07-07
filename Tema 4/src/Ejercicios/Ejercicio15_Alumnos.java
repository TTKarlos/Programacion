package Ejercicios;

import java.util.Scanner;

public class Ejercicio15_Alumnos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        int altura;
        int contadorMayores18 = 0;
        int contadorMasAltos175 = 0;
        int sumaEdad = 0;
        int sumaAltura = 0;
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Escribe la edad del alumno"+i);
            edad = teclado.nextInt();
            System.out.println("Escribe la altura del alumno"+i);
            altura = teclado.nextInt();
            sumaEdad += edad;
            sumaAltura += altura;
            if (edad >= 18){
                contadorMayores18 ++;
            }
            if (altura >= 175){
                contadorMasAltos175 ++;
            }
        }
        sumaEdad /= 5;
        sumaAltura /= 5;
        System.out.println("La edad media es de: " + sumaEdad);
        System.out.println("La altura media es de: "+ sumaAltura);
        System.out.println("Hay " + contadorMayores18 + " mayores de 18 años");
        System.out.println("Hay " + contadorMasAltos175 + " que miden mas de 1.75cm");
    }
}
