public interface IBookBuilder {
    IBookBuilder setTitle(String title);

    IBookBuilder setAuthor(String author);

    IBookBuilder setBookId(String bookId);

    IBookBuilder setGenre(String genre);

    IBookBuilder setYearPublished(int yearPublished);

    Book build();
}
