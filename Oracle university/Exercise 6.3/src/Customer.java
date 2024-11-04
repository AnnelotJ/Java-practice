public class Customer {
    private int measurement;
    String name;
    String size;
    private Clothing [] items;

    public Customer(String name, int measurement){
        this.name = name;
        this.measurement = measurement;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setItems(Clothing[] items) {
        this.items = items;
    }

    public int getMeasurement() {
        return measurement;
    }

    public void setMeasurement(int measurement){
        this.measurement = measurement;
    }

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
                size = "XL";
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
