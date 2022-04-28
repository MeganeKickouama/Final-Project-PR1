package Restaurant;

public class Combo {
    
    private Dish dish;
    private Beverage beverage;

    public Combo() {


    }

    public Combo(Dish setDish, Beverage setBeverage) {

        dish = setDish;
        beverage = setBeverage;
    }

    public Combo(Combo otherCombo) {

        this.dish = otherCombo.dish;
        this.beverage = otherCombo.beverage;
    }

    public double calcComboPrice(Dish dish, Beverage beverage) { // fix this to get double parameters

        return ((dish.getPrice() + beverage.getPrice()) * 0.9);
    }

    public boolean equals(Combo otherCombo) {

        return (this.dish == otherCombo.dish && this.beverage == otherCombo.beverage);
    }

    public String toString() {

        return this.dish.toString() + "\n" + this.beverage.toString();
    }

    /** Getters */

    public Dish getDish() {

        return this.dish;
    }

    public Beverage getBeverage() {

        return beverage;
    }

    /** Setters */

    public void setDish(Dish newDish) {

        dish = newDish;
    }

    public void setBeverage(Beverage newBeverage) {

        beverage = newBeverage;
    }
}
