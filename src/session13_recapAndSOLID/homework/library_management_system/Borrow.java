package session13_recapAndSOLID.homework.library_management_system;

import java.time.LocalDate;
import java.util.UUID;

public class Borrow {
    private UUID uuid;
    private Member member;
    private Book book;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private boolean isReturned;

    public Borrow(Member member, Book book) {
        if (book.isAvailable()) {
            this.member = member;
            this.book = book;
            this.borrowDate = LocalDate.now();
            this.dueDate = LocalDate.now().plusDays(30);
            this.isReturned = false;
            this.uuid = UUID.randomUUID();
            this.book.removeCopies(1);
        } else {
            System.out.println("The book is not available");
        }
    }

    public void returnBook() {
        isReturned = true;
        book.addCopies(1);
    }

    public boolean isReturned() {
        return isReturned;
    }

    public Book getBook() {
        return book;
    }

    public boolean isOverdue() {
        return LocalDate.now().compareTo(dueDate) > 0;
    }

    public void displayDetails() {
        System.out.println("Book details:\n");
        book.displayDetails();
        member.displayDetails();
        System.out.println("Borrowed day: " + borrowDate + "\n" +
                "Due date: " + dueDate + "\n"
        );
    }

    public void displayBorrowDetails() {
        System.out.println("Book details:\n");
        book.displayDetails();
        System.out.println("Borrowed day: " + borrowDate + "\n" +
                "Due date: " + dueDate + "\n"
        );
    }

}
