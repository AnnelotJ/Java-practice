public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0;

        System.out.println("Welcome to Duke Choice Shop");
        Customer c1 = new Customer();
        c1.name = "pinky";
        c1.size = "S";
        int measurement = 3;
        System.out.println("Customer is " +c1.name);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        item1.description = "Blue Jacket";
        item1.price = 20.9;

        item2.size = "S";
        item2.description = "Orange T-shirt";
        item2.price = 10.5;

        item3.size = "S";
        item3.description = "Green Scarf";
        item3.price = 5.0;

        item4.size = "S";
        item4.description = "Blue T-shirt";
        item4.price = 10.5;

        Clothing [] items = {item1,item2, item3, item4};

      for (Clothing item: items){
          System.out.println(item.description);
          System.out.println(item.price);
          System.out.println(item.size);
          if (c1.size == item.size){
              total = total + item.price ;
              if (total >15){break;}
          }

      }
        System.out.println(total);

        switch (measurement){
            case 1, 2, 3:
                c1.size = "S";
                break;
            case 4, 5, 6:
                c1.size = "M";
                break;
            case 7, 8, 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }
    }
}
