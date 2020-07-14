import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(5);
        book = new Book("About Me", "Sam", "Thriller");
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void bookCount(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void wontAddOverCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.bookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.minusBook(book);
        assertEquals(2, library.bookCount());
    }


}
