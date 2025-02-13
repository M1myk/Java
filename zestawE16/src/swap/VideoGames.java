package swap;

public class VideoGames {
    private String name;
    private String developer;
    private float rating;

    public VideoGames(String name, String developer, float rating)
    {
        this.name = name;
        this.developer = developer;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "VideoGames{" +
                "name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                ", rating=" + rating +
                '}';
    }
}
