
package Logica;

import Modelo.modelo;
import Vista.vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author orlan
 */
public class logica {
    private vista vista;
    private modelo modelo;
    private JLabel[][] casillas;
    
    public logica(vista vista,modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        casillas = vista.getCasillas();
        agregarListeners();
        crearJugadores();
    }



    private void agregarListeners() {
        for (int i=0; i<3; ) {
            for(int j=0; j<3; j++){
                agregarEventoMouese(i,j);
            }
            
        } 
        JButton botonReiniciar = vista.getBotonReiniciar();
        botonReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.reiniciarJuego(casillas);
            }
        });
        
    }

    private void agregarEventoMouese(int i, int j) {
        JLabel casillaActual = casillas[i][j];
        casillaActual.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                modelo.marcarCasilla(i,j,casillas);
            }
        });
    }

    private void crearJugadores() {
        JLabel j1 = vista.getVictoriasJ1();
        JLabel j2 = vista.getVictoriasJ2();
        modelo.setJugadores(j1,j2);
    }
    
}
