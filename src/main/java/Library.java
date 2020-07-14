import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public static void main(String[] args) {
        HashMap<String, Integer> bookGenres = new HashMap();

        bookGenres.put("Thriller", 20);
        bookGenres.put("Romantic", 10);
        bookGenres.put("Non-Fiction", 3);
        bookGenres.put("Dictionaries", 20);
    }

    public int bookCount(){
        return books.size();
    }

    public void minusBook(Book book){
        if (this.bookCount() >= 1){
            books.remove(0);
        }
    }

    public void addBook(Book book) {
        if (books.size() < capacity) {
            books.add(book);
        }
    }



}
