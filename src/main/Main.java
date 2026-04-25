public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "B001");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "B002");

        Member member = new Member("Hisham", "M001");

        library.addBook(book1);
        library.addBook(book2);
        library.addMember(member);

        System.out.println("Welcome to the Library Checkout System!");
        System.out.println();

        library.displayBooks();

        System.out.println();
        library.checkoutBook("B001", "M001");

        System.out.println();
        library.displayBooks();

        System.out.println();
        library.returnBook("B001");

        System.out.println();
        library.displayBooks();
    }
}
