/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop2.lab1;

import com.mycompany.oop2.lab1.Animal;
import com.mycompany.oop2.lab1.InvalidAnimalException;

/**
 *
 * @author USER
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }

    @Override
    public String getInfo() throws InvalidAnimalException {
        if (name == null || name.isEmpty()) throw new InvalidAnimalException("Dog name cannot be null or empty.");
        return "Dog's name: " + name;
    }
}
