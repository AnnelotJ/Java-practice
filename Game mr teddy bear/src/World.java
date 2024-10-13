import java.util.ArrayList;
import java.util.*;
import java.util.Random;



public class World {

    public ArrayList<Bot> bots;

    public World(){

        Bot mrTeddyBear = new Bot("mrTeddyBear", 100);
        Bot pookie = new Bot("pookie", 100);

        this.bots = new ArrayList<>();

        this.bots.add(mrTeddyBear);
        this.bots.add(pookie);

        Fight fight = new Fight(bots);

    }

}
