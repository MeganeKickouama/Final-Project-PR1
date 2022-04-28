package Restaurant;

/** @author Mégane Kickouama @2176328 */
public class Tax {
    
    private double fedTax;
    private double proTax;
    private double totalTax;

    /** Default constructor */
    public Tax() {

    }

    /** Constructor with parameters */
    public Tax(double setFedTax, double setProTax, double setTotalTax) {

        // why is total tax a parameter?
        fedTax = setFedTax;
        proTax = setProTax;
        totalTax = setTotalTax;
    }

    /** Copy Constructor */
    public Tax(Tax otherTax) {

        this.fedTax = otherTax.fedTax;
        this.proTax = otherTax.proTax;
        this.totalTax = otherTax.totalTax;
    }

    public boolean equals(Tax otherTax) {

        return (this.fedTax == otherTax.fedTax &&
        this.proTax == otherTax.proTax &&
        this.totalTax == otherTax.totalTax);
    }

    public String toString() {

        return String.format("Fed Tax            : " + "$%f" + "\n" +
                             "Pro Tax            : " + "$%f" + "\n" +
                             "Total Tax          : "  + "$%f" + "\n", fedTax, proTax, totalTax);
    }

    /** Getters */

    public double getFedTax() {

        return fedTax;
    }

    public double getProTax() {

        return proTax;
    }

    public double getTotalTax() {

        return totalTax;
    }

    /** Setters */

    public void setFedTax(double setFedTax) {

        this.fedTax = setFedTax;
    }

    public void setProTax(double setProTax) {

        this.proTax = setProTax;
    }

    public void setTotalTax(double setTotalTax) {

        this.totalTax = setTotalTax;
    }
}

