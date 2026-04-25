import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void displayBooks() {
        System.out.println("Library Books:");

        for (Book book : books) {
            System.out.println(
                book.getBookId() + " - " +
                book.getTitle() + " by " +
                book.getAuthor() + " | Status: " +
                book.getStatus()
            );
        }
    }

    public void checkoutBook(String bookId, String memberId) {
        Book book = findBookById(bookId);
        Member member = findMemberById(memberId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        if (book.isCheckedOut()) {
            System.out.println("This book is already checked out.");
            return;
        }

        book.checkOut();
        System.out.println(member.getName() + " checked out: " + book.getTitle());
    }

    public void returnBook(String bookId) {
        Book book = findBookById(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isCheckedOut()) {
            System.out.println("This book was not checked out.");
            return;
        }

        book.returnBook();
        System.out.println("Returned: " + book.getTitle());
    }

    private Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }

        return null;
    }

    private Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }

        return null;
    }
}
