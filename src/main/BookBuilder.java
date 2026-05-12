public class BookBuilder implements IBookBuilder {
    private String title;
    private String author;
    private String bookId;
    private String genre;
    private int yearPublished;

    @Override
    public IBookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public IBookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    @Override
    public IBookBuilder setBookId(String bookId) {
        this.bookId = bookId;
        return this;
    }

    @Override
    public IBookBuilder setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    @Override
    public IBookBuilder setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
        return this;
    }

    @Override
    public Book build() {
        return new Book(title, author, bookId, genre, yearPublished);
    }
}
