package OperadoresAritmeticos.Ejercicios;

import java.util.Scanner;

public class Ejercicio4_SalarioMensual {
    final static float comisionPorCocheVendido = 150f;

    final static float porcentajePorValor = 0.05f;


    public static void main(String[] args) {
        int cochesVendidos;
        float salarioMensaul = 1000f;
        int valorCocheVendido;
        float salarioTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Coches vendidos: ");
        cochesVendidos = teclado.nextInt();
        System.out.println("Valor del coche vendido: ");
        valorCocheVendido = teclado.nextInt();
        salarioTotal = (cochesVendidos * comisionPorCocheVendido) + (valorCocheVendido * porcentajePorValor * cochesVendidos) + salarioMensaul;
        System.out.println("El salario total es de: " + salarioTotal + "€");







    }
}
