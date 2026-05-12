public interface CheckoutPolicy {
    boolean canCheckout(Member member, Book book);

    String getCheckoutMessage(Member member, Book book);

    String getPolicyName();
}
