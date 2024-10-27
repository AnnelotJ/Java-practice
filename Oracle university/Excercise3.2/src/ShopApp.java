package duke.choice;


import duke.choice.Clothing;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;
        double total;

        System.out.println("Welcome to Duke Choice Shop");
        Customer c1 = new Customer();
        c1.name = "pinky";
        System.out.println("Customer is " +c1.name);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        item1.description = "Blue Jacket";
        item1.price = 20.9;

        item2.size = "S";
        item2.description = "Orange T-shirt";
        item2.price = 10.5;

        System.out.println("Item 1 Description: " + item1.description + ", Size: " + item1.size + ", Price: " + item1.price);
        System.out.println("Item 2 Description: " + item2.description + ", Size: " + item2.size + ", Price: " + item2.price);

        total =  2 * (tax * item2.price + item2.price) + tax * item1.price + item1.price ;

        System.out.println("The total price for all the items will be: " +total);
    }
}
