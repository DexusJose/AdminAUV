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
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

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
        private final ImageIcon mainIcon    = new ImageIcon(AdministracionAUV.class.getResource("/resources/logo.png"));

    
    // Codigo para el frame ventana
    private final String TituloFrame = "Administración AUV";
    private final Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
    
    public int altoPantalla  = pantalla.height;
    public int largoPantalla = pantalla.width;
    
    
    private JFrame ventana;
    
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
    }
    
    
}
