package Restaurant;

/** @author Mégane Kickouama 2176328 */

public class Beverage {

    /** Data members */ 
    private static int beverageNextID = 0;

    private String beverageID;
    private String beverageName;
    private double price;
    private int volume;

    /** Default constructor, all parameters are empty/default */
    public Beverage() {

        beverageNextID++;
        beverageID = generateID(beverageNextID);
        beverageName = "";
        price = 0;
        volume = 0;
    }

    /** Overloaded constructor */
    public Beverage(String setBeverageName, double setPrice,
    int setVolume) {

        beverageNextID++;
        beverageID = generateID(beverageNextID);
        beverageName = setBeverageName;
        price = setPrice;
        volume = setVolume;

    }

    /** Copy contructor, set every data field to other beverage's data field*/
    public Beverage(Beverage otherBeverage) {

        beverageNextID++;
        beverageID = generateID(beverageNextID);
        beverageName = otherBeverage.beverageName;
        price = otherBeverage.price;
        volume = otherBeverage.volume;
    }

    /** GeneratID method determines if the number is 1, 2 or 3 digits and adds a "B" and zeros accordingly */
    public static String generateID(int beverageNextID) {

        if (0 < beverageNextID && beverageNextID < 10) { // if ID is 1 digit, add "B" + "00"

            return "B00" + String.valueOf(beverageNextID);

        } else if (9 < beverageNextID && beverageNextID < 100) { // if ID is 2 digits, add "B" + "0"

            return "B0" + String.valueOf(beverageNextID);

        } else if (99 < beverageNextID && beverageNextID < 1000) { // if ID is 3 digits, add "B" 

            return "B" + String.valueOf(beverageNextID);

        } else { 
            
            return "";

        }
    }

    /** Facilitator method that */
    public double calcPrice() {

        final int VOLUME_LIMIT = 500;

        if (this.volume <= VOLUME_LIMIT) {
            return this.price;
        } else {
            return (this.price * 0.6);
        }
    }

    // will return true if all these conditions are met: equal beverage names, prices and volumes.
    public boolean equals(Beverage otherBeverage) { 

        return (this.beverageName == otherBeverage.beverageName && this.price == otherBeverage.price && this.volume == otherBeverage.volume);
    }

    /* String format for a Beverage */
    @Override
    public String toString() {

        return "Beverage ID        : " + this.beverageID + "\n" +
               "Beverage Name      : " + this.beverageName + "\n" +
               "Beverage Price     : " + "$" + this.price + "\n" +
               "Beverage           : " + this.volume + "\n";
    }

    /** Getters */
    public String getBeverageID() { 

        return beverageID;
    }

    public String getBeverageName() {

        return beverageName;
    }

    public double getPrice() {

        return price; 
    }

    public int getVolume() {

        return volume;
    }

    /** Setters */ 
    public void setBeverageName(String newBeverageName) {

        this.beverageName = newBeverageName;
    }

    public void setPrice(double newPrice) {

        this.price = newPrice;
    }

    public void setVolume(int newVolume) {

        this.volume = newVolume;
    }
}