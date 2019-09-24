import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){
        this.collection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int collectionCount() {
        return this.collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
    }

    public boolean hasCapacity() {
        return this.capacity >= this.collection.size();
    }

    public Book takeBook() {
       return this.collection.remove(0);
    }
}