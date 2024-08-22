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
public class Habitat {

    private String[] nombre = {"Desierto", "Selva", "Bosque", "Acuatico"};
    private String[] ambientes = {"Soleado", "Humedo", "Humedo", "Calido"};
    private int[] capacidadd = {76, 89, 67, 110};

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
        for (int i = 0; i < nombre.length; i++) {
            info += "Nombre: " + (i + 1) + "\n";
            info += "Nombre: " + nombre[i] + "\n";
            info += "Ambiente: " + ambientes[i] + "\n";
            info += "Capacidad: " + capacidadd[i] + "\n";
            info += ":\n";
        }
        JOptionPane.showMessageDialog(null, info);
    }

    private void mostrar() {
        String info = "";
        for (int i = 0; i < nombre.length; i++) {
            info += "Nombre: " + (i + 1) + "\n";
            info += "Nombre: " + nombre[i] + "\n";
            info += "Ambiente: " + ambientes[i] + "\n";
            info += "Capacidad: " + capacidadd[i] + "\n";
            info += ":\n";

        }
        JOptionPane.showMessageDialog(null, info);
    }

    private void modificar() {
        String nombreHabitat = JOptionPane.showInputDialog(null, "Ingrese el nombre del habitat que desea modificar");
        int indice = -1;
        for (int i = 0; i < nombre.length; i++) {
            if (nombre[i].equalsIgnoreCase(nombreHabitat)) {
                indice = i;
                break;
            }

        }
        if (indice != -1) {
            String nombres = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del habitat");
            String ambiente = JOptionPane.showInputDialog(null, "Ingrese el nuevo ambiente del habitat");
            int capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva capacidad del ambiente"));
            nombre[indice] = nombres;
            ambientes[indice] = ambiente;
            capacidadd[indice] = capacidad;
            JOptionPane.showMessageDialog(null, "Informacion actualizada");
        } else {
            JOptionPane.showMessageDialog(null, "El habitat no existe");
        }
    }

}
