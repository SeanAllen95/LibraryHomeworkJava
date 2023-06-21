import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(){
        this.books = new ArrayList<Book>();
        this.capacity = 5;
    }
    public int getBookCount(){
        return this.books.size();
    }

    public Book removeBook(){
        return this.books.remove(0);
    }
    public void addBookIfCapacityNotReached(Book book){
        int booksInStock = getBookCount();

        if (booksInStock <= this.capacity) {
            this.books.add(book);
        }
        System.out.println(booksInStock);
    }




}
