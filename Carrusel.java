import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Carrusel extends JPanel {

    //VARIABLES----------------------------------------------------
    private JPanel panelContenedor1 = new JPanel();
    private JPanel panelContenedor2 = new JPanel();
    private JPanel panelContenedor3 = new JPanel();
    private JPanel panelContenedor4 = new JPanel();
    private JPanel panelContenedor5 = new JPanel();
    private int index = 0;
    private int total = 0;

    public Carrusel() {
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS)); 

        // Ejemplo con 3 slides (puedes reemplazar con lo que quieras)
        JLabel img1 = new JLabel("Imagen 1", JLabel.CENTER);
        // img1.setOpaque(true);
        img1.setBackground(Color.CYAN);

        ImageIcon originalLogo = new ImageIcon("img/logoBiblioteca.png");
        Image imagenEscaladaLogo = originalLogo.getImage().getScaledInstance(500, 150, Image.SCALE_SMOOTH);
        ImageIcon imagenFinalLogo = new ImageIcon(imagenEscaladaLogo);
        JLabel etiquetaLogo = new JLabel(imagenFinalLogo);

        JLabel img2 = new JLabel("Imagen 2", JLabel.CENTER);
        img2.setOpaque(true);
        img2.setBackground(Color.PINK);

        JLabel img3 = new JLabel("Imagen 3", JLabel.CENTER);
        img3.setOpaque(true);
        img3.setBackground(Color.LIGHT_GRAY);

        panelContenedor1.setBackground(Color.CYAN);
        panelContenedor2.setBackground(Color.white);
        panelContenedor3.setBackground(Color.red);
        panelContenedor4.setBackground(Color.blue);
        panelContenedor1.setBackground(Color.orange);

        panelContenedor1.setPreferredSize(new Dimension(500,150));
        panelContenedor2.setPreferredSize(new Dimension(500,150));
        panelContenedor3.setPreferredSize(new Dimension(500,150));
        panelContenedor4.setPreferredSize(new Dimension(500,150));
        panelContenedor5.setPreferredSize(new Dimension(500,150));
        
        panelContenedor1.add(img1);
        panelContenedor1.add(etiquetaLogo);
        panelContenedor3.add(img2);
        panelContenedor4.add(img3);

        total = 3; // cantidad de slides

        // Botones
        JButton botonAnterior = new JButton("⟨");
        JButton botonSiguiente = new JButton("⟩");

        botonAnterior.addActionListener(e -> mostrarAnterior());
        botonSiguiente.addActionListener(e -> mostrarSiguiente());

        JPanel panelBotones = new JPanel(new BorderLayout());
        panelBotones.add(botonAnterior, BorderLayout.WEST);
        panelBotones.add(botonSiguiente, BorderLayout.EAST);

        add(panelContenedor1);
        
        add(panelContenedor2);
        add(panelContenedor3);
        add(panelContenedor4);
        add(panelContenedor5);
        add(panelBotones);

        // Timer opcional para rotar automáticamente cada 3 seg
        javax.swing.Timer timer = new javax.swing.Timer(3000, e -> mostrarSiguiente());
        timer.start();
    }

    private void mostrarSiguiente() {
        index = (index + 1) % total;
    }

    private void mostrarAnterior() {
        index = (index - 1 + total) % total;
    }
}
