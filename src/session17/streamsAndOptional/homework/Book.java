package session17.streamsAndOptional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Given a list of books with attributes: title, author, and year of publication; use streams to find
 * all the books published before the year 2000 and group them by author in a map where the key is
 * the author and the value is a list of titles of their books.
 * */
public class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", "Author1", 1995));
        books.add(new Book("Book2", "Author2", 2001));
        books.add(new Book("Book3", "Author1", 1998));
        books.add(new Book("Book4", "Author3", 1985));
        books.add(new Book("Book5", "Author2", 1990));


        books.stream()
                .filter(book -> book.getYearOfPublication() < 2000)
                .collect(Collectors.groupingBy(Book::getAuthor,
                        Collectors.mapping(Book::getTitle, Collectors.toList())))
                .forEach((author, titles) -> {
                    System.out.println("Author: " + author);
                    System.out.println("Books: " + titles + "\n");
                });
    }
}
