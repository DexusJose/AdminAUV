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
import cusPane.paneImage;
import framesInternos.internalWin;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

/**
 *
 * @author Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>
 */
public class ventanaPrincipal {
    
    private final Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
    private final String Titulo ="Administración AUV";
    private final String version = "V 0.2.1";
    private final String ab = ".18XVIII13";
    
    public int altoPantalla = pantalla.height;
    public int anchoPantalla = pantalla.width;
    
        //Codigo para los colores
    public static final Color   fondoBarra          = new Color(51, 204, 204);
    
    public static final Color   nfondobarra         = new Color(144, 221,221);
    
    public static final Color   fondoVentana        = new Color(102, 179, 255);
    
    public static final Color   fondoPLateral       = new Color(171,194,194);
    
    public static final Color   fondoBtLateral      = new Color(235,230,222);
    
    public static final Color botones_laterales     = new Color(119,172,232);
    
    public static final Color FondoMenuLateral      = new Color(177,201,227);
    
    //Codigo para las fuentes
    public static final Font ArialB14 = new Font("Arial",Font.BOLD,14);
    public static final Font ArialP14 = new Font("Arial",Font.PLAIN,14);
    public static final Font ArialB12 = new Font("Arial",Font.BOLD,12);
    public static final Font ArialP12 = new Font("Arial",Font.PLAIN,12);
    public static final Font ArialB10 = new Font("Arial",Font.BOLD,10);
    public static final Font ArialP10 = new Font("Arial",Font.PLAIN,10);
    
    // Codigo para imagenes
    private final ImageIcon mainIcon    = new ImageIcon(AdministracionAUV.class.getResource("/resources/icon.png"));
    
    // ++++++++++ Bordes +++++++++++++
    public static Border bordeRin       =  BorderFactory.createSoftBevelBorder(BevelBorder.LOWERED);
    public static Border BordeVacio     = BorderFactory.createEmptyBorder();
    public static Border BordeBeRa      = BorderFactory.createBevelBorder(BevelBorder.RAISED);
    
    public GridBagConstraints constraints;
    public paneImage panelContenedor;
    private JPanel panelLateralBotones;
    private JDesktopPane panelPantallaPrincipal;
    private JPanel panelNotificaciones;
    private JPanel panelInformacion;
    private JButton bt_Productos,bt_Catalogo,bt_Proveedores,bt_contactos,bt_Facturas;
    private JMenuBar br_Menu;
    private JMenu m_File;
    private JMenuItem im_New, im_Open, im_Exit; 
    public JFrame win;
    
    private void cerrarApp(){
        if (JOptionPane.showConfirmDialog(win, "Esta seguro que desea cerrar el programa?","¿Cerrar aplicacion?",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                
            System.exit(0);
                
        }
    }
    
    private void fomWindowClosing(WindowEvent evt){
        cerrarApp();
    }
    
    public ventanaPrincipal(){
        
        initComponents();
                
    }

    public final void initComponents() {
    
        win =new JFrame();
        win.setTitle(Titulo + "  " + version + ab);
        win.setFont(ArialB14);
        
        //+++++++ Paneles contenedores +++++++++
        //panelContenedor = new JPanel();
        panelContenedor = new paneImage();
        panelLateralBotones = new JPanel();
        panelPantallaPrincipal = new JDesktopPane();
        panelNotificaciones = new JPanel();
        panelInformacion = new JPanel();
        
        //+++++++++++++ Botones +++++++++++++
        bt_Productos    = new JButton();   
        bt_Catalogo     = new JButton();
        
        
        //++++++++++++ Barra de menu ++++++++
        br_Menu = new JMenuBar();
        
        //++++++++++ Contenido de la barra +++++++++++
        m_File = new JMenu();
        //++++++++++ Items de menu archivo +++++++++++
        im_New  = new JMenuItem();
        im_Open = new JMenuItem();
        im_Exit = new JMenuItem();
        
        //+++++++++Codigo Ventana ++++++++++++
        win.setIconImage(mainIcon.getImage());
        win.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        //System.out.println(getDefaultCloseOperation());
        
        
        
        win.addWindowListener( new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                
                cerrarApp();
                
            }
            
            
            
        });
        win.setExtendedState(MAXIMIZED_BOTH);
        win.getContentPane().setLayout(new BoxLayout(win.getContentPane(), BoxLayout.LINE_AXIS));
        win.setPreferredSize(pantalla); 
        
