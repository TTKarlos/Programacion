package Objetos;

import java.util.Scanner;

public class Operacion {
    final static Scanner teclado = new Scanner(System.in);
    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos


    public void sumar(int num1 , int num2){
        suma = num1+num2;
    }
    public void resta(int num1, int num2){
        resta = num1-num2;
    }
    public void multiplicacion(int num1, int num2){
        multiplicacion = num1*num2;
    }
    public void division(int num1, int num2){
        division = num1/num2;
    }

    public void mostrarDatos(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}
