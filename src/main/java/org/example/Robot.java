package org.example;

public class Robot extends Tech {
    Integer runDistance;
    Integer jumpDistance;

    public Robot(String name) {
        super(name);
    }

    public Robot(String name, Integer runDistance, Integer jumpDistance) {
        super(name);
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;
    }

    @Override
    void run(int distance) {
        if (distance <= runDistance) {
            System.out.println(name + " пробежал " + distance + " метров.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров.");
        }
    }

    @Override
    void jump(int distance) {
        if (distance <= jumpDistance) {
            System.out.println(name + " прыгнул вперед на " + distance + " метра.");
        } else {
            System.out.println(name + " не смог перепрыгнуть " + distance + " метров.");
        }
    }

    public Integer getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(Integer runDistance) {
        this.runDistance = runDistance;
    }

    public Integer getJumpDistance() {
        return jumpDistance;
    }

    public void setJumpDistance(Integer jumpDistance) {
        this.jumpDistance = jumpDistance;
    }

    @Override
    public String toString() {
        return "Робот, " +
                "по имени " + name + '\n';
    }
}
