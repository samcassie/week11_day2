import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;
    private String name;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public int collectionCount(){
        return collection.size();
    }
    public void addBook(Book book){
        this.collection.add(book);
    }

    public void borrowBook(Library library, Book book){
        library.minusBook(book);
        this.addBook(book);
    }

}
