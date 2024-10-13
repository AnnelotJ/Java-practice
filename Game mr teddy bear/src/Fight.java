import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;
import java.util.Random;

import static java.lang.Math.random;
import static java.lang.Math.round;


public class Fight {

    public ArrayList<Bot> participants;

    public Fight (ArrayList<Bot> participants){
        this.participants = participants;

        for(int i=0; i<30; i++){
            Round(i);
        }
    }



    public void Round (int roundNum){
        int min = 0;  // lower bound (inclusive)
        int max = 1;  // upper bound (exclusive)

        int randomNumber = (int)Math.round(Math.random());
        int attackNum = (int)(random() * (3 - 0)) + 0;

        System.out.println(this.participants.get(randomNumber).getName() + " is attacking");

        if (randomNumber == 1) {
            this.participants.get(0).health = this.participants.get(randomNumber).getHealth() - this.participants.get(randomNumber).attacks.get(attackNum);
            System.out.println(this.participants.get(1).name + " has " + this.participants.get(1).health + " health left");
            System.out.println(this.participants.get(0).name + " has " + this.participants.get(0).health + " health left");
            System.out.println("------------------------------------------------------------------------------------------");
        }
        else {
            this.participants.get(1).health = this.participants.get(randomNumber).getHealth() - this.participants.get(randomNumber).attacks.get(attackNum);
            System.out.println(this.participants.get(1).name + " has " + this.participants.get(1).health + " health left");
            System.out.println(this.participants.get(0).name + " has " + this.participants.get(0).health + " health left");
            System.out.println("------------------------------------------------------------------------------------------");
        }

//        this.participants.get(randomNumber) = this.participants.get(randomNumber).getHealth() - this.participants.get(randomNumber).attacks.get(attackNum);


        roundNum++;

    }

}
