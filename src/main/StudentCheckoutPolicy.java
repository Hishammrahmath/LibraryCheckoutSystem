public class StudentCheckoutPolicy implements CheckoutPolicy {
    private static final int MAX_BOOKS_ALLOWED = 2;

    @Override
    public boolean canCheckout(Member member, Book book) {
        return member.getCheckedOutBookCount() < MAX_BOOKS_ALLOWED;
    }

    @Override
    public String getCheckoutMessage(Member member, Book book) {
        if (canCheckout(member, book)) {
            return member.getName() + " is allowed to check out: " + book.getTitle();
        }

        return "Student policy only allows " + MAX_BOOKS_ALLOWED + " checked out books at a time.";
    }

    @Override
    public String getPolicyName() {
        return "Student Checkout Policy";
    }
}
