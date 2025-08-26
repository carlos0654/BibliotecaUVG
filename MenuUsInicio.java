import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class MenuUsInicio extends JPanel{

    // VARIABLES-----------------------------------------------------
    ImageIcon originalLogo = new ImageIcon("img/logoBiblioteca.png");
    Image imagenEscaladaLogo = originalLogo.getImage().getScaledInstance(300, 100, Image.SCALE_SMOOTH);
    ImageIcon imagenFinalLogo = new ImageIcon(imagenEscaladaLogo);
    JLabel etiquetaLogo = new JLabel(imagenFinalLogo);

    JPanel panelIndex = new JPanel();
    JButton buttonBuscar = new JButton("Buscar");
    JButton buttonFiltros = new JButton("Filtros");
    JTextField textFieldBuscador = new JTextField();
    Carrusel carruselTipos = new Carrusel();
    JScrollPane scrollCarrusel = new JScrollPane(carruselTipos);//colocar barra escroleable para el carrusel

    MenuUsInicio(JPanel panelContenedor, JFrame frameContenedor) {
        textFieldBuscador.setPreferredSize(new Dimension(400, 40));
        buttonBuscar.setPreferredSize(new Dimension(90, 40));
        buttonFiltros.setPreferredSize(new Dimension(90, 40));
        buttonBuscar.setFont(new Font("Arial", Font.PLAIN, 16));
        buttonFiltros.setFont(new Font("Arial", Font.PLAIN, 16));


        carruselTipos.setPreferredSize(new Dimension(2100, 150));

        scrollCarrusel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollCarrusel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollCarrusel.setPreferredSize(new Dimension(frameContenedor.getSize().width-panelContenedor.getSize().width, 150));
        
        panelIndex.add(textFieldBuscador);
        panelIndex.add(buttonBuscar);
        panelIndex.add(Box.createHorizontalStrut(100));
        panelIndex.add(buttonFiltros);

        etiquetaLogo.setAlignmentX(2);

        this.add(etiquetaLogo);
        this.add(panelIndex);

        this.add(scrollCarrusel);
    }
}
