package Restaurant;

/** @author Mégane Kickouama @2176328 */

public class Tax {
    
    /** Data members */
    private double fedTax;
    private double proTax;
    private double totalTax;

    /** Default constructor */
    public Tax() {

        fedTax = 0;
        proTax = 0;
        totalTax = 0;
    }

    /** Constructor with parameters */
    public Tax(double setFedTax, double setProTax, double setTotalTax) {

        fedTax = setFedTax;
        proTax = setProTax;
        totalTax = setTotalTax;
    }

    /** Copy Constructor */
    public Tax(Tax otherTax) {

        fedTax = otherTax.fedTax;
        proTax = otherTax.proTax;
        totalTax = otherTax.totalTax;
    }

    /** Does this Tax have equal data fields as this other Tax? */
    public boolean equals(Tax otherTax) {

        return (this.fedTax == otherTax.fedTax &&
        this.proTax == otherTax.proTax &&
        this.totalTax == otherTax.totalTax);
    }

    /** String format for Tax */
    @Override
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
    public void setFedTax(double newFedTax) {

        this.fedTax = newFedTax;
    }

    public void setProTax(double newProTax) {

        this.proTax = newProTax;
    }

    public void setTotalTax(double newTotalTax) {

        this.totalTax = newTotalTax;
    }
}

