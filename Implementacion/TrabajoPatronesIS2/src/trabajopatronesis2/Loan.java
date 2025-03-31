
package trabajopatronesis2;

import java.time.LocalDateTime;

public class Loan 
{
    private User user;
    private Book book;
    private LocalDateTime loanStartDate;
    private ILoanStrategy strategy;
    private LocalDateTime loanFinishDate;

    public Loan(User user, Book book, LocalDateTime loanStartDate, ILoanStrategy strategy) {
        this.user = user;
        this.book = book;
        this.loanStartDate = loanStartDate;
        this.strategy = strategy;
        this.loanFinishDate = loanStartDate.plusDays(10);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDateTime getLoanStartDate() {
        return loanStartDate;
    }

    public void setLoanStartDate(LocalDateTime loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public LocalDateTime getLoanFinishDate() {
        return loanFinishDate;
    }
    
    public ILoanStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(ILoanStrategy strategy) {
        this.strategy = strategy;
    }
}
