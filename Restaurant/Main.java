package Restaurant;

/** @author Mégane Kickouama @2176328 */

public class Main {
    public static void main(String[] args) {

        Dish newDish = new Dish("Fried Chicken", 'l', 30, true);
        Dish newDish2 = new Dish("Fried Chicken", 'l', 30, true);

        System.out.println(newDish.equals(newDish2));
        System.out.println(newDish);
        System.out.println(newDish2);

        Combo combo = new Combo(newDish, new Beverage());
        System.out.println(combo);

    } 
}
