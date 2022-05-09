package Restaurant;

/** @author Mégane Kickouama @2176328 */

public class Bill {

    /** Data members */
    private Combo combo;
    private Customer customer;
    private double originalPrice;
    private double discountedPrice;
    private Tax tax;
    private double finalPrice;

    /** Default constructor */
    public Bill() {

        combo = new Combo();
        customer = new Customer();
        originalPrice = 0;
        discountedPrice = 0;
        tax = new Tax();
        finalPrice = 0;
    }

    /** Overloaded constructor */
    public Bill(Dish setDish, Beverage setBeverage, Customer setCustomer) {

        combo = new Combo(setDish, setBeverage);
        customer = setCustomer;
        originalPrice = combo.calcComboPrice(setDish, setBeverage);
        discountedPrice = this.calcPriceWithDiscount();
        finalPrice = calcFinalPrice();
    }

    /** Copy constructor, copies other bill's data fields */
    public Bill(Bill otherBill) {

        combo = otherBill.combo;
        customer = otherBill.customer;
        originalPrice = otherBill.originalPrice;
        discountedPrice = otherBill.discountedPrice;
        tax = otherBill.tax;
        finalPrice = otherBill.finalPrice;
    }

    /** Facilitator methods */

    /** Calculates price after applysing discount based on VIP Level. */
    public double calcPriceWithDiscount() {

        if (customer != null) {

            switch (customer.getVipLevel()) {

                /**
                 * If customer is level 1, get 5% off.
                 * If customer is level 2, get 10% off.
                 * if customer is level 3, get 15% off.
                 * else, return normal price.
                 */

                case 1:
                    return (combo.calcComboPrice(combo.getDish(), combo.getBeverage()) * 0.95);
                case 2:
                    return (combo.calcComboPrice(combo.getDish(), combo.getBeverage()) * 0.9);
                case 3:
                    return (combo.calcComboPrice(combo.getDish(), combo.getBeverage()) * 0.85);
                default:
                    return combo.calcComboPrice(combo.getDish(), combo.getBeverage());
            }

        } else {

            return combo.calcComboPrice(combo.getDish(), combo.getBeverage());
        }
    }

    /** Updates tax with fedTax * .05 and proTax * .1 */
    public void calcTax() {

        tax.setFedTax(tax.getFedTax() * 0.05);
        tax.setProTax(tax.getProTax() * 0.1);
    }

    /** Discounted price + discount */
    public double calcFinalPrice() {

        calcTax();
        return calcPriceWithDiscount() + tax.getTotalTax();
    }

    /** Gets 1 point for every $10 spent per customer. */
    public int updatePoints() {

        int points;
        points = (int) calcFinalPrice() / 10;
        return points;
    }

    /** is this Bill equal to this other Bill? If so, return true. */
    public boolean equals(Bill otherBill) {

        return (this.combo == otherBill.combo && this.customer == otherBill.customer
                && this.originalPrice == otherBill.originalPrice &&
                this.discountedPrice == otherBill.discountedPrice
                && this.tax == otherBill.tax && this.finalPrice == otherBill.finalPrice);
    }

    /** String format for a Bill */
    @Override
    public String toString() {

        return this.combo.toString() + 
          "\n\n*****************************************\n"
            + "Customer                             : " + "\n"
            + "Original Price                       : $" + "\n"
            + "Discounted Price                     : $" + "\n"
            + "Fed tax                              : $" + "\n"
            + "Pro Tax                              : $" + "\n"
            + "Total Tax                            : $" + "\n"
            + "-----------------------------------------"
            + "Final Price                          : $" + calcFinalPrice() + "\n";
    }

    /** Getters */
    public Combo getCombo() {

        return combo;
    }

    public Customer getCustomer() {

        return customer;
    }

    public double getOriginalPrice() {

        return originalPrice;
    }

    public double getDiscountedPrice() {

        return discountedPrice;
    }

    public Tax getTax() {

        return tax;
    }

    public double getFinalPrice() {

        return finalPrice;
    }

    /** Setters */
    public void setCombo(Combo newCombo) {

        this.combo = newCombo;
    }

    public void setCustomer(Customer newCustomer) {

        this.customer = newCustomer;
    }

    public void setOriginalPrice(double newOriginalPrice) {

        this.originalPrice = newOriginalPrice;
    }

    public void setDiscountedPrice(double newDiscountedPrice) {

        this.discountedPrice = newDiscountedPrice;
    }

    public void setTax(Tax newtax) {

        this.tax = newtax;
    }

    public void setFinalPrice(double newFinalPrice) {

        this.finalPrice = newFinalPrice;
    }
}
