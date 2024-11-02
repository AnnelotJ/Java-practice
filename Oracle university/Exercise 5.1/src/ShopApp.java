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


        Clothing [] items = {item1,item2, item3, item4};

        item1.setSize("l");
        item1.setPrice(15);
        item2.setPrice(15);

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
//test