public class Customer {
    String name;
    String size;
    private Clothing [] items;


    public void setSize (int measurement){
        switch (measurement){
            case 1, 2, 3:
                size = "S";
                break;
            case 4, 5, 6:
                size = "M";
                break;
            case 7, 8, 9:
                size = "L";
                break;
            default:
                size = "X";
        }
    }

    public String getName(){
        return name;
    }
    public String getSize(){
        return size;
    }

    public void addItems(Clothing [] tmpItemps) {
         items = tmpItemps;
    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost (){
        double total = 0 ;
        for (Clothing item: items){
            total = total + item.getPrice();

        }
        return total;
    }
}
