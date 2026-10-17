import java.util.ArrayList;
import java.util.List;

class Member {
    private final String memberId;
    private final List<Loan> loans = new ArrayList<>();

    Member(String memberId) {
        this.memberId = memberId;
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }
}

class Loan {
    private final String loanId;
    private final Member member;

    Loan(String loanId, Member member) {
        this.loanId = loanId;
        this.member = member;
    }
}