import java.util.ArrayList;

public class Library {
    ArrayList<Book>books= new ArrayList<>();







    public void DisplayBook(){

        if(books.isEmpty()){
            System.out.println("There is no book to display");
        }else{
            for(Book book :books){
                System.out.println(books);
            }
        }

    }





    public void AddBook(Book book){
        books.add(book);
        System.out.println("the book is added seccessfully");

    }



}
