package session13_recapAndSOLID.homework.library_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayAllBooks() {
        System.out.println("The books from library:");
        for (Book book : books) {
            book.displayDetails();
        }
    }

    public void searchBooksByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.displayDetails();
            }
        }
    }

    public void searchBooksByAuthor(String authorName) {
        for (Book book : books) {
            if (book.getAuthor().getName().equalsIgnoreCase(authorName)) {
                book.displayDetails();
            }
        }
    }

    public void searchBooksByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equalsIgnoreCase(ISBN)) {
                book.displayDetails();
            }
        }
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public void displayAllMembers() {
        System.out.println("All the members: ");
        for (Member member : members) {
            member.displayDetails();
        }
    }

    public void displayAllMembersWithBorrowedBooks() {
        System.out.println("All the members with borrowed books ");
        for (Member member : members) {
            member.displayAllDetails();
        }
    }

    public void searchMembersByName(String name) {
        for (Member member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                member.displayDetails();
            }
        }
    }

    public void searchMembersByID(UUID ID) {
        for (Member member : members) {
            if (member.getID().compareTo(ID) == 0)
                member.displayDetails();
        }
    }
}

