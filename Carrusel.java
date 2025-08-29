import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Carrusel extends JPanel {

    //VARIABLES----------------------------------------------------
    private CardPanel panelContenedor1 = new CardPanel("default.png","Imagen 1", Color.CYAN);
    private CardPanel panelContenedor2 = new CardPanel("inicio2.png","Imagen 2", Color.PINK);
    private CardPanel panelContenedor3 = new CardPanel("libros.png","", Color.CYAN);
    private CardPanel panelContenedor4 = new CardPanel("logoBiblioteca.png","hola", Color.PINK);
    private CardPanel panelContenedor5 = new CardPanel("","xdxdxdxdxdxdxd hola", Color.darkGray);


    public Carrusel() {
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS)); 

        ImageIcon originalLogo = new ImageIcon("img/logoBiblioteca.png");
        Image imagenEscaladaLogo = originalLogo.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
        ImageIcon imagenFinalLogo = new ImageIcon(imagenEscaladaLogo);
        JLabel etiquetaLogo = new JLabel(imagenFinalLogo);

        JLabel img2 = new JLabel("Imagen 2", JLabel.CENTER);
        img2.setOpaque(true);
        img2.setBackground(Color.PINK);

        JLabel img3 = new JLabel("Imagen 3", JLabel.CENTER);
        img3.setOpaque(true);
        img3.setBackground(Color.LIGHT_GRAY);

        /* 
        panelContenedor1.setBackground(Color.CYAN);
        panelContenedor2.setBackground(Color.white);
        panelContenedor3.setBackground(Color.red);
        panelContenedor4.setBackground(Color.blue);
        panelContenedor1.setBackground(Color.orange);
*/
        // Botones

        add(panelContenedor1);
        
        add(panelContenedor2);
        add(panelContenedor3);
        add(panelContenedor4);
        add(panelContenedor5);

        // Timer opcional para rotar automáticamente cada 3 seg
        javax.swing.Timer timer = new javax.swing.Timer(3000, e -> mostrarSiguiente());
        timer.start();
    }

    private void mostrarSiguiente() {
    }

    private void mostrarAnterior() {
    }
}
