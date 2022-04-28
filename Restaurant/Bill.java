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

    }

    /** Constructor with parameters */
    public Bill(Dish setDish, Beverage setBeverage, Customer setCustomer) {

        combo = new Combo(setDish, setBeverage);
        customer = setCustomer;
        originalPrice = combo.getPrice(); // ?
        //2c
        //2d
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

    public void calcPriceWithDiscount() {

        if (customer.getVipLevel() == 0 || customer == null) {

            return combo.calcComboPrice(combo.getDish().getPrice(), combo.getBeverage().getPrice());
        }
    }


}
