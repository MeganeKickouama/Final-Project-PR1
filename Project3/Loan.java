package Project3;

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

        return this.getAnnualInterestsRate() / 1200;
    }

    public double getMonthlyPayment() {

        return (this.getMonthlyInterestRate() * this.getLoanAmount()) /
               (1 - Math.pow(1 + this.getMonthlyInterestRate(), - (this.getLoanMonths())));
    }

    public double getLoanCost() { // only the interest or total spent?

        return (getMonthlyPayment() * getLoanMonths()) - getLoanAmount();
    }

    public String amortize(Loan loan) {

        String lines = "-----------------------------------------";
        String lines2 = "-----    --------   ---------     -------";
        String[] monthLines = new String[this.getLoanMonths()];
        String fieldsFormat1 = "Month    Interest   Principal      Loan";
        String fieldsFormat2 = "         Paid       Paid        Balance";
        String allMonthLines = "";
        double newBalance = getLoanAmount();


        for (int i = 0; i < (this.getLoanMonths()); i++) { 

            double interest = (getAnnualInterestsRate() *  newBalance);

            newBalance -= getMonthlyPayment();
            monthLines[i] = String.format("%d        %f.00      %f     %f\n", (i + 1), interest, (getMonthlyPayment() - interest), newBalance);
            // monthLines[i] = (i + 1) + interest + getMonthlyPayment() - interest + newBalance + "\n";
            allMonthLines += monthLines[i];

        }

        return String.format(
                "%s\n          Amortization Schedule\n             Monthly Payment\n                 $%f.00\n%s\n%s\n%s\n%s\n\n%s\n%s",
                lines, getMonthlyPayment(), lines, fieldsFormat1, fieldsFormat2, lines2, allMonthLines, lines); // TODO: add totals string

    }

    /** Getters */

    public double getLoanAmount() {

        return loan;
    }

    public double getAnnualInterestsRate() {

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

            throw new IllegalArgumentException(
                    "Loan: setAnnualInterest: the annual interest should be between 0 and 100");

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