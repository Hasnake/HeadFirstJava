package Chapter5;
import java.util.Random;
//DiceRollGame as TestDrive class

public class DiceTestDrive {
    public static void main(String[] args) {
        int totalnumberofturns=3;
        int dicevalue;

        Random random=new Random();
        for(int x=0;x<totalnumberofturns;x++){
            dicevalue =random.nextInt(7-1)+1;
            System.out.println(dicevalue);

        }

    }
}


//Helpful Links:
//* https://www.geeksforgeeks.org/loops-in-java/
//* https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
//
//Homework:
//* In class example
//* Create a DiceRollGame class that holds game logic
//* Create a Dice class
//* Inside DiceRollGame create 3 Dice objects
//* Inside Dice class create a rollDice method that calculates a random number between 1 & 6
//int random3 = (int)(Math.random()*6+1);
//* Create determineWinner method
//* Inside determineWinner add the sum of the three dice together and print out to the console
//* Inside determineWinner if the three dice are the same value then print out a new statement to the console “Yahtzee!"
//* BONUS: Incorporate an array for the values of the dice 1-6 and use a For or enhanced For loop to determine 3 random values instead.