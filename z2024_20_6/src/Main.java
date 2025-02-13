import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("halo world", 1600, LocalDate.of(2015,6,27)));
        books.add(new Book("halo world", 1900, LocalDate.of(2017,6,27)));
        books.add(new Book("halo world", 2000, LocalDate.of(2011,6,27)));
        books.add(new Book("halo world", 1800, LocalDate.of(2019,6,27)));

        Collections.sort(books);

        for(Book book : books)
            System.out.println(book);
    }
}