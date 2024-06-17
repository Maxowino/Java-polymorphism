/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop2.lab1;

/**
 *
 * @author USER
 */
public class AnimalManager {
    public void displayAnimalDetails(Animal animal) {
        try {
            System.out.println(animal.makeSound());
            animal.sleep();
            if (animal instanceof Flyable) {
                System.out.println(((Flyable) animal).fly());
            }
            System.out.println(animal.getInfo());
        } catch (InvalidAnimalException e) {
            System.out.println(e.getMessage());
        }
    }
}