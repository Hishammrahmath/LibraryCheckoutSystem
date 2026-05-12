import java.util.ArrayList;

public class Member {
    private String name;
    private String memberId;
    private ArrayList<String> checkedOutBookIds;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.checkedOutBookIds = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public int getCheckedOutBookCount() {
        return checkedOutBookIds.size();
    }

    public void checkoutBook(String bookId) {
        checkedOutBookIds.add(bookId);
    }

    public void returnBook(String bookId) {
        checkedOutBookIds.remove(bookId);
    }
}
