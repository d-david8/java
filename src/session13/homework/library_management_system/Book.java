package session13.homework.library_management_system;

class Book {
    private final String title;
    private final Author author;
    private final String publisher;
    private final String ISBN;
    private int numberOfCopies;

    public Book(String title, Author author, String publisher, String ISBN, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.numberOfCopies = numberOfCopies;
    }

    public void addCopies(int numberOfCopies) {
        this.numberOfCopies += numberOfCopies;
    }

    public void removeCopies(int numberOfCopies) {
        if (this.numberOfCopies < numberOfCopies) {
            System.out.println("Not enough copies!");
        } else {
            this.numberOfCopies -= numberOfCopies;
        }
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return numberOfCopies > 0;
    }

    public void displayDetails() {
        System.out.println("Title: " + title + "\n" +
                "Author: " + author.getName() + "\n" +
                "Publisher: " + publisher + "\n" +
                "Copies: " + numberOfCopies + "\n" +
                "ISBN: " + ISBN + "\n"
        );
    }
}
