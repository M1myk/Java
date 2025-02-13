public class Bird implements Comparable<Bird>{
    private String type;
    private int speed;

    public Bird(String type, int speed) {this.type = type; this.speed = speed;}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "type='" + type + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(Bird o) {
        return Integer.compare(this.speed, o.speed);
    }
}
