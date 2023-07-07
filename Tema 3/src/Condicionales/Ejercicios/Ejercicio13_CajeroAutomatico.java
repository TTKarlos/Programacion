package Condicionales.Ejercicios;

import javax.swing.*;
import java.nio.channels.FileLock;
import java.util.Scanner;

public class Ejercicio13_CajeroAutomatico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float saldoInicial = 1000f;
        int opciones;
        float dineroARetirar;
        float dineroAIngresar;
        float dineroTotal;
        System.out.println("1.| Ingresar dinero a la cuenta");
        System.out.println("2.| Retirar dinero de la cuenta");
        System.out.println("3.| Salir");
        opciones = teclado.nextInt();
        if (opciones == 3){
            System.out.println("Gracias vuleva pronto!!! ");
        } else if (opciones == 2) {
            System.out.println("Introduce la cantidad de dinero que quieres retirar: ");
            dineroARetirar = teclado.nextFloat();
            if (dineroARetirar > saldoInicial){
                System.out.println("No tienes suficiente saldo!!!");
            }else {
                dineroTotal = saldoInicial - dineroARetirar;
                System.out.println("Tu dinero restante es: " + dineroTotal + "€");
            }
        }else {
            System.out.println("Cuanto dinero quieres ingresar? ");
            dineroAIngresar = teclado.nextFloat();
            dineroTotal = dineroAIngresar + saldoInicial;
            System.out.println("Tu saldo actualizado es: " + dineroTotal + "€");
        }
    }
}
