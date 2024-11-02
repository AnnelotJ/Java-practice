public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0;

        System.out.println("Welcome to Duke Choice Shop");
        Customer c1 = new Customer();
        c1.name = "pinky";
        int measurement = 3;
        c1.setSize(measurement);

        System.out.println(c1.size);

        System.out.println("Customer is " +c1.name);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);

        item2.setSize("S");
        item2.setDescription("Orange T-shirt");
        item2.setPrice(10.5);

        item3.setSize("S");
        item3.setDescription("Green Scarf");
        item3.setPrice(5.0);

        item4.setSize("S");
        item4.setDescription("Blue T-shirt");
        item4.setPrice(10.5);


        Clothing [] items = {item1,item2, item3, item4};

//         test cases for exercise 5.1 and 5.2
        item1.setSize("l");
        item1.setPrice(15);
        item2.setPrice(5);

        for (Clothing item: items){
            if (c1.size == item.getSize()){
                total = total + item.getPrice();
                System.out.println("Item," + item.getDescription() + "," + item.getPrice() + "," + item.getSize());
                total = total + total * tax;
                if (total >15){break;}
            }

        }

        System.out.println("Total: " + total);
    }
}
