package Ejercicios;

import java.awt.*;

public class RemplazarDiasSemanas {
    public static void main(String[] args) {
        String[] diasDeLaSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        copiarDiasDeLaSemana(diasDeLaSemana);
    }

    public static void copiarDiasDeLaSemana (String[] diasDeLaSemana){
        String[] diasDeLaSemanaIngles = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] diasDeLaSemanaCopiaIngles = new String[diasDeLaSemanaIngles.length];
        for (int i = 0; i < diasDeLaSemana.length; i++) {
            diasDeLaSemanaCopiaIngles[i] = diasDeLaSemanaIngles[i];
            diasDeLaSemanaIngles[i] = diasDeLaSemana[i];
        }
        System.out.println(" ");
        for (int i = 0; i < diasDeLaSemanaIngles.length; i++) {
            System.out.println(diasDeLaSemanaIngles[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < diasDeLaSemanaCopiaIngles.length; i++) {
            System.out.println(diasDeLaSemanaCopiaIngles[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < diasDeLaSemana.length; i++) {
            System.out.println(diasDeLaSemana[i]);
        }
    }
}
