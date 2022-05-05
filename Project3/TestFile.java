package Project3;

public class TestFile {
    
    public static void main(String[] args) {

        Loan loan = new Loan(1000, 9, 6);

        System.out.println(amortize(loan));
    }
}
