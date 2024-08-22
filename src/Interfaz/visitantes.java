/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author gaort
 */

public class visitantes {

    private int[] adultos = {30};
    private int[] ninos = {16};



public void mostrarV2() {
        String info = "";
        for (int i = 0; i < adultos.length; i++) {
            info += "Visitantes el dia de hoy " + ":\n";
            info += "Visitantes adultos: " + adultos[i] + "\n";
            info += "Visitantes ninos: " + ninos[i] + "\n";
            info += ":\n";
        }
        JOptionPane.showMessageDialog(null, info);
}
}

