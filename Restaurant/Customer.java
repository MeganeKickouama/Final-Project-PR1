package Restaurant;

/** @author Mégane Kickouama @2176328 */

public class Customer {

    /** Data members */
    private static int nextID;

    private String customerID;
    private String name;
    private int vipLevel; // can be 0, 1, 2 or 3
    private int points; // n of points

    /** Default constructor */
    public Customer() {

        nextID++;
        customerID = generateID(nextID);
        name = "";
        vipLevel = 0;
        points = 0;
    }

    /** Overloaded constructor */
    public Customer(String setName, int setVipLevel, int setpoints) {

        nextID++;
        customerID = generateID(nextID);
        name = setName;
        vipLevel = setVipLevel;
        points = setpoints;
    }

    /** Copy constructor, except ID (stays unique) */
    public Customer(Customer otherCustomer) {

        nextID++;
        customerID = generateID(nextID);
        name = otherCustomer.name;
        vipLevel = otherCustomer.vipLevel;
        points = otherCustomer.points;
    }

    /** Creates a String format for the ID, starting with "C" */
    public String generateID(int nextID) { 

        if (0 < nextID && nextID < 10) { // if ID is 1 digit, add 2 zeros

            return "C00" + String.valueOf(nextID);

        } else if (9 < nextID && nextID < 100) { // if ID is 2 digits, add 1 zeros

            return "C0" + String.valueOf(nextID);

        } else if (99 < nextID && nextID < 1000) { // if ID is 3 digits, add nothing

            return "C" + String.valueOf(nextID);

        } else {
            
            return "";
        }
    }

    /** Determines wether the VIP Level can be updated or not. */
    public boolean updateVip() {

        if (points > 50 && vipLevel == 0) {

            return true;

        } else if (points > 80 && vipLevel == 1) {

            return true;

        } else if (points > 100 && vipLevel == 2) {

            return true;

        } else {

            return false;
        }

    }
    /** If this Customer equal to this other Customer? if so, return true. */
    public boolean equals(Customer otherCustomer) {

        return (this.name == otherCustomer.name && this.vipLevel == otherCustomer.vipLevel && this.points == otherCustomer.points);
        
    }

    /** String format for a Customer */
    @Override
    public String toString() {

        return "Customer ID :" + customerID + "\n" +
               "Name : " + name + "\n" +
               "Vip Level : " + vipLevel + "\n" +
               "pointss : " + points;
    }

    /** Getters */
    public String getCustomerID() {

        return customerID;
    }

    public String getName() {

        return name;
    }

    public int getVipLevel() {

        return vipLevel;
    }

    public int getpoints() {
         
        return points;
    }

    /** Setters */
    public void setName(String newName) {

        this.name = newName;
    }

    public void setVipLevel(int newVipLevel) {

        this.vipLevel = newVipLevel;
    }

    public void setpoints(int newpoints) {

        this.points = newpoints;
    }
}
