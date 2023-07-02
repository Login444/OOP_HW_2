package org.example;

public abstract class Primat {
    String name;

    public Primat(String name) {
        this.name = name;
    }

    abstract void run(int distance);

    abstract void jump(int distance);
}
