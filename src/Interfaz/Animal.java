/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 *
 */
public class Animal {

    private String[] animales = {"Leon", "Tigre", "Oso", "Jirafa", "Mono"};
    private String[] habitats = {"Jungla", "Jungla", "Montaña", "Savana", "Jungla"};
    private int[] edades = {10, 8, 15, 12, 5};

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
    //Info que se muestra en la ventana2
    public void mostrarV2() {
        String info = "";
        for (int i = 0; i < animales.length; i++) {
            info += "Animal: " + (i + 1) + ":\n";
            info += "Animal: " + animales[i] + "\n";
            info += "Habitats: " + habitats[i] + "\n";
            info += "edades: " + edades[i] + "\n";
            info += "\n";
        }
        JOptionPane.showMessageDialog(null, info);
    }

    private void mostrar() {
        String info = "";
        for (int i = 0; i < animales.length; i++) {
            info += "Animal: " + (i + 1) + ":\n";
            info += "Animal: " + animales[i] + "\n";
            info += "Habitats: " + habitats[i] + "\n";
            info += "edades: " + edades[i] + "\n";
            info += "\n";
        }
        JOptionPane.showMessageDialog(null, info);
    }

    private void modificar() {
        String nombreAnimal = JOptionPane.showInputDialog(null, "Ingrese el nombre del animal que desea modificar ");
        int indice = -1;
        for (int i = 0; i < animales.length; i++) {
            if (animales[i].equalsIgnoreCase(nombreAnimal)) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del animal ");
            String habitat = JOptionPane.showInputDialog(null, "Ingrese el nuevo habitat del animal ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva edad del animal "));
            animales[indice] = nombre;
            habitats[indice] = habitat;
            edades[indice] = edad;
            JOptionPane.showMessageDialog(null, "Informacion actualizada ");
        } else {
            JOptionPane.showMessageDialog(null, "El animal no existe ");
        }
    }

}