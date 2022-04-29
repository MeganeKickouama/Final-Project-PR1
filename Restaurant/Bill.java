package Restaurant;

public class Bill {
    
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

    /** Constructor with parameters */
    public Bill(Dish setDish, Beverage setBeverage, Customer setCustomer) {

        combo = new Combo(setDish, setBeverage);
        customer = setCustomer;
        originalPrice = combo.calcComboPrice(setDish, setBeverage); 
        discountedPrice = this.calcPriceWithDiscount();
        
        //2e

    }

    /** Copy constructor */
    public Bill(Bill otherBill) {

        this.combo = otherBill.combo;
        this.customer = otherBill.customer;
        this.originalPrice = otherBill.originalPrice;
        this.discountedPrice = otherBill.discountedPrice;
        this.tax = otherBill.tax;
        this.finalPrice = otherBill.finalPrice;
    }

    public double calcPriceWithDiscount() {

        if (customer != null) {

            switch (customer.getVipLevel()) { 

                /** If customer is level 1, get 5% off.
                 * If customer is level 2, get 10% off.
                 * if customer is level 3, get 15% off.
                 * else, return normal price. 
                 */

                case 1: return (combo.calcComboPrice(combo.getDish(), combo.getBeverage()) * 0.95); 
                case 2: return (combo.calcComboPrice(combo.getDish(), combo.getBeverage()) * 0.9);
                case 3: return (combo.calcComboPrice(combo.getDish(), combo.getBeverage()) * 0.85);
                default: return combo.calcComboPrice(combo.getDish(), combo.getBeverage());
            }

        } else {

            return combo.calcComboPrice(combo.getDish(), combo.getBeverage());
        }
    }

    public void calcTax() {

        // multiply federal tax with 

        tax.setFedTax(tax.getFedTax() * 0.05);
        tax.setProTax(tax.getProTax() * 0.1);
    }

    public double calcFinalPice() {

        calcTax();

        return calcPriceWithDiscount() + tax.getTotalTax();
    }
}
