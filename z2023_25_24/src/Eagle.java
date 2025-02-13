public class Eagle extends Bird{
    private int year;


    public Eagle(String type, int speed, int year) {
        super(type, speed);
        this.year = year;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "speed=" + getSpeed() +
                " year=" + year +
                '}';
    }
}
