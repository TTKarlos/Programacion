package Objetos;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    String genero;
    String dni;

    //Metodo contructor
    public Persona(String nombre,int edad, String genero, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.dni = dni;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
        System.out.println("El genero es: " + genero);
        System.out.println("EL dni es: " + dni);
    }
}
