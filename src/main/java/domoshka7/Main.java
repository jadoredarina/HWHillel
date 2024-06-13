package domoshka7;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Петя", 500, 2),
                new Cat("Мурка", 300, 3),
                new Robot("Android", 1000, 1)
        };

        Obstacle[] obstacles = {
                new RunningTrack(400),
                new Wall(2),
                new RunningTrack(800),
                new Wall(1)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (!participant.overcome(obstacle)) {
                    break;
                }
            }
        }
    }
}
