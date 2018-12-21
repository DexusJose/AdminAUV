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
package cusPane;


import administracionauv.AdministracionAUV;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>
 */
public class paneImage extends JPanel{
    
    private final ImageIcon Fondo    = new ImageIcon(AdministracionAUV.class.getResource("/resources/1024.png"));
    
    public paneImage(){
        
       //this.setSize(new Dimension(getSize().width,getSize().height));
    }

    
    public void paint(Graphics g){
        int widht = getSize().width/2;
        int height= getSize().height/2;
        
        g.drawImage(Fondo.getImage(), ((getSize().width/2)-(widht/2))+100, ((getSize().height/3)-(height/2))+50, widht-150,height+50,null);
        
        setOpaque(false);
        super.paint(g);
        
    }
    
}
