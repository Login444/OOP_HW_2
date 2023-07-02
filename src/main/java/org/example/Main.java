package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Obi Wan Kenobi", 2000, 10);
        Human human2 = new Human("Bruce Lee", 1000, 2);
        Cat cat1 = new Cat("Gav", 150, 1);
        Cat cat2 = new Cat("Garfield", 50, 1);
        Robot robot1 = new Robot("C3PO", 75, 0);
        Robot robot2 = new Robot("R2D2", 3000, 5);

        int distanceForRun = 1000;
        int distanceForJump = 4;

        human1.jump(distanceForJump);
        human2.run(distanceForRun);

        cat1.run(distanceForRun);
        cat2.jump(distanceForJump);

        robot1.run(distanceForRun);
        robot2.jump(distanceForJump);

        Treadmill treadmill1 = new Treadmill(100);
        Treadmill treadmill2 = new Treadmill(1000);
        Treadmill treadmill3 = new Treadmill(2000);

        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(3);
        Wall wall3 = new Wall(6);

        ArrayList<Object> participants = new ArrayList<>();
        participants.add(human1);
        participants.add(human2);
        participants.add(cat1);
        participants.add(cat2);
        participants.add(robot1);
        participants.add(robot2);

        ArrayList<Object> obstacles = new ArrayList<>();
        obstacles.add(treadmill1);
        obstacles.add(wall1);
        obstacles.add(treadmill2);
        obstacles.add(wall2);
        obstacles.add(treadmill3);
        obstacles.add(wall3);

        ArrayList<Object> winners = new ArrayList<>();
        ArrayList<Object> loosers = new ArrayList<>();

        championship(participants, obstacles, winners, loosers);


    }

    private static void championship(ArrayList<Object> participants, ArrayList<Object> obstacles,
                                     ArrayList<Object> winners, ArrayList<Object> loosers) {
        for (Object participant : participants) {
            int countOfDone = 0;
            for (Object obstacle : obstacles) {
                if (obstacle instanceof Treadmill) {
                    if (participant instanceof Human) {
                        if (!((Treadmill) obstacle).run(((Human) participant).getRunDistance())) {
                            break;
                        } else {
                            countOfDone++;
                        }
                    }
                    if (participant instanceof Cat) {
                        if (!((Treadmill) obstacle).run(((Cat) participant).getRunDistance())) {
                            break;
                        } else {
                            countOfDone++;
                        }
                    }
                    if (participant instanceof Robot) {
                        if (!((Treadmill) obstacle).run(((Robot) participant).getRunDistance())) {
                            break;
                        } else {
                            countOfDone++;
                        }
                    }
                }

                if (obstacle instanceof Wall) {
                    if (participant instanceof Human) {
                        if (!((Wall) obstacle).jump(((Human) participant).getJumpDistance())) {
                            break;
                        } else {
                            countOfDone++;
                        }
                    }
                    if (participant instanceof Cat) {
                        if (!((Wall) obstacle).jump(((Cat) participant).getJumpDistance())) {
                            break;
                        } else {
                            countOfDone++;
                        }
                    }
                    if (participant instanceof Robot) {
                        if (!((Wall) obstacle).jump(((Robot) participant).getJumpDistance())) {
                            break;
                        } else {
                            countOfDone++;
                        }
                    }
                }
            }
            if (countOfDone == obstacles.size()) {
                winners.add(participant);
            } else {
                loosers.add(participant);
            }
        }

        System.out.println("\nНаш победитель:");
        for (Object winner : winners) {
            System.out.println(winner);
        }

        System.out.println("\nНе прошли испытание до конца:");
        for (Object looser : loosers) {
            System.out.println(looser);
        }
        }
}

