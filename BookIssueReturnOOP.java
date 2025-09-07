import java.util.Scanner;

class Library {
    String bookName;
    String authorName;
    int quantity;
    
    public Library(String bookName, String authorName, int quantity) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.quantity = quantity;
    }
    
    public void issueBook() {
        if (quantity > 0) {
            quantity--;
            System.out.println("Book issued successfully!");
        } else {
            System.out.println("Book is not available for issue.");
        }
    }
    
    public void returnBook() {
        quantity++;
        System.out.println("Book returned successfully!");
    }
    
    public void displayBook() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("Quantity Available: " + quantity);
    }
}

public class BookIssueReturnOOP {
    public static void main(String[] args) {
        Library book1 = new Library("Java Programming", "James Gosling", 5);
        Library book2 = new Library("Python Basics", "Guido van Rossum", 3);
        Library book3 = new Library("C++ Fundamentals", "Bjarne Stroustrup", 2);
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("\n--- Book Details ---");
                    book1.displayBook();
                    System.out.println();
                    book2.displayBook();
                    System.out.println();
                    book3.displayBook();
                    break;
                    
                case 2:
                    System.out.print("Enter book number to issue (1, 2, or 3): ");
                    int issueChoice = scanner.nextInt();
                    
                    if (issueChoice == 1) {
                        book1.issueBook();
                    } else if (issueChoice == 2) {
                        book2.issueBook();
                    } else if (issueChoice == 3) {
                        book3.issueBook();
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter book number to return (1, 2, or 3): ");
                    int returnChoice = scanner.nextInt();
                    
                    if (returnChoice == 1) {
                        book1.returnBook();
                    } else if (returnChoice == 2) {
                        book2.returnBook();
                    } else if (returnChoice == 3) {
                        book3.returnBook();
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        
        scanner.close();
    }
}