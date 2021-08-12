import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Lord of the Rings",1178,"J.R.R. Tolkien",1954);
        Book book2 = new Book("Harry Potter & the Philosopher's Stone",274,"J.K Rowling",1997);
        Book book3 = new Book("Nineteen Eighty-Four (1984)",328,"George Orwell",1949);
        Book book4 = new Book("Robinson Crusoe",197,"Daniel Defoe",1719);
        Book book5 = new Book("The Call of the Wild",232,"Jack London",1903);

        TreeSet<Book> books = new TreeSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

            System.out.println("************************** A to Z **************************");
        for (Book book:books) {

            System.out.println("------------------------------------------------------------");
            System.out.println("Name           \t : " + book.getName());
            System.out.println("Author         \t : " + book.getAuthorName());
            System.out.println("Year           \t : " + book.getPublishDate());
            System.out.println("Number of Pages\t : " + book.getPageNumber());
            System.out.println("------------------------------------------------------------");

        }

        TreeSet<Book> books1 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber(); // min to max
            }
        });

        books1.add(book1);
        books1.add(book2);
        books1.add(book3);
        books1.add(book4);
        books1.add(book5);

            System.out.println("\n************************ Min to Max ************************");
        for (Book book:books1) {

            System.out.println("------------------------------------------------------------");
            System.out.println("Name           \t : " + book.getName());
            System.out.println("Author         \t : " + book.getAuthorName());
            System.out.println("Year           \t : " + book.getPublishDate());
            System.out.println("Number of Pages\t : " + book.getPageNumber());
            System.out.println("------------------------------------------------------------");

        }









    }
}
