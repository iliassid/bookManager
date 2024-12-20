import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book>books= new ArrayList<>();
    Scanner scanner = new Scanner(System.in);







    public void DisplayBook(){

        if(books.isEmpty()){
            System.out.println("There is no book to display");
        }
            for(Book book :books){
                System.out.println(book);
            }


    }





    public void AddBook(Book book){
        books.add(book);
        System.out.println("the book is added seccessfully");

    }




    public void removeBook(String isbn){
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("The book removed seccessfully");
    }



    public void updateBook(String isbn, int choiceToUpdate){
        Scanner scanner = new Scanner(System.in);
        for(Book book:books){
            if(book.getIsbn().equals(isbn)){
                switch (choiceToUpdate){
                    case 1:
                        System.out.println("Enter the new title:");
                        book.setTitle(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Enter the new author:");
                        book.setAuthor(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Enter if the book is available (true/false)");
                        book.setIsAvailable(scanner.nextBoolean());
                        break;
                    default:
                        System.out.println("invalid choice ");
                }
                System.out.println("Book updated successfuly");
                return;

            }

        }
        System.out.println("Book not found.");

    }
    public void searchBook(){
        ArrayList<Book> stock =new ArrayList<>();
        String valueToSearch;
        System.out.println("Enter the isbn or title or author:");
        valueToSearch = scanner.nextLine();
        for(Book book: books){
            if (book.getTitle().equals(valueToSearch) ||
                    book.getIsbn().equals(valueToSearch) || book.getAuthor().equals(valueToSearch)){
                stock.add(book);
            }

        }if (stock.isEmpty()){
            System.out.println("Book not found");
        }else{
            for (Book book: stock){
                System.out.println(book);
            }
        }
    }

}
