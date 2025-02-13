package tourism;

public class Hotel implements Cloneable {
    private String name;
    private double capacity;

    public Hotel(String name, double capacity)
    {
        if(name == null || name.isEmpty())
        {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        else
        {
            this.name = name;
        }
        if (capacity < 0) {
            this.capacity = 50;
        }
        else
        {
            this.capacity = capacity;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Hotel) super.clone();
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() +
                "{ name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
