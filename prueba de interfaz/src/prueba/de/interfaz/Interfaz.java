/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.de.interfaz;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BoxLayout;
import javax.swing.border.Border;
import java.net.URL;

public class Interfaz extends JPanel {

    JButton boton_anterior;
    JButton boton_detener;
    JButton boton_pausa;
    JButton boton_siguiente;
    JButton boton_aleatorio;
    JLabel Artista;
    JLabel Nombre;
    Timer actualizador;
    boolean esta_pausado;
    JProgressBar mi_barra;
    JButton espacio;
    JLabel imagen;

    public Interfaz() {
        Playlist play = new Playlist();
        this.setLayout(null);
        this.setBackground(new Color(25, 25, 40));//El color del fondo
        // url de las imagenes
        URL urlIconoPausa = getClass().getResource("/iconos/NuevoPausa.png");
        URL urlsiguiente = getClass().getResource("/iconos/NuevoSiguiente.png");
        URL urlanterior = getClass().getResource("/iconos/NuevoAnterior (2) .png");
        URL ur1play = getClass().getResource("/iconos/NuevoPlay.png");
        URL ur1detemer = getClass().getResource("/iconos/NuevoDetemer.png");
        // creacion de las variables de las url
        ImageIcon iconoPausa = new ImageIcon(urlIconoPausa);
        ImageIcon iconosiguiente = new ImageIcon(urlsiguiente);
        ImageIcon iconoatras = new ImageIcon(urlanterior);
        ImageIcon iconoplay = new ImageIcon(ur1play);
        ImageIcon iconodetener = new ImageIcon(ur1detemer);

        //Canciones
        Cancion c1 = new Cancion("imortals", "Fall out boy", 4, "/iconos/big.jpg");
        Cancion c2 = new Cancion("Carta a dios", "GREEN A", 4, "/iconos/carta.jpg");
        Cancion c3 = new Cancion("Fnaf", "The living Tombsone", 4, "/iconos/fnaf.jpg");
        Cancion c4 = new Cancion("No me etiquetes", "Grean A", 4, "/iconos/etiqueta.jpeg");
        Cancion c5 = new Cancion("Thunder", "Imagine Dragons", 4, "/iconos/img.jpg");
        Cancion c6 = new Cancion("Hayloft ||", "Mother Mother", 4, "/iconos/mm.jpeg");
        Cancion c7 = new Cancion("my kind of woman", "Mac de Marco", 4, "/iconos/king.jpeg");
        Cancion c8 = new Cancion("if you want love", "NF", 4, "/iconos/nf.jpeg");

        play.agregarCancion(c1);
        play.agregarCancion(c2);
        play.agregarCancion(c3);
        play.agregarCancion(c4);
        play.agregarCancion(c5);
        play.agregarCancion(c6);
        play.agregarCancion(c7);
        play.agregarCancion(c8);
        Cancion actual = c1;

        // declaracion del las imagenes en los botones
        boton_anterior = new JButton(redimensionarIcono(iconoatras, 30, 30));
        boton_detener = new JButton(redimensionarIcono(iconodetener, 30, 30));
        boton_pausa = new JButton(redimensionarIcono(iconoplay, 30, 30));
        boton_siguiente = new JButton(redimensionarIcono(iconosiguiente, 30, 30));
        boton_aleatorio = new JButton("Aleatorio");
        Artista = new JLabel();
        Nombre = new JLabel();
        mi_barra = new JProgressBar(0, 100);
        mi_barra.setStringPainted(true);
        imagen = new JLabel();
        // Especificaciones de del tipo de letra 
        Artista.setForeground(Color.white);
        Nombre.setForeground(Color.white);
        Font tamñalo = new Font("Arial", Font.BOLD, 18);
        Nombre.setFont(tamñalo);
        Font tamaño = new Font("Arial", Font.PLAIN, 10);
        Artista.setFont(tamaño);

        //barra que no puse xd
        mi_barra.setBackground(Color.WHITE);
        mi_barra.setBorderPainted(false);
        mi_barra.setStringPainted(true);
        mi_barra.setString("01:44 / 03:20");

        //El pocicionamiento de los botones
        Nombre.setBounds(120, 30, 250, 30);
        Artista.setBounds(120, 50, 150, 30); //x.y/ancho , alto
        boton_anterior.setBounds(400, 40, 50, 30);
        boton_detener.setBounds(460, 40, 50, 30);
        boton_pausa.setBounds(520, 40, 50, 30);
        boton_siguiente.setBounds(580, 40, 50, 30);
        boton_aleatorio.setBounds(620, 40, 50, 30);
        mi_barra.setBounds(300, 80, 420, 15);
        imagen.setBounds(20, 20, 80, 80);

        //Boton traslusido y quitado del borde del boton
        JButton miBotonConIcono = new JButton(iconoplay);
        boton_pausa.setContentAreaFilled(false);
        boton_pausa.setBorderPainted(false);
        boton_anterior.setContentAreaFilled(false);
        boton_anterior.setBorderPainted(false);
        boton_detener.setContentAreaFilled(false);
        boton_detener.setBorderPainted(false);
        boton_siguiente.setContentAreaFilled(false);
        boton_siguiente.setBorderPainted(false);
        boton_aleatorio.setContentAreaFilled(false);
        boton_aleatorio.setBorderPainted(false);
        boton_pausa.setFocusPainted(false);
        
        //El enfoque al moemnto de hacer clik
        boton_detener.setFocusPainted(false);
        boton_siguiente.setFocusPainted(false);
        boton_anterior.setFocusPainted(false);

        //Agregado de los botones
        this.add(Artista);
        this.add(Nombre);
        this.add(boton_anterior);
        this.add(boton_detener);
        this.add(boton_pausa);
        this.add(boton_siguiente);
        this.add(imagen);
        this.add(miBotonConIcono);

        this.esta_pausado = true;

        //Las acciones al hacer clik
        boton_anterior.addActionListener(e -> {
            Cancion cancionAnterior = play.Anterior();
            mostrarCancionActual(cancionAnterior);
            boton_anterior.setFocusable(false);
        });
        boton_siguiente.addActionListener(e -> {
            Cancion cancionsiguiente = play.Siguiente();
            mostrarCancionActual(cancionsiguiente);
            boton_siguiente.setFocusable(false);

        });
        boton_detener.addActionListener(e -> {
            System.exit(0);

        });
        boton_pausa.addActionListener(e -> {;
            if (esta_pausado) {
                boton_pausa.setIcon(redimensionarIcono(iconoplay, 30, 30));
                mostrarCancionActual(actual);
                esta_pausado = false;
            } else {
                boton_pausa.setIcon(redimensionarIcono(iconoPausa, 30, 30));

                esta_pausado = true;

            }
        });
    }

    //Metodos soporte 
    private void mostrarCancionActual(Cancion cancion) {
        if (cancion != null) {
            Artista.setText(cancion.getArtista());
            Nombre.setText(cancion.getNombre());
            URL urlImagen = getClass().getResource(cancion.getRuta_imagen());
            ImageIcon nuevaImagen = new ImageIcon(urlImagen);
            imagen.setIcon(redimensionarIcono(nuevaImagen, 80, 80));

        }
    }

    private ImageIcon redimensionarIcono(ImageIcon iconoatras, int ancho, int altura) {
        Image imagen = iconoatras.getImage();
        Image nuevaImagen = imagen.getScaledInstance(ancho, altura, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(nuevaImagen);
    }
}
