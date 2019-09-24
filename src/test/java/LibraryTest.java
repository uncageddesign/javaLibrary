import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LibraryTest {

    Book book;
    Library library;

    @Before
    public void setUp(){
        book = new Book("Night Watch", "Terry Pratchett", "Fantasy");
        library = new Library();
    }

    @Test
    public void hasACollection(){
        //Given the library exists
        assertNotNull(library);
        //Then the library has a collection
        assertEquals(0, library.collectionCount());
    }

    @Test
    public void canAddABookToTheCollection(){
        //Given we have a library
        assertNotNull(library);
        //When a book is to be added to the collection
        library.addBook(book);
        //Then the collection will increase by one
        assertEquals(1, library.collectionCount());
    }

}
