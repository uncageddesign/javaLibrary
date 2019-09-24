import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> checked;

    public Borrower(String name) {
        this.name = name;
        this.checked = new ArrayList<Book>();
    }

    public int checkedOut() {
        return this.checked.size();
    }

    public void checkBook(Book book){
        this.checked.add(book);
    }

    public void hasCheckedOutBook(Library library) {
        Book getsBook = library.takeBook();
        this.checkBook(getsBook);
    }
}
