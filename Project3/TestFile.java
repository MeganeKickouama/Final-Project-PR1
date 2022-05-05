package Project3;

/** @author M?gane Kickouama @2176328 */

public class TestFile {
    public static void main(String[] args) {

        Loan loan = new Loan(1000, 9, 6);

        System.out.println(loan);
        System.out.println(loan.amortize());
        
        loan.setLoanAmount(-23);
    }
}
