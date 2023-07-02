package org.example;

public class Wall {
    Integer height;

    public Wall(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    boolean jump(int jumpDistance) {
        return height < jumpDistance;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "height=" + height +
                '}';
    }
}
