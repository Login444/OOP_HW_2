package org.example;

public abstract class Tech {
    String name;

    public Tech(String name) {
        this.name = name;
    }

    abstract void run(int distance);

    abstract void jump(int distance);
}
