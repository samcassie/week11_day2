import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(10);
        book = new Book("My Book","Sam", "Thriller");
        borrower = new Borrower("Pete");
    }

    @Test
    public void canAddBook(){
        borrower.addBook(book);
        borrower.addBook(book);
        assertEquals(2, borrower.collectionCount());
    }

    @Test
    public void addsToBorrowerFromLibrary(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        borrower.borrowBook(library, book);
        assertEquals(1, borrower.collectionCount());
    }

    @Test
    public void takesFromLibraryToBorrower(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        borrower.borrowBook(library, book);
        assertEquals(2, library.bookCount());
    }

}
