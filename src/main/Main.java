public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new BookBuilder()
            .setTitle("The Great Gatsby")
            .setAuthor("F. Scott Fitzgerald")
            .setBookId("B001")
            .setGenre("Classic Fiction")
            .setYearPublished(1925)
            .build();

        Book book2 = new BookBuilder()
            .setTitle("To Kill a Mockingbird")
            .setAuthor("Harper Lee")
            .setBookId("B002")
            .setGenre("Historical Fiction")
            .setYearPublished(1960)
            .build();

        Book book3 = new BookBuilder()
            .setTitle("Clean Code")
            .setAuthor("Robert C. Martin")
            .setBookId("B003")
            .setGenre("Software Development")
            .setYearPublished(2008)
            .build();

        Member member = new Member("Hisham", "M001");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addMember(member);

        System.out.println("Welcome to the Library Checkout System!");
        System.out.println();

        library.displayBooks();

        System.out.println();
        library.checkoutBook("B001", "M001");

        System.out.println();
        library.checkoutBook("B002", "M001");

        System.out.println();
        library.setCheckoutPolicy(new StudentCheckoutPolicy());
        library.checkoutBook("B002", "M001");

        System.out.println();
        library.displayBooks();

        System.out.println();
        library.returnBook("B001", "M001");

        System.out.println();
        library.displayBooks();
    }
}
