package Actividad1;

import java.util.Date;

public class Autor {
    private String nombre;
    private String Nacionalidad;
    private Date FechaNac;

    public Autor(String nombre, String nacionalidad, Date fechaNac) {
        this.nombre = nombre;
        this.Nacionalidad = nacionalidad;
        this.FechaNac = fechaNac;
    }

    public String buscarLibro(){
        System.out.println("Metodo para buscar un libro mediante el nombre de autor");
        return "Nombre";
    }


}
