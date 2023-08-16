package Objetos;

import java.util.Scanner;

public class Operacion {
    final static Scanner teclado = new Scanner(System.in);
    //Atributos
    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos

    public void leerNumeros (){
        System.out.println("Escribe el numero 1: ");
        num1 = teclado.nextInt();
        System.out.println("Escribe el numero 2: ");
        num2 = teclado.nextInt();
    }

    public void sumar(){
        suma = num1+num2;
    }
    public void resta(){
        resta = num1-num2;
    }
    public void multiplicacion(){
        multiplicacion = num1*num2;
    }
    public void division(){
        division = num1/num2;
    }

    public void mostrarDatos(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}
