import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Library library;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Walking", "Dave", "Exercise");
        borrower = new Borrower("Bob");
    }
    
    @Test
    public void canGetBookCountWithNoBooks(){
        assertEquals(0, borrower.getBookCount());
    }

    @Test
    public void canWithdrawBook(){
        borrower.withdrawBook(book);
        assertEquals(1, borrower.getBookCount());
    }
}
