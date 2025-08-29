import java.util.*;
import javax.swing.*;
import java.awt.*;

class CardPanel extends JPanel {
    private JLabel titulo;
    
    public CardPanel(String texto, Color color) {
        setBackground(color);
        setPreferredSize(new Dimension(200, 150)); // tamaño fijo
        setLayout(new BorderLayout());

        titulo = new JLabel(texto, JLabel.CENTER);
        add(titulo, BorderLayout.CENTER);
    }

    public void setTitulo(String texto) {
        titulo.setText(texto);
    }
}
