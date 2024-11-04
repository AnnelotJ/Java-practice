public class Clothing {
    private String size ;
    private String description;
    private double price;
    private final double minimumPrice = 10;
    private final double tax = 0.2;

    public Clothing (String description, double price, String size){
        this.description = description;
        this.price = price;
        this.size = size;

    }

    public String getSize (){
        return size;
    }
    public String getDescription (){
        return description;
    }

    public double getPrice (){
        return price + price * tax;
    }

    public void setSize (String newSize){
        size = newSize;
    }

    public void setDescription (String newDescription){
        description = newDescription;
    }

    public void setPrice (double newPrice){
        if (newPrice < minimumPrice){
            this.price = 10;
        }
        else{
            price = newPrice;
        }
    }
}
