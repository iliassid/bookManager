import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Menu");
            System.out.println("1. Show available books");
            System.out.println("2. Add one book");
            System.out.println("3. Delete a book");
            System.out.println("4. Edit a book");
            System.out.println("5. Search for a book");
            System.out.println("6. Quit");
            System.out.print("Enter your choice : ");
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
                    System.out.print("Enter the title:");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author:");
                    String author = scanner.nextLine();
                    System.out.print("Enter the isbn:");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter the book availability (true/false):");
                    Boolean isAvailable = scanner.nextBoolean();
                    scanner.nextLine();

                    Book book=new Book(title, author, isbn, isAvailable);
                    library.AddBook(book);

                    break;
                case 3 :
                    System.out.print("Enter the isbn of the book to remove : ");
                    isbn = scanner.nextLine();
                    library.removeBook(isbn);
                    break;
                case 4:
                    System.out.println("Enter the isbn for the book you want to edit");
                    isbn = scanner.nextLine();
                    System.out.println("1: Update Title\n2: Update Author\n3: Update Availability");
                    System.out.print("Enter a choice :");
                    int choiceToUpdate = scanner.nextInt();
                    library.updateBook(isbn, choiceToUpdate);
                    break;
                case 5:
                    library.searchBook();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;

        }
    }


            }

    }
