package library;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private double price;
    private int quantity;

    public Book(double price, String author, String title, int quantity) {
        this.price = price;
        this.author = author;
        this.title = title;
        this.quantity = quantity;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) && Objects.equals(quantity, book.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, quantity);
    }

    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", price=" + price + ", quantity=" + quantity + "}";
    }

}
