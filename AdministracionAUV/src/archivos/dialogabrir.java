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
package archivos;

import administracionauv.AdministracionAUV;
import formularios.ventanaPrincipal;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RootPaneContainer;
import sun.java2d.pipe.BufferedOpCodes;

/**
 *
 * @author Ing. Dexus José Pérez <jose_perezmiranda@outlook.com>
 */
public class dialogabrir {
    
    public Connection conexion;
    
    public Statement sentencia;
    
    public ResultSet resultado=null;
    
    
    
    public dialogabrir(){
        
        conectarBase();
        
        
    }
    
    public void conectarBase(){
//        try {
//            
//            Class.forName("net.ucanacces.jdbc.UcanaccessDriver");
//            
//        } catch (ClassNotFoundException e) {
//        
//            JOptionPane.showMessageDialog(null, "Error al cargar el driver!!");
//        
//        }
        
        
        
        try {
            conexion = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Almacen\\Documents\\DBA.accdb");
            System.out.println("CONECT OK");
            sentencia = conexion.createStatement();
            System.out.println("sentence ok");
            //sentencia.execute("CREATE TABLE ejemplo (id COUNTER PRIMARY KEY, descr text(400), number numeric(12,3), date datetime) ");
            //sentencia.execute("create table dkey(c counter , number numeric(23,5) , primary key (c,number) ");
            //sentencia.execute("create table dtrx(c text , number numeric(23,5) , unique (C,NUMBER)) ");
            //sentencia.execute(" CREATE TABLE hola( x autoincrement PRIMARY KEY, y text(222))");
            //sentencia.execute(" CREATE TABLE Babe( k LONG , y LONG, PRIMARY KEY(k,y), FOREIGN KEY (y) REFERENCES Parent (x) )");
            
            
            
            resultado=sentencia.executeQuery("SELECT * FROM Alumnos");
            //System.out.println(resultado);
            System.out.println("CONSULTA EJECUTADA");

				boolean r=resultado.next();
				while (r) {
					System.out.println(resultado.getString("Id") + 
                              " - " + resultado.getString("Nombre") + " " +
                              resultado.getString("Apellido paterno") + " " + 
                              resultado.getString("Apellido materno") + " " +
                              resultado.getString("CP")
                                        );
					r=resultado.next();
                                        //r=false;
				}
            //sentencia.close();
            
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error al crear la conexion");
            //System.out.println(e);
        }
        
        
               
        
        
        try {
            sentencia.close();
            System.out.println("Close ok");
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error al cerrar la base de datos");
            System.out.println(e);
        }
        
    }
    
    
}
