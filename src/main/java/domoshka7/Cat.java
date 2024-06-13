package domoshka7;

public class Cat extends Participant {
    public Cat(String name, int runLimit, int jumpLimit) {
        super(name, runLimit, jumpLimit);
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " пробіг " + distance + " метрів.");
    }

    @Override
    public void jump(int height) {
        System.out.println(name + " стрибнув на " + height + " метрів.");
    }
}
