package OperadoresAritmeticos.Ejercicios;

import java.util.Scanner;

public class Ejercicio5_NotaFinalAlumno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float participacion = 0.10f;
        float examenParcial = 0.25f;
        float examenFinal = 0.40f;

        float notaParticipacion;
        float notaPrimerExamenParcial;
        float notaSegundoExamenParcial;
        float notaExamenFinal;

        float notaFinal;

        String nombreAlumno;
        System.out.println("Escriba el nombre del alumno: ");
        nombreAlumno = teclado.next();
        System.out.println("Escriba la nota de participación de " + nombreAlumno);
        notaParticipacion = teclado.nextFloat();
        System.out.println("Esciba la nota del primer examen del alumno " + nombreAlumno);
        notaPrimerExamenParcial = teclado.nextFloat();
        System.out.println("Esciba la nota del segundo examen del alumno " + nombreAlumno);
        notaSegundoExamenParcial = teclado.nextFloat();
        System.out.println("Esciba la nota del examen final del alumno " + nombreAlumno);
        notaExamenFinal = teclado.nextFloat();

        notaFinal = (notaParticipacion * participacion) + (notaPrimerExamenParcial * examenParcial) + (notaSegundoExamenParcial * examenParcial)
                + (notaExamenFinal * examenFinal);
        System.out.println("La nota final de " + nombreAlumno + " es de: " + notaFinal);

    }
}
