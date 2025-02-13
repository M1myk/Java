package moto;

public class Vehicle implements Comparable<Vehicle>{
    private String model;
    private int speed;

    public Vehicle(String model, int speed)
    {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public int compareTo(Vehicle o) {
        if(this.speed == o.speed)
        {
            return this.model.compareTo(o.model);
        }
        return o.speed - this.speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