        //++++++++++++ Codigo del panel contenedor +++++++++++++++
        panelContenedor.setBorder(bordeRin);
        panelContenedor.setOpaque(false);
        panelContenedor.setLayout(new GridBagLayout());
        
        //++++++++++++ Codigo del panel
        panelLateralBotones.setBorder(bordeRin);
        panelLateralBotones.setBackground(botones_laterales);
        panelLateralBotones.setOpaque(true);
        panelLateralBotones.setLayout(new GridLayout(14,1, 0, 0));
       
        
        //++++++++++++ Codigo botones ++++++++++++++
        bt_Productos.setText("Productos");
        bt_Productos.addActionListener((e) -> {
           
            JOptionPane.showMessageDialog(panelPantallaPrincipal, "Hola","Nueva notificación",JOptionPane.INFORMATION_MESSAGE);
            
        });
        bt_Productos.setBackground(FondoMenuLateral);
        bt_Productos.setBorder(BordeBeRa);
        
        panelLateralBotones.add(bt_Productos);
        
        bt_Catalogo.setText("Catálogo");
        
        bt_Catalogo.addActionListener((e)->{
            internalWin inte = new internalWin();
            inte.initInternal();
            panelPantallaPrincipal.add(inte);
        });
        bt_Catalogo.setBackground(FondoMenuLateral);
        bt_Catalogo.setBorder(BordeBeRa);
        
        panelLateralBotones.add(bt_Catalogo);
        
        //++++++++++++ constrains panel botones ++++++++++
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.weightx = 0.10;
        constraints.weighty = 1.0;
        panelContenedor.add(panelLateralBotones,constraints);
        
        //+++++++++++ panel de la pantalla principal ++++++++++
        
        panelPantallaPrincipal.setBorder(bordeRin);
        panelPantallaPrincipal.setOpaque(false);
        panelPantallaPrincipal.setLayout(new BoxLayout(panelPantallaPrincipal, BoxLayout.LINE_AXIS));
        
        //+++++++++++ constraints panel pantalla principal +++++++++
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        panelContenedor.add(panelPantallaPrincipal,constraints);
        
        //+++++++++++ panel de las notificaciones +++++++++++++
        panelNotificaciones.setBorder(bordeRin);
        panelNotificaciones.setOpaque(false);
        panelNotificaciones.setPreferredSize(new Dimension(100,100));
        panelNotificaciones.setLayout(new BoxLayout(panelNotificaciones, BoxLayout.LINE_AXIS));
        
        //++++++++++ Constraints del panel de notificaciones +++++++++
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.fill = java.awt.GridBagConstraints.BOTH;
        constraints.weightx = 0.10;
        constraints.weighty = 0.5;
        panelContenedor.add(panelNotificaciones, constraints);
        
        //++++++++++++ Panel de informacion ++++++++++++
        panelInformacion.setBorder(bordeRin);
        panelInformacion.setOpaque(false);
        //panelInformacion.setPreferredSize(new java.awt.Dimension(500, 100));
        panelInformacion.setLayout(new BoxLayout(panelInformacion, BoxLayout.LINE_AXIS));
        
        //+++++++++++++ constraints panel de informacion ++++++++++++
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.fill = java.awt.GridBagConstraints.BOTH;
        constraints.weightx = 1.0;
        constraints.weighty = 0.5;
        panelContenedor.add(panelInformacion, constraints);
        
        //++++++++++ union al frame ++++++++++
        win.getContentPane().add(panelContenedor);
        
        //++++++++ Codigos del menu Archivo +++++++++++
        m_File.setText("Archivo");
        m_File.setFont(ArialB14);
        
        //+++++++++ Submenus ++++++++
        im_New.setText("Nuevo");
        im_New.setFont(ArialB12);
        
        im_Open.setText("Abrir");
        im_Open.setFont(ArialB12);
        
        im_Exit.setText("Salir");
        im_Exit.setFont(ArialB12);
        im_Exit.addActionListener((e) -> {
            
            cerrarApp();
                        
        });
        
        //union de los items
        m_File.add(im_New);
        m_File.add(im_Open);
        m_File.add(im_Exit);
        //+++++++++++ insercion de la barra de menu +++++++++
        br_Menu.add(m_File);
        
        
        win.setJMenuBar(br_Menu);
        
        win.pack();
        
        
        
        
    }
    
    

    
}
