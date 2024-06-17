/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.oop2.lab1;


/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Whiskers");
        Bird bird = new Bird("Tweety");
        AnimalManager manager = new AnimalManager();

        manager.displayAnimalDetails(dog);
        manager.displayAnimalDetails(cat);
        manager.displayAnimalDetails(bird);

        // Demonstrating exception handling
        try {
            Animal unknown = new Dog("");
            manager.displayAnimalDetails(unknown);
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}


