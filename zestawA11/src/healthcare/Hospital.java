package healthcare;

import java.util.Objects;

public class Hospital {
    private String name;
    private double capacity;

    public Hospital(String name, double capacity)
    {
        if(name == null || name.isEmpty())
        {
            this.name = "";
        }
        else
        {
            this.name = name;
        }
        if(capacity < 0)
        {
            this.capacity = 50;
        }
        else
        {
            this.capacity = capacity;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty())
        {
            this.name = "";
        }
        else
        {
            this.name = name;
        }
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if(capacity < 0)
        {
            this.capacity = 50;
        }
        else
        {
            this.capacity = capacity;
        }
    }

    @Override
    public String toString() {
        if (name == null || name.isEmpty())
        {
            return getClass().getName() + ":  Capacity: " + capacity + ".";
        }
        return getClass().getName() + ": Name: " + name + ". Capacity: " + capacity + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hospital hospital)) return false;
        return Double.compare(capacity, hospital.capacity) == 0 && Objects.equals(name, hospital.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }
}
