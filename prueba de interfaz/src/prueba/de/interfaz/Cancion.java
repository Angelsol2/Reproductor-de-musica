/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.de.interfaz;

/**
 *
 * @author ANGEL
 */
public class Cancion {
   private String nombre;
    private String artista;
    private int duracion;
   private String ruta_imagen;

    public Cancion(String nombre, String artista, int duracion,String ruta_imagen) {
        this.nombre = nombre;   
        this.artista = artista;
        this.duracion = duracion;
      this.ruta_imagen=ruta_imagen;
    }

    public Cancion() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracion() {
        return duracion;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getRuta_imagen() {
        return ruta_imagen;
    }

 

    @Override
    public String toString() {
        return "[" + nombre + " de -" + artista + " |" + duracion + "|" + ']';
    }

}

