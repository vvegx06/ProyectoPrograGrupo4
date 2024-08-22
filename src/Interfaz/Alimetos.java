/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import javax.swing.JOptionPane;

public class Alimetos {
    private String[] animal = {"Leones", "Jirafas", "Tigres", "Monos", "Elefantes"};
    private int[] horario = {2, 4, 7, 10, 12};
    private String[] consumir = {"Carne", "Vegetales", "Carne", "Frutas", "Vegetales"};
    private String[] frecuencia = {"3 veces al dia", "6 veces al dia", "2 veces al dia", "1 vez al dia", "4 veces al dia"};

    public void opcion() {
        boolean salir = false;

        while (!salir) {
            String[] arrOpciones = {"Ver informacion", "Modificar infomacion", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "seleccione una opcion:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, arrOpciones, arrOpciones[0]);

            switch (seleccion) {
                case 0:
                    mostrar();
                    break;

                case 1:
                    modificar();
                    break;

                case 2:
                    salir = true;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;

            }
        }
    }

    //Información que se muestra en la semana2
    public void mostrarV2() {
        String info = "";
        for (int i = 0; i < horario.length; i++) {
            info += "Alimentación: " + (i + 1) + ":\n";
            info += "Animal: " + animal[i] + ":\n";
            info += "Horario: " + horario[i] + ":\n";
            info += "Alimentos a consumir: " + consumir[i] + ":\n";
            info += "Frecuencia: " + frecuencia[i] + "\n";
            info += ":\n";
        }
        JOptionPane.showMessageDialog(null, info);
    }

    private void mostrar() {
        String info = "";
        for (int i = 0; i < horario.length; i++) {
            info += "Alimentación: " + (i + 1) + ":\n";
            info += "Animal: " + animal[i] + ":\n";
            info += "Horario: " + horario[i] + ":\n";
            info += "Alimentos a consumir: " + consumir[i] + ":\n";
            info += "Frecuencia: " + frecuencia[i] + "\n";
            info += ":\n";

        }
        JOptionPane.showMessageDialog(null, info);
    }

    private void modificar() {
        String cambiar = JOptionPane.showInputDialog(null, "Ingrese el animal al que desea modificar la alimentación: ");
        int indice = -1;
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].equalsIgnoreCase(cambiar)) {
                indice = i;
                break;
            }

        }
        if (indice != -1) {
            int horarios = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo horario para la alimentacion"));
            String consumirs = JOptionPane.showInputDialog(null, "Ingrese los nuevos alimentos a consumir");
            String frecuencias = JOptionPane.showInputDialog(null, "Ingrese la nueva frecuencia de alimentacion");
            horario[indice] = horarios;
            consumir[indice] = consumirs;
            frecuencia[indice] = frecuencias;
            JOptionPane.showMessageDialog(null, "Informacion actualizada");
        } else {
            JOptionPane.showMessageDialog(null, "El registro alimenticio no existe");
        }
    }
}
