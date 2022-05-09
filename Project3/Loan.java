package Project3;

/** @author Mégane Kickouama @2176328 */

public class Loan {

    /** Data members */

    private double loan;
    private double annualInterest; // in %
    private int months; // loan term in months

    /** Set constructor */
    public Loan(double setLoan, double setAnnualInterest, int setMonths) {

        setLoanAmount(setLoan);
        setAnnualInterestRate(setAnnualInterest);
        setLoanMonths(setMonths);
    }

    @Override
    public String toString() {

        String lines = "----------------------------------";

        return String.format(
                "%s\n           Loan Report\n%s\n          Loan Amount: $%.2f\n Annual Interest rate: %.2f%%\n Loan's term in months: %d\n      Monthly payment: $%.2f\n  Total Interest Paid: $%.2f",
                lines, lines, getLoanAmount(), getAnnualInterestRate(), getLoanMonths(), getMonthlyPayment(),
                getLoanCost());
    }

    /** Facilitator methods */

    public double getMonthlyInterestRate() {

        return this.getAnnualInterestRate() / 1200;
    }

    public double getMonthlyPayment() {

        return (this.getMonthlyInterestRate() * this.getLoanAmount()) /
                (1 - Math.pow(1 + this.getMonthlyInterestRate(), -(this.getLoanMonths())));
    }

    // total interest paid
    public double getLoanCost() { 

        return (getMonthlyPayment() * getLoanMonths()) - getLoanAmount();
    }

    // String format to know how much you pay each month in interest and in principle.
    public String amortize() { 

        String lines = "-----------------------------------------";
        String lines2 = "-----    --------   ---------     -------";
        String[] monthLines = new String[this.getLoanMonths()]; // this is a long String of lines that will contain the monthly cost breakdown.
        String fieldsFormat1 = "Month    Interest   Principal       Loan";
        String fieldsFormat2 = "         Paid       Paid         Balance";
        String allMonthLines = String.format("                               %.2f\n", getLoanAmount());
        double newBalance = getLoanAmount(); // newBalance starts at loan amount and decreases by the principle each month.

        for (int i = 0; i < (this.getLoanMonths()); i++) {

            double interest = (this.getMonthlyInterestRate() * newBalance);

            double principal = getMonthlyPayment() - interest;
            newBalance -= principal;

            monthLines[i] = String.format("     %d    %.2f      %.2f     %.2f\n", (i + 1), interest, principal,
                    newBalance);
            allMonthLines += monthLines[i];
        }

        String total = String.format("Totals      %.2f     %.2f", getLoanCost(), getLoanAmount());

        return String.format(
                "%s\n          Amortization Schedule\n             Monthly Payment\n                 $%.2f\n%s\n%s\n%s\n%s\n\n%s%s\n%s",
                lines, getMonthlyPayment(), lines, fieldsFormat1, fieldsFormat2, lines2, allMonthLines, lines, total);
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
    // if the loan is negative, the program will throw an error.
    public void setLoanAmount(double newLoan) { 

        if (newLoan < 0) {

            throw new IllegalArgumentException("Loan: setLoan: the loan amount must be non-negative");

        } else {

            this.loan = newLoan;
        }

    }

    // if the annualInterest is negative or bigger than 100, the program will throw an error.
    public void setAnnualInterestRate(double newAnnualInterest) { 
        if (newAnnualInterest < 0 || newAnnualInterest > 100) {

            throw new IllegalArgumentException(
                    "Loan: setAnnualInterest: the annual interest should be between 0 and 100");

        } else {

            this.annualInterest = newAnnualInterest;
        }
    }

    // if the number of months is negative, the program will throw an error.
    public void setLoanMonths(int newMonths) { 

        if (newMonths < 0) {

            throw new IllegalArgumentException("Loan: setMonths: the amount of months should be non-negative.");

        } else {

            this.months = newMonths;
        }
    }
}