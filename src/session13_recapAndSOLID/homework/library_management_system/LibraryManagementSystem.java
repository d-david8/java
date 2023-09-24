package session13_recapAndSOLID.homework.library_management_system;

import java.time.LocalDate;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Library myLibrary = new Library();

        Author author1 = new Author("Albert Camus", "French", LocalDate.of(1960, 01, 4));
        Author author2 = new Author("Ernest Hemingway", "French", LocalDate.of(1899, 06, 21));

        Book book1 = new Book("Book 1", author1, "Publisher A", "ISBN111", 5);
        Book book2 = new Book("Book 2", author2, "Publisher A", "ISBN112", 3);
        Book book3 = new Book("Book 3", author2, "Publisher B", "ISBN221", 2);
        Book book4 = new Book("Book 4", author2, "Publisher B", "ISBN222", 1);

        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        myLibrary.addBook(book4);

        Member member1 = new Member("Dan", "Address 1", "0733333333", "dan@email.com");
        Member member2 = new Member("Vlad", "Address 2", "0744444444", "vlad@email.com");

        myLibrary.addMember(member1);
        myLibrary.addMember(member2);

        System.out.println("_________________________________________");
        myLibrary.displayAllMembers();

        System.out.println("__________________________________________");
        myLibrary.displayAllBooks();

        System.out.println("_________________________________________");
        System.out.println("Searching a book by tittle: Book 1");
        myLibrary.searchBooksByTitle("Book 1");

        System.out.println("_________________________________________");
        System.out.println("Searching a member by name: Dan");
        myLibrary.searchMembersByName("Dan");

        member1.borrowBook(book4);

        System.out.println("The user try to borrow an unavailable book");
        member1.borrowBook(book4);

        System.out.println("______________________________________");
        System.out.println("Overdue borrowed books of the member1 ");
        member1.displayOverdueBorrowedBooks();

        System.out.println("_______________________________________");
        System.out.println("All the borrowed books of the member 1");
        member1.displayBorrowedBooks();

    }
}
