public class Book {
    private String title;
    private String author;
    private String bookId;
    private boolean checkedOut;

    public Book(String title, String author, String bookId) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookId() {
        return bookId;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void returnBook() {
        checkedOut = false;
    }

    public String getStatus() {
        if (checkedOut) {
            return "Checked Out";
        }
        return "Available";
    }
}
