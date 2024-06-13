package domoshka7;

public abstract class Participant {

    protected String name;
    protected int runLimit;
    protected int jumpLimit;

    public Participant(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public abstract void run(int distance);
    public abstract void jump(int height);

    public boolean overcome(Obstacle obstacle) {
        return obstacle.overcomeBy(this);
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getJumpLimit() {
        return jumpLimit;
    }

    public String getName() {
        return name;
    }
}
