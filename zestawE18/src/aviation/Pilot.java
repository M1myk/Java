package aviation;

import java.util.Arrays;

public class Pilot implements Cloneable {
    private String name;
    private double[] flightHours = new double[5];

    public Pilot(String name, double[] flightHours)
    {
        this.name = name;
        this.flightHours = flightHours;


    }




    public void setFlightHours(int index, double hour) {
        this.flightHours[index] = hour;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pilot clonned = (Pilot) super.clone();
        clonned.flightHours = (double[]) this.flightHours.clone();
        return clonned;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", flightHours=" + Arrays.toString(flightHours) +
                '}';
    }
}
