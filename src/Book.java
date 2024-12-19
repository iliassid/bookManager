public class Book{
    String title;
    String author;
    String isbn;
    Boolean isAvailable;

    public Book(String title, String author, String isbn, Boolean isAvailable){

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor (){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public Boolean getIsAvailable(){
        return isAvailable;
    }
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    @Override
    public String toString() {


        return "------------------------] \n" +
                "Title : " + title +
                "\nAuthor : " + author +
                "\nIsbn : " + isbn +
                "\nIsAvailable :" + isAvailable +
                "\n"+"[------------------------" ;
    }
}




