/*
 * MINIPROYECTO #2
 *
 * INTEGRANTES: 
 * Orlando Alexis Rengifo Mejia(2223878)
 * PROFESOR: Luis Yohany Romo Portilla 
 */

package Logica;

import Modelo.modelo;
import Vista.vista;
import javax.swing.JLabel;

public class logica {
    private vista vista;
    private modelo modelo;
    private JLabel[][] casillas;
    
    public logica(vista vista,modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
       
        agregarListeners();
       
    }



    private void agregarListeners() {
        for (int i=0; i<3; ) {
            for(int j=0; j<3; j++){
               
            }
            
        } 
        
  
            }
     
  
}
