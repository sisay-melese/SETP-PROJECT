import java.time.LocalDate;

public class loan {

    private book book;
    private member member;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private boolean returned;
    private String condition;

    public loan(book book, member member) {
        this.book = book;
        this.member = member;
        this.borrowDate = LocalDate.now();
        this.returned = false;
        this.condition = "New";
    }

    public boolean borrowBook() {
        if (book.isAvailable()) {
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    public boolean returnBook() {
        if (!returned) {
            book.setAvailable(true);
            book.setCondition(conditionAfterReturn);
            this.returnDate = LocalDate.now();
            this.returned = true;
            return true;
        }
        return false;
    }

    public book getbook() {
        return book;
    }

    public member getMember() {
        return member;
    }

    public boolean isReturned() {
        return returned;
    }
}
