package homework4;

public class Book {
    //图书的属性有：编号，书名，作者，价格
    private String ref;
    private String bookName;
    private String author;
    private String price;

    public Book() {
    }

    public Book(String ref, String bookName, String author, String price) {
        this.ref = ref;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
