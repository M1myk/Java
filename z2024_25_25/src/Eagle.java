public class Eagle extends Bird {
    private int speed;


    public Eagle(String type, int speed) {
        super(type);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "speed=" + speed +
                '}';
    }


}
