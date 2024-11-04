public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0;

        System.out.println("Welcome to Duke Choice Shop");
        Customer c1 = new Customer("pinky", 3);


//        System.out.println(c1.size);

//        System.out.println("Customer is " + c1.name);

        Clothing item1 = new Clothing("Blue Jacket",20.9,"M" );
        Clothing item2 = new Clothing("Orange T-shirt",10.5, "S" );
        Clothing item3 = new Clothing("Green Scarf",5.0, "S" );
        Clothing item4 = new Clothing("Blue T-shir", 10.5,"S");


        Clothing [] items = {item1,item2, item3, item4};

        int measurement = 8;


        c1.addItems(items);

        System.out.println("Customer is "+ c1.getName() +"," + c1.getSize() + "," + c1.getTotalClothingCost());

        for (Clothing item : c1.getItems()) {
            System.out.println("Items " +item.getDescription());

        }

        }



}
