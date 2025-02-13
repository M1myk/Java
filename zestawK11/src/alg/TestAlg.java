package alg;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestAlg {
    public static void main(String[] args)
    {
        Book book1 = new Book("A", 100);
        Book book2 = new Book("B", 200);
        Book book3 = new Book("C", 500);
        Book book4 = new Book("A", 500);
        Book book5 = new Book("E", 300);

        Set<Book> books = new HashSet<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println(findMax(books));

    }
    public static <T extends Comparable<T>> T findMax(Collection<T> items)
    {



        return Collections.max(items);
    }
}
class Book implements Comparable<Book> {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.pages, o.pages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}