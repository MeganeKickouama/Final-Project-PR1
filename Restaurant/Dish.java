package Restaurant;

/** @author Mégane Kickouama 2176328 */

public class Dish {

    /** Data members */
    private String dishID;
    private String dishName;
    private char size;
    private double price;
    private boolean isSpicy;

    private static int nextID = 0;

    /** Default constructor, components are empty and falsified */
    public Dish() {

        nextID++;
        dishID = generateID(nextID);
        dishName = "";
        size = ' ';
        price = 0;
        isSpicy = false;
    }

    /** Overloaded constructor, user uses parameters to choose the settings */
    public Dish(String setDishName, char setSize, double setPrice, boolean setIsSpicy) {

        nextID++;
        dishID = generateID(nextID);
        dishName = setDishName;
        size = setSize;
        price = setPrice;
        isSpicy = setIsSpicy;
    }

    /** Copy constructor */
    public Dish(Dish otherDish) {

        dishID = otherDish.dishID;
        dishName = otherDish.dishName;
        size = otherDish.size;
        price = otherDish.price;
        isSpicy = otherDish.isSpicy;
    }

    /**
     * GeneratID method determines if the number is 1, 2 or 3 digits and adds a "D"
     * and zeros accordingly
     */
    public String generateID(int nextID) {

        if (0 < nextID && nextID < 10) {

            return "D00" + String.valueOf(nextID);

        } else if (9 < nextID && nextID < 100) {

            return "D0" + String.valueOf(nextID);

        } else if (99 < nextID && nextID < 1000) {

            return "D" + String.valueOf(nextID);

        } else {

            return "D000";

        }
    }

    public double calcDishPrice(char size, double price) {

        switch (size) {

            case 'x':
                return (price * 1.2);
            case 'l':
                return price;
            case 'm':
                return (price * 0.6);
            case 's':
                return (price * 0.4);

            default:
                return price; // return price or return 0?

        }
    }

    /** Equals, determines whether this Dish is equal to another Dish */
    public boolean equals(Dish otherDish) {

        return  (this.dishName == otherDish.dishName &&
                this.size == otherDish.size && this.isSpicy == otherDish.isSpicy);
    }

    public String toString() {

        String spicyOrNot;

        if (this.isSpicy) {
            spicyOrNot = "Spicy";
        } else {
            spicyOrNot = "Not Spicy";
        }

        return "Dish ID         : " + this.dishID + "\n" +
                "Dish Name       : " + this.dishName + "\n" +
                "Dish Size       : " + this.size + "\n" +
                "Dish Price      : " + "$" + this.price + "\n" +
                "Spicy           : " + spicyOrNot;
    }

    /** Getters */

    public String getID() {

        return dishID;
    }

    public String getDishName() {

        return dishName;
    }

    public char getSize() {

        return size;
    }

    public double getPrice() {

        return price;
    }

    public boolean getIsSpicy() {

        return isSpicy;
    }

    /** Setters */

    public void setDishName(String newDishName) {

        dishName = newDishName;
    }

    public void setSize(char newSize) {

        size = newSize;
    }

    public void setPrice(double newPrice) {

        price = newPrice;
    }

    public void setIsSpicy(boolean newIsSpicy) {

        isSpicy = newIsSpicy;
    }

}