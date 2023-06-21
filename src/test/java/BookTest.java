import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;
    private Library library;
    private Borrower borrower;

    @Before
    public void before(){
        book = new Book("In the Kitchen", "Steve", "Cooking");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("In the Kitchen", book.getTitle());
    }
    @Test
    public void bookHasAuthor(){
        assertEquals("Steve", book.getAuthor());
    }
    @Test
    public void bookHasGenre(){
        assertEquals("Cooking", book.getGenre());
    }

}
