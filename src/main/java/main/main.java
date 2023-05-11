/*
 * MINIPROYECTO #2
 *
 * INTEGRANTES: 
 * Orlando Alexis Rengifo Mejia(2223878)
 * PROFESOR: Luis Yohany Romo Portilla 
 */

package main;

import Vista.vista;
import Logica.logica;
import Modelo.modelo;

public class main {

    public static void main(String[] args) {
        modelo modelo = new modelo();
        vista vista = new vista();
        logica controlador = new logica( vista , modelo );
        controlador.iniciar_vista();
        vista.setVisible(true);
    }

}
