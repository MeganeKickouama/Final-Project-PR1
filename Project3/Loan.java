package Project3;

/** @author Mégane Kickouama @2176328 */

public class Loan {

    /** Data members */

    private double loan;
    private double annualInterest; // in %
    private int months; // loan term in months

    /** Set consutructor */
    public Loan(double setLoan, double setAnnualInterest, int setMonths) {

        setLoanAmount(setLoan);
        setAnnualInterestRate(setAnnualInterest);
        setLoanMonths(setMonths);
    }

    @Override
    public String toString() {

        return String.format(" ");
    }

    /** Facilitator methods */

    public double getMonthlyInterestRate() {

        return this.getAnnualInterestRate() / 1200;
    }

    public double getMonthlyPayment() {

        return (this.getMonthlyInterestRate() * this.getLoanAmount()) /
               (1 - Math.pow(1 + this.getMonthlyInterestRate(), - (this.getLoanMonths())));
    }

    public double getLoanCost() { // total interest paid

        return (getMonthlyPayment() * getLoanMonths()) - getLoanAmount();
    }

    public String amortize() {

        String lines = "-----------------------------------------";
        String lines2 = "-----    --------   ---------     -------";
        String[] monthLines = new String[this.getLoanMonths()];
        String fieldsFormat1 = "Month    Interest   Principal       Loan";
        String fieldsFormat2 = "         Paid       Paid         Balance";
        String allMonthLines = "";
        double newBalance = getLoanAmount();
        double totalInterest = 0;


        for (int i = 0; i < (this.getLoanMonths()); i++) { 

            double interest = (this.getMonthlyInterestRate() *  newBalance);
            totalInterest += interest;

            double principal = getMonthlyPayment() - interest;
            newBalance -= principal;

            monthLines[i] = String.format("%-4d    %.2f      %.2f     %.2f\n", (i + 1), interest, principal, newBalance);
            allMonthLines += monthLines[i];
        }

        String total = String.format("Totals      %.2f     %.2f", totalInterest, getLoanAmount());

        return String.format(
                "%s\n          Amortization Schedule\n             Monthly Payment\n                 $%.2f\n%s\n%s\n%s\n%s\n\n%s%s\n%s",
                lines, getMonthlyPayment(), lines, fieldsFormat1, fieldsFormat2, lines2, allMonthLines, lines, total); 
                // TODO: add totals string

    }

    /** Getters */

    public double getLoanAmount() {

        return loan;
    }

    public double getAnnualInterestRate() {

        return annualInterest;
    }

    public int getLoanMonths() {

        return months;
    }

    /** Setters */

    public void setLoanAmount(double setLoan) {

        if (setLoan < 0) {

            throw new IllegalArgumentException("Loan: setLoan: the loan amount must be non-negative");

        } else {

            this.loan = setLoan;
        }

    }

    public void setAnnualInterestRate(double setAnnualInterest) {

        if (setAnnualInterest < 0 || setAnnualInterest > 100) {

            throw new IllegalArgumentException("Loan: setAnnualInterest: the annual interest should be between 0 and 100");

        } else {

            this.annualInterest = setAnnualInterest;
        }
    }

    public void setLoanMonths(int setMonths) {

        if (setMonths < 0) {

            throw new IllegalArgumentException("Loan: setMonths: the amount of months should be non-negative.");

        } else {

            this.months = setMonths;
        }
    }
}