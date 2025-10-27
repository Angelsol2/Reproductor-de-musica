/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba.de.interfaz;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.Color;
import static javax.swing.border.BevelBorder.LOWERED;
import javax.swing.border.Border;
import static javax.swing.border.EtchedBorder.RAISED;

public class PruebaDeInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame r1 = new JFrame("Reproductor");
      r1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r1.setSize(800, 150);
        Interfaz ventana = new Interfaz();
        r1.add(ventana);
        
        r1.setLocationRelativeTo(null);
  r1.setVisible(true);
        // TODO code application logic here
    }

}
