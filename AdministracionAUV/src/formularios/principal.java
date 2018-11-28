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
    
    private final String version= "\nVersión: 0.1.0";
    private final String beta   = "b18XI";
    //private final String beta   = "";
    private final String message="Bienvenido a:\n";    
    
    //Codigo para los colores
    public static final Color   fondoBarra          = new Color(51, 204, 204);
    
    public static final Color   fondoVentana        = new Color(102, 179, 255);
    
    public static final Color   fondoPLateral       = new Color(171,194,194);
    
    public static final Color   fondoBtLateral      = new Color(235,230,222);
    
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
    
    public void crear_ventana(){
        JOptionPane.showMessageDialog(null, message+TituloFrame+version+beta);
        configurar_ventana();
    }

    private void configurar_ventana() {
        
        ventana = new JFrame();
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
        System.out.println("dimension de la pantalla: "+pantalla);
        
        ventana.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
//        barra_menu = new JMenuBar();
//        GridBagConstraints constraints = new GridBagConstraints();
//        constraints.gridx=0;
//        constraints.gridy=0;
//        constraints.gridheight=1;//columnas
//        constraints.gridwidth=3;//filas
//        ventana.getContentPane().add(barra_menu);
//        
//        m_archivo = new JMenu("Archivo");
//        barra_menu.add(m_archivo);
//        
//        b_productos = new JButton("Productos");
//        constraints.gridx=1;//columna
//        constraints.gridy=0;//fila
//        constraints.gridheight=1;//columnas
//        constraints.gridwidth=1;//filas
//        ventana.getContentPane().add(b_productos);
//        
//        etiquetanot = new JTextArea("Notificaciones");
//        
//        ventana.getContentPane().add(etiquetanot);
//        
//        etiquetainf = new JTextArea("Información");
//        
//        ventana.getContentPane().add(etiquetainf);
//        
        //--------------------------------
        JTextArea cajaTexto = new JTextArea("Area texto"); 
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        // El area de texto debe estirarse en ambos sentidos. Ponemos el campo fill.
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1.0; 
        ventana.getContentPane().add (cajaTexto, constraints); 
        constraints.weighty = 0.0;

        JButton boton1 = new JButton ("Boton 1"); 
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;
        // El botón 1 debe ocupar la posición NORTH de su celda 
        constraints.anchor = GridBagConstraints.NORTH;
        // El botón 1 no debe estirarse. Habíamos cambiado este valor en el
        // area de texto, asi que lo restauramos.
        constraints.fill = GridBagConstraints.NONE;
        ventana.getContentPane().add (boton1, constraints);
        // Restauramos valores por defecto
        constraints.anchor = GridBagConstraints.CENTER; 
        constraints.weighty = 0.0; 

        JButton boton2 = new JButton ("Boton 2");
        constraints.gridx = 2;
        constraints.gridy = 1; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1; 
        constraints.weighty = 1.0; 
        // El boton 2 debe ocupar la posición NORTH de su celda. 
        constraints.anchor = GridBagConstraints.NORTH;
        ventana.getContentPane().add (boton2, constraints);
        // Restauramos valores por defecto.
        constraints.weighty = 0.0; 
        constraints.anchor = GridBagConstraints.CENTER; 

        JButton boton3 = new JButton ("Boton 3"); 
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1; 
        constraints.gridheight = 1; 
        ventana.getContentPane().add (boton3, constraints); 

        JButton boton4 = new JButton ("Boton 4");
        constraints.gridx = 2;
        constraints.gridy = 2; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        ventana.getContentPane().add (boton4, constraints);

        JTextField campoTexto = new JTextField ("Campo texto");
        constraints.gridx = 1; 
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        // El campo de texto debe estirarse sólo en horizontal.
        constraints.fill = GridBagConstraints.HORIZONTAL;
        ventana.getContentPane().add (campoTexto, constraints);
        
        
        
    }
    
    
}
