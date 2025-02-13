import java.util.Objects;

public class RockAlbum extends MusicAlbum {
    private String rockGenre;


    public RockAlbum(String title, String artist, double ratings, String genre) {
        super(title,artist, ratings);
        this.rockGenre = genre;
    }

    public RockAlbum(String title, String artist, String genre) {
        super(title,artist);
        this.rockGenre = genre;
    }

    @Override
    public String toString() {

        return super.toString() + "\nRock Genre: " + rockGenre ;
    }

    public String getRockGenre() {
        return rockGenre;
    }

    public void setRockGenre(String rockGenre) {
        this.rockGenre = rockGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RockAlbum rockAlbum)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(rockGenre, rockAlbum.rockGenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rockGenre);
    }
}
