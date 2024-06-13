package domoshka7;

public class RunningTrack implements Obstacle {
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean overcomeBy(Participant participant) {
        if (participant.getRunLimit() >= length) {
            participant.run(length);
            System.out.println("Учасник " + participant.getName() + " пройшов бігову доріжку на дистанції " + length);
            return true;
        } else {
            System.out.println("Учасник " + participant.getName() + " не пройшов бігову доріжку на дистанції " + length);
            return false;
        }
    }
}
