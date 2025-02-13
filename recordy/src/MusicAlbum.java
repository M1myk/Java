    import java.util.ArrayList;
    import java.util.Objects;

    public class MusicAlbum {
        private String title;
        private String artist;
        private ArrayList<Double> ratings;

        public MusicAlbum(String title, String artist, double ratings) {
            this.title = title;
            this.artist = artist;
            this.ratings = new ArrayList<>();
            this.ratings.add(ratings);
        }

        public MusicAlbum(String title, String artist) {
            this.title = title;
            this.artist = artist;
            this.ratings = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "MusicAlbum{" +
                    "title='" + title + '\'' +
                    ", artist='" + artist + '\'' +
                    ", ratings=" + ratings +
                    '}';
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public ArrayList<Double> getRatings() {
            System.out.println("Album " + getTitle() + " ma takie ocene:" );
            return ratings;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setRatings(ArrayList<Double> ratings) {
            this.ratings = ratings;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public void dodajOcene(double ocena)
        {
            this.ratings.add(ocena);
        }

        public void usunOcene()
        {
            if(!this.ratings.isEmpty())
            {
                System.out.println("Usunieto ostatnia ocene");
                this.ratings.remove(ratings.size()-1);
            }
            else
            {
                System.out.println("Niema zadnych ocen");
            }
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
