/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop2.lab1;

/**
 *
 * @author USER
 */
public class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }


    @Override
    public String makeSound() {
        return "Tweet!";
    }

    @Override
    public String getInfo() throws InvalidAnimalException {
        if (name == null || name.isEmpty()) throw new InvalidAnimalException("Bird name cannot be null or empty.");
        return "Bird's name: " + name;
    }

    @Override
    public String fly() {
        return "Flies up high in the sky.";
    }
}