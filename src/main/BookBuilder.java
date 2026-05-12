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
        validateBookInformation();
        return new Book(title, author, bookId, genre, yearPublished);
    }

    private void validateBookInformation() {
        if (title == null || title.isBlank()) {
            throw new IllegalStateException("A book must have a title.");
        }

        if (author == null || author.isBlank()) {
            throw new IllegalStateException("A book must have an author.");
        }

        if (bookId == null || bookId.isBlank()) {
            throw new IllegalStateException("A book must have a book ID.");
        }

        if (genre == null || genre.isBlank()) {
            throw new IllegalStateException("A book must have a genre.");
        }

        if (yearPublished <= 0) {
            throw new IllegalStateException("A book must have a valid year published.");
        }
    }
}
