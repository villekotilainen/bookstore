package bookstore.bookstore.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String author;
    private int publicationYear;
    private long isbn;
    private double price;


    //constructors
    public Book() {

        super();
        this.title = null;
        this.author = null;
        this.publicationYear = 0;
        this.isbn = 0;
        this.price = 0;
    }

    public Book(String title, String author, int publicationYear, long isbn, double price) {

        super();
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
        this.price = price;
    }


    // setters
    public void setBookTitle(String title) {
        this.title = title;
    }
    public void setBookAuthor(String author) {
        this.author = author;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public void setBookIsbn(long isbn) {
        this.isbn = isbn;
    }
    public void setBookPrice(double price) {
        this.price = price;
    }
    
    
    // getters
    public String getBookTitle(String title) {
        return title;
    }
    public String getBookAuthor(String author) {
        return author;
    }
    public int getPublicationYear(int publicationYear) {
        return publicationYear;
    }
    public Long getBookIsbn(long isbn) {
        return isbn;
    }
    public Double getBookPrice(double price) {
        return price;
    }


@Override
public String toString() {
    return "Book id=" + id + ", Book title=" + title + ", Book author="+ author +",Book publication year="+ publicationYear + ", ISBN="+ isbn + ", Book price=" + price;
}
}