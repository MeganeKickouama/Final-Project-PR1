package Restaurant;

/** @author Mégane Kickouama @2176328 */

public class Combo {
    
    /** Data members */
    private Dish dish;
    private Beverage beverage;

    /** Default constructor*/
    public Combo() {

        dish = new Dish();
        beverage = new Beverage();
    }

    /** Overloaded constructor */
    public Combo(Dish setDish, Beverage setBeverage) {

        dish = setDish;
        beverage = setBeverage;
    }

    /** Copy constructor, set data field to other combo's data fields */
    public Combo(Combo otherCombo) {

        dish = otherCombo.dish;
        beverage = otherCombo.beverage;
    }

    /** Get price of dish, get price of beverage, get 10% off */
    public double calcComboPrice(Dish dish, Beverage beverage) { 

        return ((dish.getPrice() + beverage.getPrice()) * 0.9);
    }

    /** Is this combo equal to anther combo? */
    public boolean equals(Combo otherCombo) {

        return (this.dish == otherCombo.dish && this.beverage == otherCombo.beverage);
    }

    /** String format for the Combo, is composed of string format for dish and beverage. */
    @Override
    public String toString() {

        return "Dish: \n\n" + this.dish.toString() + "\n\nBeverage: \n\n" + this.beverage.toString();
    }

    /** Getters */
    public Dish getDish() {

        return dish;
    }

    public Beverage getBeverage() {

        return beverage;
    }

    /** Setters */
    public void setDish(Dish newDish) {

        this.dish = newDish;
    }

    public void setBeverage(Beverage newBeverage) {

        this.beverage = newBeverage;
    }
}
