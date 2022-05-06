package Project3;
import java.util.Scanner;

/** @author Mégane Kickouama @2176328 */

public class TestFile {
    public static void main(String[] args) {

        Loan loan = new Loan(1000, 9, 6);

        System.out.println(loan);
        //System.out.println(loan.amortize());
        
        //loan.setLoanAmount(-23);

        Scanner scan = new Scanner(System.in);

        // System.out.println("Enter the loan amount: ");
        // int loanAmout = scan.nextInt();

        // System.out.println("Enter the annual interest: ");
        // int annualInterest = scan.nextInt();

        // System.out.println("Enter the number of reccurences in months: ");
        // int months = scan.nextInt();

        // Loan loanScanned = new Loan(loanAmout, annualInterest, months);
        // System.out.println(loanScanned.amortize());
        
        scan.close();
        System.out.println(loan.getTotalInterest());
    }
}
