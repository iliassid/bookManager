import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your choice");
            System.out.println("1. Show available books");
            System.out.println("2. Add one book");
            System.out.println("3. Search for a book");
            System.out.println("4. Delete a book");
            System.out.println("5. Edit a book");
            System.out.println("6. Quit");

             int choice = scanner.nextInt();
             scanner.nextLine();
            if (choice == 6){
                System.out.println("goodbye!");
                break;
            }

            switch (choice){

                case 1:
                   library.DisplayBook();
                    break;


                case 2 :
                    System.out.println("Enter the title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter the author:");
                    String author = scanner.nextLine();
                    System.out.println("Enter the isbn:");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter the book availability (true/false):");
                    Boolean isAvailable = scanner.nextBoolean();
                    Book book=new Book(title, author, isbn, isAvailable);

                    library.AddBook(book);

                    break;


        }
    }


            }

    }
