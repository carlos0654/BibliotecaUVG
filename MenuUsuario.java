import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class MenuUsuario extends JFrame {
    
    // VARIABLES----------------------------------------------------
    //panel izquierdo
    JPanel panelIzquierdo = new JPanel();
    JButton botoncambio = new JButton("1");
    JButton botoncambio2 = new JButton("2");
    JButton botoncambio3 = new JButton("3");
    JButton botoncambio4 = new JButton("4");

    //panel derecho
    CardLayout cardBusqueda = new CardLayout(); //cardlayout para contener los menus
    JPanel panelContenedor = new JPanel(cardBusqueda); //Jpanel contenedor del lado derecho

    //panel derecho - menu de inicio
    MenuUsInicio menuInicio;
    

    //panel derecho - menu configuraciones
    JPanel panelConfiguraciones = new JPanel();

    //panel derecho - menu de busqueda
    MenuUsBusqueda menubusqueda = new MenuUsBusqueda();
    JScrollPane scrollPane = new JScrollPane(menubusqueda);// colocar barra escroleable para ver mas lista

    
    
    //Emmmmm pos no quiten el runnable alli miro si lo quito :v
    Runnable centrarTodo = () -> {
                
    };
    
    MenuUsuario(String titulo) {
        //FRAME--------------------------------------------------------
        this.setTitle(titulo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200, 720);
        this.setMinimumSize(new Dimension(250, 300));
        this.setLocationRelativeTo(null);


        /*PANEL IZQUIERDO
        *============================================================================
        */
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS)); //layaout de lista
        panelIzquierdo.setPreferredSize(new Dimension(200, 720));
        panelIzquierdo.setBackground(Color.DARK_GRAY);
        panelIzquierdo.add(new JLabel("Panel Izquierdo"));


        panelIzquierdo.add(botoncambio);
        panelIzquierdo.add(botoncambio2);
        panelIzquierdo.add(botoncambio3);
        panelIzquierdo.add(botoncambio4);

        
        
        /*PANEL DERECHO
        * =======================================================================
        */
        //Panel INICIO--------------------------------------------
        menuInicio = new MenuUsInicio(panelContenedor, this);
        //FIN PANEL INICIO-----------------------------------------

        //PANEL CONFIGURACIONES--------------------------------------------

        //FIN PANEL CONFIGURACIONES-----------------------------------------

        //PANEL BUSQUEDA------------------------------------------
          scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
          scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //FIN PANEL BUSQUEDA--------------------------------


        // ADD CONTENDOR---------------------------------------------------------------------
        panelContenedor.add(menuInicio, "Menu1");
        panelContenedor.add(scrollPane, "Menu2");
        panelContenedor.add(panelConfiguraciones, "Menu3");

        //ADD
        getContentPane().add(panelIzquierdo, BorderLayout.WEST);//panel izquierdo
        getContentPane().add(panelContenedor, BorderLayout.CENTER);//panel derecho
        


        //LISTENERS------------------------------------------------------------
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                if (getSize().width < 800) {
                    centrarTodo.run();
                    panelIzquierdo.setVisible(false);
                }else{
                    centrarTodo.run();                    
                    panelIzquierdo.setVisible(true);
                }

            }
        });
        botoncambio.addActionListener(e -> cardBusqueda.show(panelContenedor, "Menu1"));
        botoncambio2.addActionListener(e -> cardBusqueda.show(panelContenedor, "Menu2"));
        botoncambio3.addActionListener(e -> cardBusqueda.show(panelContenedor, "Menu3"));



        

    }
}
