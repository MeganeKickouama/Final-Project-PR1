package Restaurant;

public class Dish{

    private String dishID;
    private String dishName;
    private char size;
    private double price;
    private boolean isSpicy;

    private static int nextID;

    public Dish() {

        nextID++;
        dishID = generateID(nextID);
    }

    public Dish(String setDishName, char setSize, double setPrice, boolean setIsSpicy) {

        nextID++;
        dishID = generateID(nextID);
        dishName = setDishName;
        size = setSize;
        price = setPrice;
        isSpicy = setIsSpicy;
    }

    //copy constructor

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

            case 'x': return (price * 1.2); 
            case 'l': return price; 
            case 'm': return (price * 0.6); 
            case 's': return (price * 0.4); 

            default: return 0;

        }
    }

    // overloaded equals

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

    //not finished 
    

    /** Setters */

}