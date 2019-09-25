import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BorrowerTest {

    Book book;
    Borrower borrower;
    Library library;

    @Before
    public void setUp(){
        borrower = new Borrower("Alison");
        library = new Library(3);
        book = new Book("Night Watch", "Terry Pratchett", "Fantasy");
    }

    @Test
    public void canCheckOutBooks(){
        //Given the borrower can checkout books
        assertNotNull(borrower);
        //Then the book will be checked
        assertEquals(0, borrower.checkedOut());
    }

    @Test
    public void borrowerHasCheckOutABook(){
        //Given the borrower can checkout books
        assertNotNull(borrower);
        //And the library has a collection with a book in it
        assertNotNull(library);
        library.addBook(book);
        //When a book is checked out by borrower
        borrower.hasCheckedOutBook(library);
        //Then the borrowers checkout books increase by 1
        assertEquals(1, borrower.checkedOut());
    }

}
