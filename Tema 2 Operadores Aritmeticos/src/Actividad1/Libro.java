package Actividad1;

import java.util.Date;

public class Libro extends Autor {
        private String isbn;
        private String titulo;
        private Genero genero;

    public Libro(String nombre, String nacionalidad, Date fechaNac, String isbn, String titulo, Genero genero) {
        super(nombre, nacionalidad, fechaNac);
        this.isbn = isbn;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int prestamoMaximo (){
        System.out.println("Calcular el numero de libros que tiene el cliente");
        return 3;
    }

    private void setAutor(Autor autor){

    }



}
