import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;

    private Library library;
    @Before
    public void before(){
        library = new Library();
        book = new Book("In the Kitchen", "Steve", "Cooking");

    }

//    @Test
//    public void canAddBookToLibrary(){
//        library.addBook(book);
//        assertEquals(1, library.getBookCount());
//    }

    @Test
    public void canRemoveBookFromLibrary(){
        library.addBookIfCapacityNotReached(book);
        library.removeBook();
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBookToLibraryIfCapacityNotReached(){
        library.addBookIfCapacityNotReached(book);
        library.addBookIfCapacityNotReached(book);
        library.addBookIfCapacityNotReached(book);
        library.addBookIfCapacityNotReached(book);
        library.addBookIfCapacityNotReached(book);
        assertEquals(5, library.getBookCount());
    }

}
