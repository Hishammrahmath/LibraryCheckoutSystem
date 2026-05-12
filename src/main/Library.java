import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    private CheckoutPolicy checkoutPolicy;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        checkoutPolicy = new StandardCheckoutPolicy();
    }

    public Library(CheckoutPolicy checkoutPolicy) {
        books = new ArrayList<>();
        members = new ArrayList<>();
        this.checkoutPolicy = checkoutPolicy;
    }

    public void setCheckoutPolicy(CheckoutPolicy checkoutPolicy) {
        this.checkoutPolicy = checkoutPolicy;
        System.out.println("Checkout policy changed to: " + checkoutPolicy.getPolicyName());
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
                book.getAuthor() + " (" +
                book.getGenre() + ", " +
                book.getYearPublished() + ") | Status: " +
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

        if (!checkoutPolicy.canCheckout(member, book)) {
            System.out.println(checkoutPolicy.getCheckoutMessage(member, book));
            return;
        }

        book.checkOut();
        member.checkoutBook(book.getBookId());
        System.out.println(member.getName() + " checked out: " + book.getTitle());
    }

    public void returnBook(String bookId, String memberId) {
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

        if (!book.isCheckedOut()) {
            System.out.println("This book was not checked out.");
            return;
        }

        book.returnBook();
        member.returnBook(book.getBookId());
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
