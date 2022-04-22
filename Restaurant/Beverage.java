package Restaurant;

public class Beverage {

    /** Data members */
    private  String beverageID;
    private String beverageName;
    private double price;
    private int volume;

    private static int beverageNextID = 0;

    public Beverage() {

        beverageNextID++;
        beverageID = generateID(beverageNextID);
    }

    public Beverage(String setBeverageName, double setPrice,
    int setVolume) {

        beverageNextID++;
        beverageID = generateID(beverageNextID);
        beverageName = setBeverageName;
        price = setPrice;
        volume = setVolume;

    }

    //copy constructor

    /** GeneratID method determines if the number is 1, 2 or 3 digits and adds a "B" and zeros accordingly */

    public static String generateID(int beverageNextID) {

        if (0 < beverageNextID && beverageNextID < 10) {

            return "B00" + String.valueOf(beverageNextID);

        } else if (9 < beverageNextID && beverageNextID < 100) {

            return "B0" + String.valueOf(beverageNextID);

        } else if (99 < beverageNextID && beverageNextID < 1000) {

            return "B" + String.valueOf(beverageNextID);

        } else {
            
            return String.valueOf(0);

        }
    }

    public double calcPrice(int volume, double price) {

        final int VOLUME_LIMIT = 500;
        if (volume <= VOLUME_LIMIT) {
            return price;
        } else {
            return (price * 0.6);
        }
    }

    //equals (overloaded?)

    public String toString() {

        return "Beverage ID        : " + this.beverageID + "\n" +
               "Beverage Name      : " + this.beverageName + "\n" +
               "Beverage Price     : " + "$" + this.price + "\n" +
               "Beverage           : " + this.volume;
    }

    /** Getters */

    public String getBeverageID() { //static?

        return beverageID;
    }

    public String getBeverageName() {

        return beverageName;
    }

    public double getPrice() {

        return price; // add 'this' to getters? or just setters?
    }

    public int getVolume() {

        return volume;
    }

    /** Setters */ // setter for ID?

    public void setBeverageID(String newBeverageID) { // static?


    }

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