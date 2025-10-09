class Book {
    String title;
    String author;
    int year;

    // Constructor
    Book(String title, String author, int year) {
        this.title = title;     // Using 'this' to refer to the current object's fields
        this.author = author;
        this.year = year;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title : " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year  : " + this.year);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book2 = new Book("1984", "George Orwell", 1949);

        // Display their details
        System.out.println("Book 1 Details:");
        book1.displayDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayDetails();
    }
}
