package games;

import java.util.Arrays;
import java.util.Objects;

public class ComputerGame {
    private String title;
    private String producer;
    private double[] ratings;

    public ComputerGame(String title, String producer, double[] ratings)
    {
        this.title = title;
        this.producer = producer;
        this.ratings = ratings;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double[] getRatings() {
        return ratings;
    }

    public void setRatings(int index, double rating) {
        this.ratings[index] = rating;
    }

    public void addRating(double rating)
    {
        double[] newRatings = new double[ratings.length + 1];
        for(int i = 0; i < ratings.length; i++)
        {
            newRatings[i] = ratings[i];
        }
        newRatings[newRatings.length-1] = rating;
        this.ratings = newRatings;
    }

    public void deleteRating(double rating)
    {
        for(int i = 0; i < ratings.length; i++)
        {
            if(ratings[i] == rating)
            {
                double[] newRatings = new double[ratings.length - 1];
                System.arraycopy(ratings, 0, newRatings, 0, i);
                System.arraycopy(ratings, i + 1, newRatings, i, ratings.length - i - 1);
                ratings = newRatings;
                return;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComputerGame game)) return false;
        return Objects.equals(title, game.title) && Objects.equals(producer, game.producer) && Objects.deepEquals(ratings, game.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, producer, Arrays.hashCode(ratings));
    }

    @Override
    public String toString() {
        return "ComputerGame{" +
                "title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                ", ratings=" + Arrays.toString(ratings) +
                '}';
    }
}
