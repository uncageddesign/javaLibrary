import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    Book book1;
    Book book2;
    Library library;

    @Before
    public void setUp(){
        book1 = new Book("Night Watch", "Terry Pratchett", "Fantasy");
        book2 = new Book("Frankenstein", "Mary Shelley", "Horror");
        library = new Library(3);
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
        library.addBook(book1);
        //Then the collection will increase by one
        assertEquals(1, library.collectionCount());
    }

    @Test
    public void hasCapacityBeenReached(){
        //Given we have a library
        assertNotNull(library);
        //And it has books in the collection
        library.addBook(book1);
        library.addBook(book2);
        //When the collection has reached capacity
        assertTrue(library.hasCapacity());
        //Then books cannot be added
        assertEquals(2, library.collectionCount());
    }

}
