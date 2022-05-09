package Project3;
import java.util.Scanner;

/** @author Mégane Kickouama @2176328 */

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char answer;

        do {

            System.out.print("Please enter the amount of the loan: ");
            double loanAmount = input.nextDouble();

            System.out.print("Please enter the annual interest rate: ");
            int interestRate = input.nextInt();

            System.out.print("Please enter the number of periods in months: ");
            int months = input.nextInt();

            Loan loan = new Loan(loanAmount, interestRate, months);
            System.out.println(loan);
            System.out.println(loan.amortize());

            System.out.print("If you would like to get another report or start over, please type y or Y. If not, type any other character: ");
            answer = input.next().charAt(0);
            answer = Character.toLowerCase(answer);

        } while (answer == 'y');

        input.close();

        System.out.println("goodbye!");
    }
}
