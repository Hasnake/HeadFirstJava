package Chapter5;

//The TestDrive class has the main() method and its sole purpose is to create objects of your new type.
// And then use the dot operator to access the methods and variables of the new object.

public class DiceRollGame {

    public static void main(String[] args)
    {

        Dice[] myDice = new Dice[3];

        myDice[0] = new Dice();
        myDice[1] = new Dice();
        myDice[2] = new Dice();


        int[] dicevalue = new int[3];


        for (int i = 0; i < myDice.length; i++) {
            dicevalue[i] = myDice[i].rollDice();
        }

        Dice d = new Dice();
        d.determineWinner(dicevalue);

    }
}

//Homework:
//* Create a DiceRollGame class that holds game logic
//* Create a Dice class
//* Inside DiceRollGame create 3 Dice objects
//* Inside Dice class create a rollDice method that calculates a random number between 1 & 6
//int random3 = (int)(Math.random()*6+1);
//* Create determineWinner method
//* Inside determineWinner add the sum of the three dice together and print out to the console
//* Inside determineWinner if the three dice are the same value then print out a new statement to the console “Yahtzee!"
//* BONUS: Incorporate an array for the values of the dice 1-6 and use a For or enhanced For loop to determine 3 random values instead.