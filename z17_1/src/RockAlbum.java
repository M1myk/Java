import java.util.Objects;

public class RockAlbum extends MusicAlbum{
    private String rockGenre;

    public RockAlbum(String title, String artist, String rockGenre, double[] ratings)
    {
        super(title, artist, ratings);
        setRockGenre(rockGenre);
    }

    public String getRockGenre() {
        return rockGenre;
    }

    public void setRockGenre(String rockGenre) {
        this.rockGenre = rockGenre;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRock Genre: " + rockGenre;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RockAlbum rockAlbum)) return false;
        return Objects.equals(rockGenre, rockAlbum.rockGenre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rockGenre);
    }
}
