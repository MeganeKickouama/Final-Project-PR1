package Restaurant;

/** @author Mégane Kickouama @2176328 */

public class Customer {
    
    private String customerID;
    private String name;
    private int vipLevel;
    private int point;

    private static int nextID;

    public Customer() {

        nextID++;
        customerID = generateID(nextID);

    }

    public Customer(String setName, int setVipLevel, int setPoint) {

        nextID++;
        customerID = generateID(nextID);
        name = setName;
        vipLevel = setVipLevel;
        point = setPoint;
    }

    // copy contructor

    public String generateID(int nextID) { // private, bad call?

        if (0 < nextID && nextID < 10) {

            return "C00" + String.valueOf(nextID);

        } else if (9 < nextID && nextID < 100) {

            return "C0" + String.valueOf(nextID);

        } else if (99 < nextID && nextID < 1000) {

            return "C" + String.valueOf(nextID);

        } else {
            
            return "C000";

        }
    }

    public boolean equals(Customer otheCustomer) {

        
    }

    public String toString() {

        return "Customer ID :" + customerID + "\n" +
               "Name : " + name + "\n" +
               "Vip Level : " + vipLevel + "\n" +
               "Points : " + point;
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

    public int getPoint() {
         
        return point;
    }

    /** Setters */

    public void setCustomerID() {

        // ? static ?
    }

    public void setName(String setName) {

        this.name = setName;
    }

    public void setVipLevel(int setVipLevel) {

        this.vipLevel = setVipLevel;
    }

    public void setPoint(int setPoint) {

        this.point = setPoint;
    }
}
