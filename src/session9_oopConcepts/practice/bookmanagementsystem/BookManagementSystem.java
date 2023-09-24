package session9_oopConcepts.practice.bookmanagementsystem;

public class BookManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", 200);
        book1.printBookInfo();

        Book book2 = new Book();
        book2.setTitle("Animal Farm");
        book2.setPrice(300);
        book2.printBookInfo();

        System.out.println(book2.getTitle());
    }
}
