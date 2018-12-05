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
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>
 */
public class principal {
    
    //Strings del programa
    
    private final String version= "\nVersión: 0.1.3";
    private final String beta   = "18XII04";
    //private final String beta   = "";
    private final String message="Bienvenido a:\n";    
    
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
    private JTextArea etiquetanot;
    private JTextArea etiquetainf;
    private GridBagConstraints restricciones;
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
        
        //instancia de las restricciones
        restricciones = new GridBagConstraints();
        
        //instancia de la barra del menu.
        barra_menu = new JMenuBar();
        barra_menu.setBackground(fondoBarra);
        barra_menu.setFont(ArialB14);
        
        //Configuracion de la barra de menu en el grid
        restricciones.gridx = 0; //Columna a definir
        restricciones.gridy = 1; //fila a definir
        restricciones.gridwidth = 1;//ancho
        restricciones.gridheight = 1;//alto
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.anchor = GridBagConstraints.NORTH;
        restricciones.weighty = 1.0;
        restricciones.weightx = 1.0;
        
        
        //instancia del menu en la barra.
        m_archivo = new JMenu("Archivo");
        barra_menu.add(m_archivo);
        
        //Agregado del los items a la barra de menu.
        im_Salir = new JMenuItem("Salir");
        im_Salir.setFont(ArialB12);
        m_archivo.add(im_Salir);
        
        //Adhesion de los componetes al grid de la pantalla.
        ventana.getContentPane().add(barra_menu,restricciones);
        
        im_Salir.addActionListener((e) -> {
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
