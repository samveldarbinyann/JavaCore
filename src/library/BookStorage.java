package library;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extand();
        }
        books[size++] = book;
    }

    private void extand() {
        Book[] temp = new Book[size + 10];
        System.arraycopy(books, 0, temp, 0, size);
        books = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(books[i]);
            }
        }
    }

    public Book getMaxPrice() {
        double price = 0;
        int maxIndex = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() > price) {
                price = books[i].getPrice();
                maxIndex = i;
            }
        }
        return books[maxIndex];
    }

    public void deleteBookById(int id) {
        if (id < 0 || id > size) {
            System.out.println("Invalid id");
            return;
        }
        for (int i = id; i < size; i++) {
            books[i] = books[i + 1];
        }
        books[--size] = null;
        System.out.println("Book with id " + id + " has been deleted");
    }

    public void searchByPriceRange(double minPrice, double maxPrice) {
        if (minPrice > maxPrice || minPrice < 0 || maxPrice < 0) {
            System.out.println("Invalid price");
        }
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() >= minPrice && books[i].getPrice() <= maxPrice) {
                System.out.println(books[i]);
            }
        }
    }
}
