package healthcare;

import java.util.Objects;

public class Clinic extends Hospital{
    private double rating;

    public Clinic(String name, double capacity, double rating) {
        super(name, capacity);
        if (rating >= 0 && rating <= 5)
        {
            this.rating = rating;
        }
        else
        {
            this.rating = 3;
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5)
        {
            this.rating = rating;
        }
        else
        {
            this.rating = 3;
        }
    }

    @Override
    public String toString() {
        if (super.getName() == null || super.getName().equals(""))
        {
            return getClass().getName() + ": Capacity: " + getCapacity() + ".\nRating: " + getRating();

        }
        return getClass().getName() + ": Name: " + getName() + ", Capacity: " + getCapacity() + ".\nRating: " + getRating();


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clinic clinic)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(rating, clinic.rating) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rating);
    }
}
