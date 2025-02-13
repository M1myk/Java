import java.util.ArrayList;
import java.util.Objects;

public class MusicAlbum {
    private String title;
    private String artist;
    private ArrayList<Double> ratings;

    public MusicAlbum(String title, String artist, double[] ratings)
    {
        setTitle(title);
        setArtist(artist);
        this.ratings = new ArrayList<>();
        for(var elem : ratings)
        {
            this.ratings.add(elem);
        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<Double> getRatings() {
        return ratings;
    }

    public void setRatings(double rating) {
        ratings.add(rating);
    }

    @Override
    public String toString() {
        return "MusicAlbum:\n" +
               title + ", " + artist + " - " + ratings + "";
    }

    public void addRating(double rating)
    {
        ratings.add(rating);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MusicAlbum album)) return false;
        return Objects.equals(title, album.title) && Objects.equals(artist, album.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }
}
