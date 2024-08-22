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
public class Matriz {

    public mapaa[][] arrHabi = new mapaa[3][3];

    public void info(mapaa[][] info) {
        for (int i = 0; i < 1; i++) {
            this.arrHabi[0][i] = new mapaa(0, "Osos Polares", "Monos", "Lagartos");
        }

        for (int i = 0; i < 1; i++) {
            this.arrHabi[1][i] = new mapaa(1, "Jirafas", "camellos", "Zebras");

            this.arrHabi[2][i] = new mapaa(2, "Lemur", "Avestruz", "Canguros");

        }

    }
    
    public void modificar() {
        int zonaA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la zona en la que se ubican los animales que desea modificar: "));
        String animales1 = JOptionPane.showInputDialog("Ingrese el primer animal que desea agregar: ");
        String animales2 = JOptionPane.showInputDialog("Ingrese el segundo animal que desea agregar: ");
        String animales3 = JOptionPane.showInputDialog("Ingrese el tercer animal que desea agregar: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de zona de los animales: "));
        arrHabi[zonaA][0].setAnimales(animales1);
        arrHabi[zonaA][0].setAnimaless(animales2);
        arrHabi[zonaA][0].setAnimalesss(animales3);
        arrHabi[zonaA][0].setZonaAnimal(numero);
        JOptionPane.showMessageDialog(null, arrHabi);

    }

}
