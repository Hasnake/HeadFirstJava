package Chapter6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class complexdice {
    public static void main(String[] args) {
        int[] random3 = new int[5];
        int x = 0;
        int y = 1;
        int z =1;
        int v=1;
        int k = x + 4;
        int count=0;


        //In the Java programming language, arrays are objects,are dynamically created,
        // and may be assigned to variables of type Object.
        for (int i = 0; i < random3.length; i++) {
            random3[i] = (int) ((Math.random() * 6) + 1);

        }
        //System.out.println("Here are the five dice turn values " + random3[0] + "," + random3[1] + "," + random3[2] + "," + random3[3] + "," + random3[4]);
        int[] myIntArray = {random3[0],random3[1],random3[2],random3[3],random3[4]};
        System.out.println(Arrays.toString(myIntArray));


        if (myIntArray[x] == myIntArray[y] && myIntArray[x] == myIntArray[z] && myIntArray[x] == myIntArray[v]) {
            System.out.println("Yathez");
        } else if (myIntArray[x] == myIntArray[z] && myIntArray[z] == myIntArray[k] )
        {
                System.out.println("you get a pair");
        } else if (myIntArray[x] + 1 == myIntArray[x+1] && myIntArray[x] + 2 == myIntArray[2] && myIntArray[2] + 1 == myIntArray[3] && myIntArray[3] + 1 == myIntArray[4])
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



      //  if (random3[x] + 1 == random3[x+1] && random3[1] + 1 == random3[2] && random3[2] + 1 == random3[3] && random3[3] + 1 == random3[4]) {
//if (random3[x] + 1 == random3[x+1] && random3[x] + 2 == random3[2] && random3[2] + 1 == random3[3] && random3[3] + 1 == random3[4]) {
//                System.out.println("Straight!"); }
//int [] numbers = {random3[0],random3[1],random3[2],random3[3],random3[4],random3[5]};
//            if(random3[i]==1 || random3[i]==2||random3[i]==3||random3[i]==4||random3[i]==5||random3[i]==6 ) {
//                ++count;
//                System.out.println("number of"+i+"=" + count);
//            }
//        if (myIntArray[x] == myIntArray[y]) ++count;
//        System.out.println(count);
