package sdsds;

import java.util.Arrays;
import java.util.Objects;

public class Novel {
    private String title;
    private String author;
    private double[] ratings;

    public Novel(String title, String author, double[] ratings)
    {
        this.title = title;
        this.author = author;
        this.ratings = ratings;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double[] getRatings() {
        return ratings;
    }

    public void setRatings(double[] ratings) {
        this.ratings = ratings;
    }

    public void addRating(double rating)
    {
        ratings = Arrays.copyOf(ratings, ratings.length + 1);
        ratings[ratings.length - 1] = rating;
    }

    public void removeRating(int index)
    {

        double[] newRatings = new double[ratings.length - 1];
        System.arraycopy(ratings, 0, newRatings, 0, index);
        System.arraycopy(ratings, index + 1, newRatings, index, ratings.length - index - 1);
        ratings = newRatings;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Novel novel = (Novel) super.clone();
        novel.ratings = new double[ratings.length];
        System.arraycopy(ratings, 0, novel.ratings, 0, ratings.length);
        return novel;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ratings=" + Arrays.toString(ratings) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Novel novel)) return false;
        return Objects.equals(title, novel.title) && Objects.equals(author, novel.author) && Objects.deepEquals(ratings, novel.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, Arrays.hashCode(ratings));
    }


}
