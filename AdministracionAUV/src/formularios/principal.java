/*
 * Copyright 2018 Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package formularios;

import administracionauv.AdministracionAUV;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>
 */
public class principal {
    
    //Strings del programa
    
    private final String version= "\nVersión: 0.1.3";
    private final String beta   = "18XII05";
    //private final String beta   = "";
    private final String message="Bienvenido a:\n";    
    
    //Codigo de los paneles
    public JPanel PanelbarraLateral;
    
    //Codigo para los colores
    public static final Color   fondoBarra          = new Color(51, 204, 204);
    
    public static final Color   fondoVentana        = new Color(102, 179, 255);
    
    public static final Color   fondoPLateral       = new Color(171,194,194);
    
    public static final Color   fondoBtLateral      = new Color(235,230,222);
    
    //Codigo para las fuentes
    public static final Font ArialB14 = new Font("Arial",Font.BOLD,14);
    public static final Font ArialP14 = new Font("Arial",Font.PLAIN,14);
    public static final Font ArialB12 = new Font("Arial",Font.BOLD,12);
    public static final Font ArialP12 = new Font("Arial",Font.PLAIN,12);
    public static final Font ArialB10 = new Font("Arial",Font.BOLD,10);
    public static final Font ArialP10 = new Font("Arial",Font.PLAIN,10);
    
    // Codigo para imagenes
        private final ImageIcon mainIcon    = new ImageIcon(AdministracionAUV.class.getResource("/resources/icon.png"));

    
    // Codigo para el frame ventana
    private final String TituloFrame = "Administración AUV";
    private final Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
    
    public int altoPantalla  = pantalla.height;
    public int largoPantalla = pantalla.width;
    
    
    private JFrame ventana;
    private JMenuBar barra_menu;
    private JMenu m_archivo;
    private JButton b_productos;
    private JTextArea etiquetainf, etiquetanot, areainf;
    private GridBagConstraints grid_menuB,grid_barraL,grid_panelPrincipal,grid_pantallanot,grid_pantallainf;
    private JMenuItem im_Salir;

    
    public void crear_ventana(){
        JOptionPane.showMessageDialog(null, message+TituloFrame+version+beta);
        configurar_ventana();
    }

    private void configurar_ventana() {
        
        // Instancia de los objetos.
        ventana = new JFrame();
                
        //configuracion de layout.
        ventana.getContentPane().setLayout(new GridBagLayout());
        
        //instancia de las grid_menuB
        grid_menuB = new GridBagConstraints();
        grid_barraL = new GridBagConstraints();
        grid_panelPrincipal = new GridBagConstraints();
        grid_pantallainf = new GridBagConstraints();
        grid_pantallanot = new GridBagConstraints();
        
        //instancia de la barra del menu.
        barra_menu = new JMenuBar();
        barra_menu.setBackground(fondoBarra);
        barra_menu.setFont(ArialB14);
        
        //Configuracion de la barra de menu en el grid
        grid_menuB.gridx = 0; //Columna a definir
        grid_menuB.gridy = 0; //fila a definir
        grid_menuB.gridwidth = 3;//ancho
        grid_menuB.gridheight = 1;//alto
        grid_menuB.fill = GridBagConstraints.HORIZONTAL;
        grid_menuB.anchor = GridBagConstraints.NORTH;
        grid_menuB.weighty = 0.0;
        grid_menuB.weightx = 0.0;
        
        
        //instancia del menu en la barra.
        m_archivo = new JMenu("Archivo");
        barra_menu.add(m_archivo);
        
        //Agregado del los items a la barra de menu.
        im_Salir = new JMenuItem("Salir");
        im_Salir.setFont(ArialB12);
        m_archivo.add(im_Salir);
        
        //Configuracion del boton productos
        //Codigo para los botones del menu lateral
        b_productos = new JButton("Productos");
        b_productos.setFont(ArialB12);        
        grid_barraL.gridx = 0;
        grid_barraL.gridy = 1;
        grid_barraL.gridheight = 1;
        grid_barraL.gridwidth = 1;
        grid_barraL.fill = GridBagConstraints.BOTH;
        grid_barraL.anchor = GridBagConstraints.CENTER;
        grid_barraL.weightx = 0.05;
        grid_barraL.weighty = 1.0;
        
        
        //Pantalla de texto
        etiquetainf = new JTextArea("Pantalla principal");
        grid_panelPrincipal.gridx = 1;
        grid_panelPrincipal.gridy = 1;
        grid_panelPrincipal.gridheight = 1;
        grid_panelPrincipal.gridwidth = 2;
        grid_panelPrincipal.fill = GridBagConstraints.BOTH;
        grid_panelPrincipal.anchor = GridBagConstraints.CENTER;
        grid_panelPrincipal.weightx = 1.0;
        grid_panelPrincipal.weighty = 0.0;
        
        //Pantalla de notificaciones
        etiquetanot = new JTextArea("Pantalla notificaciones");
        etiquetanot.setBackground(Color.LIGHT_GRAY);
        grid_pantallanot.gridx = 0;
        grid_pantallanot.gridy = 2;
        grid_pantallanot.gridheight = 1;
        grid_pantallanot.gridwidth = 1;        
        grid_pantallanot.fill = GridBagConstraints.BOTH;
        grid_pantallanot.anchor = GridBagConstraints.NORTH;
        grid_pantallanot.weightx = 0.05;
        grid_pantallanot.weighty = 0.20;
        
        //Pantalla de Informacion
        areainf = new JTextArea("Pantalla informacion");
        areainf.setBackground(Color.GRAY);
        grid_pantallainf.gridx = 1;
        grid_pantallainf.gridy = 2;
        grid_pantallainf.gridheight = 1;
        grid_pantallainf.gridwidth = 2;
        grid_pantallainf.fill = GridBagConstraints.BOTH;
        grid_pantallainf.anchor = GridBagConstraints.CENTER;
        grid_pantallainf.weightx = 1.0;
        grid_pantallainf.weighty = 0.20;
        
        //Adhesion de los componetes al grid de la pantalla.
        ventana.getContentPane().add(areainf,grid_pantallainf);
        ventana.getContentPane().add(etiquetanot,grid_pantallanot);
        ventana.getContentPane().add(etiquetainf,grid_panelPrincipal);
        ventana.getContentPane().add(barra_menu,grid_menuB);
        ventana.getContentPane().add(b_productos,grid_barraL);
        
//        JButton boton = new JButton("boton");
//        GridBagConstraints bt = new GridBagConstraints();
//        bt.gridx = 2;
//        bt.gridy = 2;
//        bt.gridheight = 1;
//        bt.gridwidth = 1;
//        bt.anchor = GridBagConstraints.CENTER;
//        //bt.fill = GridBagConstraints.BOTH;
//        bt.weightx = 0.0;
//        bt.weighty = 0.0;
//        ventana.getContentPane().add(boton,bt);
        
        im_Salir.addActionListener((e) -> {
            ventana.dispose();
        });
        
        b_productos.addActionListener((e) -> {
            ventana.dispose();
        });
        
        
        ventana.setTitle(TituloFrame+ " "+version+beta);
        ventana.setPreferredSize(new Dimension(largoPantalla,altoPantalla));
        ventana.getContentPane().setBackground(fondoVentana); 
        ventana.setIconImage(mainIcon.getImage());
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setExtendedState(Frame.MAXIMIZED_BOTH);
        ventana.setResizable(true);
        //System.out.println("dimension de la pantalla: "+pantalla);      
        
        
    }
    
    
}
