// import java.util.Scanner;

class Library {
    public String Books[];
    public int no_of_books;
    public String newbook;

    Library() {
        this.Books = new String[3];
        this.no_of_books = 0;
    }

    public void addBook(String book) {
        this.Books[no_of_books] = book;
        no_of_books++;
    }

    public void issueBook(String Book) {
        for (String b : Books) {
            if (b == Book) {
                System.out.println("The book has been issued " + b);
                Books[no_of_books - 1] = "";
            }
        }
    }

    public void returnBook(String Book) {
            no_of_books++;
            System.out.println("The book has been returned " + Book);
            Books[no_of_books] = Book;
    }

    public void showAvailableBook() {
        System.out.println("-------------------Below are the Avaiable Books------------------------");
        for (String Book : Books) {
            if (Book != null) {
                System.out.println(Book);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library l1 = new Library();
        l1.addBook("JavaScript");
        l1.addBook("Python");
        l1.addBook("Java");
        l1.showAvailableBook();
        l1.issueBook("Java");
        l1.showAvailableBook();
        l1.returnBook("Java");
        l1.showAvailableBook();

    }
}
