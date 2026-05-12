public class Book {
    private String title;
    private String author;
    private String bookId;
    private String genre;
    private int yearPublished;
    private boolean checkedOut;

    public Book(String title, String author, String bookId, String genre, int yearPublished) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.genre = genre;
        this.yearPublished = yearPublished;
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

    public String getGenre() {
        return genre;
    }

    public int getYearPublished() {
        return yearPublished;
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
