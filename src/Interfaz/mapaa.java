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
public class mapaa {

    private int zonaAnimal;
    private String animales;
    private String animaless;
    private String animalesss;

    public mapaa(int zonaAnimal, String animales, String animaless, String animalesss) {
        this.zonaAnimal = zonaAnimal;
        this.animales = animales;
        this.animaless = animaless;
        this.animalesss = animalesss;
    }

    @Override
    public String toString() {
        return "Animales ubicados en la zona " + zonaAnimal +", "+  animales +", "+  animaless +", "+  animalesss ;
    }

    
    

    public int getZonaAnimal() {
        return zonaAnimal;
    }

    public void setZonaAnimal(int zonaAnimal) {
        this.zonaAnimal = zonaAnimal;
    }

    public String getAnimales() {
        return animales;
    }

    public void setAnimales(String animales) {
        this.animales = animales;
    }

    public String getAnimaless() {
        return animaless;
    }

    public void setAnimaless(String animaless) {
        this.animaless = animaless;
    }

    public String getAnimalesss() {
        return animalesss;
    }

    public void setAnimalesss(String animalesss) {
        this.animalesss = animalesss;
    }

    

}
