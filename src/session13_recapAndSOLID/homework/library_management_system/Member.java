package session13_recapAndSOLID.homework.library_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class Member {
    private final UUID ID;
    private final String name;
    private final String address;
    private final String phoneNumber;
    private final String email;
    private final List<Borrow> borrowedBooks;

    public Member(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.borrowedBooks = new ArrayList<>();
        this.ID = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getID() {
        return ID;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            Borrow newBorrow = new Borrow(this, book);
            borrowedBooks.add(newBorrow);
            book.removeCopies(1);
        } else {
            System.out.println("The book is not available!");
        }
    }

    public void returnBook(Book book) {
        for (Borrow borrow : borrowedBooks) {
            if (book == borrow.getBook()) {
                borrow.returnBook();
            }
        }
    }

    public void displayBorrowedBooks() {
        for (Borrow borrow : borrowedBooks) {
            if (!borrow.isReturned()) {
                borrow.displayDetails();
            }
        }
    }

    public void displayOverdueBorrowedBooks() {
        for (Borrow borrow : borrowedBooks) {
            if (borrow.isOverdue()) {
                borrow.displayDetails();
            }
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Phone number: " + phoneNumber + "\n" +
                "Email: " + email + "\n"
        );
    }

    public void displayAllDetails() {
        displayDetails();
        System.out.println("Borrowed book\n");
        for (Borrow borrow : borrowedBooks) {
            borrow.displayBorrowDetails();
        }
    }

}