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

import cusPane.paneImage;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>
 */
public class ventanaPrincipal extends JFrame{
    
    private final Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
    
    public int altoPantalla = pantalla.height;
    public int anchoPantalla = pantalla.width;
    
    public GridBagConstraints constraints;
    public paneImage panelContenedor;
    private JPanel panelLateralBotones;
    private JPanel panelPantallaPrincipal;
    private JPanel panelNotificaciones;
    private JPanel panelInformacion;
    private JButton bt_Productos;
    private JMenuBar br_Menu;
    private JMenu m_File;
    
    public ventanaPrincipal(){
        
        initComponents();
                
    }

    public final void initComponents() {
    
        
        
        //+++++++ Paneles contenedores +++++++++
        //panelContenedor = new JPanel();
        panelContenedor = new paneImage();
        panelLateralBotones = new JPanel();
        panelPantallaPrincipal = new JPanel();
        panelNotificaciones = new JPanel();
        panelInformacion = new JPanel();
        
        //+++++++++++++ Botones +++++++++++++
        bt_Productos    = new JButton();
        
        //++++++++++++ Barra de menu ++++++++
        br_Menu = new JMenuBar();
        
        //++++++++++ Contenido de la barra +++++++++++
        m_File = new JMenu();
        
        //+++++++++Codigo Ventana ++++++++++++
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));
        setPreferredSize(pantalla); 
        
        //++++++++++++ Codigo del panel contenedor +++++++++++++++
        panelContenedor.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        panelContenedor.setOpaque(false);
        panelContenedor.setLayout(new GridBagLayout());
        
        //++++++++++++ Codigo del panel
        panelLateralBotones.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        //panelLateralBotones.setMinimumSize(new Dimension(100,200));
        panelLateralBotones.setOpaque(false);
        panelLateralBotones.setLayout(new GridLayout(12,1,0,10));
        
        //++++++++++++ Codigo botones ++++++++++++++
        bt_Productos.setText("Productos");
        bt_Productos.addActionListener((e) -> {
           
            dispose();
            
        });
        panelLateralBotones.add(bt_Productos);
        
        //++++++++++++ constrains panel botones ++++++++++
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 2;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 0.10;
        constraints.weighty = 1.0;
        panelContenedor.add(panelLateralBotones,constraints);
        
        //+++++++++++ panel de la pantalla principal ++++++++++
        panelPantallaPrincipal.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        panelPantallaPrincipal.setOpaque(false);
        //panelPantallaPrincipal.setPreferredSize(new Dimension(500,100));
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
        panelNotificaciones.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        panelNotificaciones.setOpaque(false);
        //panelNotificaciones.setPreferredSize(new Dimension(100,100));
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
        panelInformacion.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
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
        getContentPane().add(panelContenedor);
        
        //+++++++++++ insercion de la barra de menu +++++++++
        m_File.setText("Archivo");
        br_Menu.add(m_File);
        
        setJMenuBar(br_Menu);
        
        pack();
        
        
        
        
    }
}
