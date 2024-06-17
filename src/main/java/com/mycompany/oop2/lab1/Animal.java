/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop2.lab1;

/**
 *
 * @author USER
 */
// Animal.java
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String makeSound();
    public void sleep() {
        System.out.println("Zzz...");
    }
    public abstract String getInfo() throws InvalidAnimalException;
}



