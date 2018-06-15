package Chapter6;
import java.util.*;
public class complexdice {
    public static void main(String[] args) {
        int[] random5 = new int[5];
        int x = 0;

        //In the Java programming language, arrays are objects,are dynamically created,
        // and may be assigned to variables of type Object.
        for (int i = 0; i < random5.length; i++) {
            random5[i] = (int) ((Math.random() * 6) + 1);
        }
        int[] myIntArray = {random5[0], random5[1], random5[2], random5[3], random5[4]};
        System.out.println("random nubers:"+Arrays.toString(myIntArray));
        //int [] myIntArray={4,4,6,4,4};
        Arrays.sort(myIntArray, 0, 5);

        System.out.println("Ascending order:"+Arrays.toString(myIntArray));

        if (    myIntArray[0] == myIntArray[1] && myIntArray[1] == myIntArray[2] &&
                myIntArray[2] == myIntArray[3] && myIntArray[3] == myIntArray[4])

        {
            System.out.println("Yahtzee!");
        } else if (myIntArray[0] == myIntArray[1] && myIntArray[1] == myIntArray[2]&& myIntArray[2] == myIntArray[3]||
                myIntArray[1] == myIntArray[2] && myIntArray[2] == myIntArray[3]&& myIntArray[3] == myIntArray[4])
        {
            System.out.println("you get four of a kind");
        }
        else if (myIntArray[0] == myIntArray[1] && myIntArray[1] == myIntArray[2]&& myIntArray[3] == myIntArray[4]||
            myIntArray[0] == myIntArray[1] && myIntArray[2] == myIntArray[3]&& myIntArray[3] == myIntArray[4])
        {
            System.out.println("you get a full-house");
        }
        else if (myIntArray[0] == myIntArray[1] && myIntArray[1] == myIntArray[2]||

                myIntArray[1] == myIntArray[2] && myIntArray[2] == myIntArray[3]||
                myIntArray[2] == myIntArray[3] && myIntArray[3] == myIntArray[4])
        {
            System.out.println("you get three of a kind");
        }
        else if (myIntArray[0] == myIntArray[1] && myIntArray[2] == myIntArray[3]||
                myIntArray[0] == myIntArray[1] && myIntArray[3] == myIntArray[4]||
                myIntArray[1] == myIntArray[2] && myIntArray[3] == myIntArray[4])
        {
            System.out.println("you get two pairs");
        }
        else if (myIntArray[0] == myIntArray[1] || myIntArray[1] == myIntArray[2]||
                myIntArray[2] == myIntArray[3] || myIntArray[3] == myIntArray[4]) {
            System.out.println("you get a pair");
        }
        else if (myIntArray[x] + 1 == myIntArray[x+1] && myIntArray[x] + 2 == myIntArray[2] && myIntArray[2] + 1 == myIntArray[3] && myIntArray[3] + 1 == myIntArray[4])

        {
              System.out.println("Straight!");
        }
        else {
                System.out.println("You lose");
            }
            int sum = 0;
            for (int dicevalue : myIntArray) sum += dicevalue;
            System.out.println("Sum of the five dice values is" + ":" + sum);
        }
    }


//Change the number of dice to 5
//   * Detect if you have 1 pair 2 pair, or Yahtzee (5 of a kind)
//   * Output the result to the console including the dice values:  “You have one pair”,  “You have two pair”, “You have Yahtzee"
//   * Bonus - check for 3 of a kind, check for s “straight”(1,2,3,4,5,6)
// *and check for a "full-house”(1 pair plus a three of a kind)