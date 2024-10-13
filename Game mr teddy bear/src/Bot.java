import java.security.PublicKey;
import java.util.ArrayList;

public class Bot {

    public String name;
    public int health;

    public ArrayList<Integer> attacks;

    public Bot(String name, int health) {
        this.name = name;
        this.health = health;
        this.attacks = new ArrayList<>();
        Attack();

    }


    public void Attack (){
        int bodyshot = 1;
        int headshot = 8;
        int zeus = 10;
        int knife = 10;

        attacks.add(bodyshot);
        attacks.add(headshot);
        attacks.add(zeus);
        attacks.add(knife);


    }
    public int getHealth (){
        return this.health;
    }

    public String getName(){
        return this.name;
    }


}
