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
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }

    @Override
    public String getInfo() throws InvalidAnimalException {
        if (name == null || name.isEmpty()) throw new InvalidAnimalException("Cat name cannot be null or empty.");
        return "Cat's name: " + name;
    }
}

