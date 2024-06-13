package domoshka7;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcomeBy(Participant participant) {
        if (participant.getJumpLimit() >= height) {
            participant.jump(height);
            System.out.println("Учасник " + participant.getName() + " пройшов стіну висотою " + height);
            return true;
        } else {
            System.out.println("Учасник " + participant.getName() + " не пройшов стіну висотою " + height);
            return false;
        }
    }
}
