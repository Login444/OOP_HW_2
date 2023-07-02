package org.example;

public class Treadmill {
    Integer distance;

    public Treadmill(Integer distance) {
        this.distance = distance;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    boolean run(int runDistance) {
        return distance <= runDistance;
    }

    @Override
    public String toString() {
        return "Treadmill{" +
                "distance=" + distance +
                '}';
    }
}
