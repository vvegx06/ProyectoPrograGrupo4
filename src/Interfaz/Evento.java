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
public class Evento {

    private String[] nombre = {"Caminata", "Cumple", "Concierto", "Charla"};
    private int[] fecha = {3, 6, 8, 10};
    private int[] id = {2005, 1955, 4322, 9822};
    private String[] descri = {"Caminata para los visitantes", "Cumpleaños de Andres, se celebra en el salon de eventos",
        "Concierto en el parque central", "Charla para los empleados"};

    public void opcion() {
        boolean salir = false;

        while (!salir) {
            String[] arrOpciones = {"Ver informacion", "Modificar informacion", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú",
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
    //Información que se va a mostrar en la ventana2
    public void mostrarV2() {
        String info = "";
        for (int i = 0; i < nombre.length; i++) {
            info += "Evento " + (i + 1) + ":\n";
            info += "Nombre: " + nombre[i] + "\n";
            info += "Fecha: " + fecha[i] + "\n";
            info += "ID: " + id[i] + "\n";
            info += "Descripción: " + descri[i] + "\n";
            info += "\n";
        }
        JOptionPane.showMessageDialog(null, info);
    }

    private void mostrar() {
        String info = "";
        for (int i = 0; i < nombre.length; i++) {
            info += "Evento " + (i + 1) + ":\n";
            info += "Nombre: " + nombre[i] + "\n";
            info += "Fecha: " + fecha[i] + "\n";
            info += "ID: " + id[i] + "\n";
            info += "Descripción: " + descri[i] + "\n";
            info += "\n";
        }
        JOptionPane.showMessageDialog(null, info);
    }

    private void modificar() {
        String nombreEvento = JOptionPane.showInputDialog(null, "Ingrese el nombre del evento que desea modificar ");
        int indice = -1;
        for (int i = 0; i < nombre.length; i++) {
            if (nombre[i].equalsIgnoreCase(nombreEvento)) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            String nombres = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del evento ");
            int fechas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva fecha del evento "));
            int ids = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo id del evento "));
            String descrip = JOptionPane.showInputDialog(null, "Ingrese la nueva descripcion del evento");

            nombre[indice] = nombres;
            fecha[indice] = fechas;
            id[indice] = ids;
            descri[indice] = descrip;

            JOptionPane.showMessageDialog(null, "Informacion actualizada ");
        } else {
            JOptionPane.showMessageDialog(null, "El evento no existe ");
        }
    }

}
