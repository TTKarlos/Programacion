package Ejercicios;

import java.util.Scanner;

public class EXAMEN {
    final static int N = 1;
    final static int SUELDOFIJO = 950;
    final static int PORHORA = 7;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float horas;
        double dineroSemanal;
        float contadorDinero = 0f;
        float dineroSuplementarioTotal = 0f;
        float dineroTotal;
        float horasTotales = 0f;
        float dineroPorHoras = 0;
        System.out.println("PROGRAMA NÓMINAS (Empresa CateringBueno)");
        System.out.println("--------------------------------------");
        System.out.println("Número de cocineros (N): " + N);
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print("Semana " + i + " del cocinero " + N + " del servicio " + j + " (Horas): ");
                horas = teclado.nextFloat();
                horasTotales += horas;
                if (horas < 5){
                    dineroSemanal = (horas * PORHORA) * 0.15;
                    contadorDinero += dineroSemanal;
                } else {
                    dineroSemanal = (horas * PORHORA) * 0.30;
                    contadorDinero += dineroSemanal;
                }
            }
            System.out.printf("El suplemento del cocinero %d en la semana %d es de %.2f €\n\n",N,i,contadorDinero);
            dineroSuplementarioTotal += contadorDinero;
            dineroPorHoras = horasTotales *7;
            contadorDinero = 0;

        }
        dineroTotal = SUELDOFIJO + dineroSuplementarioTotal + dineroPorHoras;
        System.out.printf("El sueldo del cocinero %d es %.2f€ con un total de %.2f horas trabajadas",N,dineroTotal, horasTotales);



    }
}
