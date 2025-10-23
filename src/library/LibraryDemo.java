package library;

import java.util.Scanner;


public class LibraryDemo implements Commands {

    private static Scanner sc = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = sc.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK:
                    searchBook();
                    break;
                case PRINT_EXPENSIVE_BOOK:
                    Book expensiveBook = bookStorage.getMaxPrice();
                    System.out.println(expensiveBook);
                    break;
                case DELETE_BOOK:
                    System.out.println("Please enter the book you would like to delete");
                    int id = Integer.parseInt(sc.nextLine());
                    bookStorage.deleteBookById(id);
                case SEARCH_BY_PRICE_RANGE:
                    System.out.println("Enter minimum price:");
                    double minPrice = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter maximum price:");
                    double maxPrice = Double.parseDouble(sc.nextLine());
                    bookStorage.searchByPriceRange(minPrice, maxPrice);
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }

    private static void searchBook() {
        System.out.println("Please enter keyword:");
        String keyword = sc.nextLine();
        bookStorage.search(keyword);
    }

    private static void addBook() {
        System.out.println("Enter title:");
        String bookTitle = sc.nextLine();
        System.out.println("Enter author:");
        String authorName = sc.nextLine();
        System.out.println("Enter price:");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Enter quantity:");
        int quantity = Integer.parseInt(sc.nextLine());
        Book book = new Book(price, authorName, bookTitle, quantity);
        bookStorage.add(book);
        System.out.println("Book added successfully!");
    }

    public static void printCommands() {
        System.out.println("Please input 0 for EXIT:");
        System.out.println("Please input 1 for ADD BOOK:");
        System.out.println("Please input 2 for PRINT ALL BOOKS:");
        System.out.println("Please input 3 for SEARCH BOOKS:");
        System.out.println("Please input 4 for PRINT EXPENSIVE BOOK:");
        System.out.println("Please input 5 for DELETE BOOKS:");
        System.out.println("Please input 6 for SEARCH BY PRICE RANGE:");
    }
}

