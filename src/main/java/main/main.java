package main;

import Logica.logica;
import Modelo.modelo;
import Vista.vista;

/**
 *
 * @author orlan
 */
public class main {
    

    public static void main(String args[]) {
        
        modelo modelo = new modelo();
        vista vista = new vista();
        logica logica = new logica(vista, modelo);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

    }

}
