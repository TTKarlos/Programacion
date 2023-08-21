package Mains;

import Objetos.Operacion;

import java.util.Scanner;

public class mainOperacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba el numero 1: ");
        int num1 = teclado.nextInt();
        System.out.print("Escriba el numero 2: ");
        int num2 = teclado.nextInt();
        Operacion op1 = new Operacion();


        op1.sumar(num1,num2);
        op1.resta(num1,num2);
        op1.multiplicacion(num1,num2);
        op1.division(num1,num2);
        op1.mostrarDatos();

    }
}
