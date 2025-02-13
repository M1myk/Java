package playlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestSong {
    public static void main(String[] args)
    {
        Song song1 = new Song("piosenka5", "burara", 186);
        Song song2 = new Song("piosenka2", "aurara1", 172);
        Song song3 = new Song("piosenka3", "burara", 186);
        Song song4 = new Song("piosenka2", "aurara1", 191);
        Song song5 = new Song("piosenka5", "Hurara5", 152);

        ArrayList<Song> lista = new ArrayList<>();
        lista.add(song1);
        lista.add(song2);
        lista.add(song3);
        lista.add(song4);
        lista.add(song5);

        lista.sort(new DurationComparator().thenComparing(new ArtistTitleComparator()));
        System.out.println("Po dlugosci utworu i innemu");
        for(Song song : lista)
        {
            System.out.println(song);
        }




    }


}
