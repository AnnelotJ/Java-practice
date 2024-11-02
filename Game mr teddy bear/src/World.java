import java.util.ArrayList;

public class World {

    public ArrayList<Bot> bots;

    public World(){
        System.out.println("Welcome to my world");

        Bot mrTeddyBear = new Bot("mrTeddyBear", 100);
        Bot pookie = new Bot("pookie", 100);

        this.bots = new ArrayList<>();

        this.bots.add(mrTeddyBear);
        this.bots.add(pookie);

    }

}
