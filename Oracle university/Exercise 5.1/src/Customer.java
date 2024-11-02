public class Customer {
    String name;
    String size;

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
}
