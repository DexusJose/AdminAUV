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
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>
 */
public class ventanaPrincipal extends JFrame{
    
    public GridBagConstraints constraints;
    public paneImage panelContenedor;
    private JPanel panelLateralBotones;
    private JPanel panelPantallaPrincipal;
    private JPanel panelNotificaciones;
    private JPanel panelInformacion;
    private JButton bt_Productos;
    private JMenuBar br_Menu;
    
    public ventanaPrincipal(){
        
        initComponents();
                
    }

    public final void initComponents() {
    
        //+++++++ Paneles contenedores +++++++++
        panelContenedor = new paneImage();
        panelLateralBotones = new JPanel();
        panelPantallaPrincipal = new JPanel();
        panelNotificaciones = new JPanel();
        panelInformacion = new JPanel();
        
        //+++++++++++++ Botones +++++++++++++
        bt_Productos    = new JButton();
        
        //++++++++++++ Barra de menu ++++++++
        br_Menu = new JMenuBar();
        
        
    }
}
