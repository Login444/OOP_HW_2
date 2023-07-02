package org.example;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void run(int distance);

    abstract void jump(int distance);
}
