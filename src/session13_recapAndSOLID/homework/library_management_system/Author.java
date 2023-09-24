package session13_recapAndSOLID.homework.library_management_system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Author {
    private String name;
    private String nationality;
    private LocalDate dateOfBirth;
    private List<Book> books;

    public Author(String name, String nationality, LocalDate dateOfBirth) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayDetails() {
        System.out.println("Name: " + name + "\n" +
                "Nationality: " + nationality + "\n" +
                "Date of birth: " + dateOfBirth + "\n"
        );
        System.out.println("Books: \n");
        for (Book book : books) {
            book.displayDetails();
        }
    }
}
