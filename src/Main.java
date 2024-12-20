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

                    library.AddBook();

                    break;
                case 3 :

                    library.removeBook();
                    break;
               case 4:

                    library.updateBook();
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
