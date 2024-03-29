public class Book implements Comparable<Book> {

    private String name;
    private int pageNumber;
    private String authorName;
    private int publishDate;

    public Book(String name, int pageNumber, String authorName, int publishDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }


    @Override
    public int compareTo(Book book) {
        return this.getName().compareTo(book.getName());
    }
}
