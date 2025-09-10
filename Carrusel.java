<<<<<<< HEAD:Usuario/Carrusel.java
package Usuario;
=======
import java.util.*;
>>>>>>> parent of abed33b (Usuario separado):Carrusel.java
import javax.swing.*;
import java.awt.*;

public class Carrusel extends JPanel {

    //VARIABLES----------------------------------------------------
    private CardPanel panelContenedor1 = new CardPanel("default.png","Imagen 1", Color.darkGray);
    private CardPanel panelContenedor2 = new CardPanel("inicio2.png","Imagen 2", Color.darkGray);
    private CardPanel panelContenedor3 = new CardPanel("libros.png","Matematicas", Color.darkGray);
    private CardPanel panelContenedor4 = new CardPanel("logoBiblioteca.png","hola", Color.darkGray);
    private CardPanel panelContenedor5 = new CardPanel("default.png","xdxdxdxdxdxdxd hola", Color.darkGray);
    private CardPanel panelContenedor6 = new CardPanel("default.png","xdxdxdxdxdxdxd hola", Color.darkGray);
    private CardPanel panelContenedor7 = new CardPanel("default.png","xdxdxdxdxdxdxd hola", Color.darkGray);
    private CardPanel panelContenedor8 = new CardPanel("default.png","xdxdxdxdxdxdxd hola", Color.darkGray);


    public Carrusel() {
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS)); 

        /*
      
        panelContenedor1.setBackground(Color.CYAN);
        panelContenedor2.setBackground(Color.white);
        panelContenedor3.setBackground(Color.red);
        panelContenedor4.setBackground(Color.blue);
        panelContenedor1.setBackground(Color.orange);
*/
        // Botones

        add(panelContenedor1);
        add(Box.createHorizontalStrut(20));
        add(panelContenedor2);
        add(Box.createHorizontalStrut(20));
        add(panelContenedor3);
        add(Box.createHorizontalStrut(20));
        add(panelContenedor4);
        add(Box.createHorizontalStrut(20));
        add(panelContenedor5);
        add(Box.createHorizontalStrut(20));
        add(panelContenedor6);
        add(Box.createHorizontalStrut(20));
        add(panelContenedor7);
        add(Box.createHorizontalStrut(20));
        add(panelContenedor8);

        // Timer opcional para rotar automáticamente cada 3 seg
        //javax.swing.Timer timer = new javax.swing.Timer(3000, e -> mostrarSiguiente());
        //timer.start();
    }
}
