package Chapter5;

public class DiceRollGameHaile {

    public static void main(String[] args) {

        int[] random3 = new int[3];//array object.
        //In the Java programming language, arrays are objects,are dynamically created,
        // and may be assigned to variables of type Object.
        for (int i = 0; i < random3.length; i++) {
            random3[i] = (int) ((Math.random() * 6) + 1);}
            System.out.println("Here are the three dice turn values " + random3[0] + "," + random3[1] + "," + random3[2]);
           if (random3[0] == random3[1] && random3[1] == random3[2]) {
            System.out.println("Yahtzee!");}
            else if  (random3[0] == random3[1] || random3[1] == random3[2] || random3[0] == random3[2]) {
                System.out.println("you get a pair");
            }
            else{System.out.println("You lose");}
            int sum = 0;
            for (int dicevalue : random3) sum += dicevalue;
            System.out.println("Sum of the three dice values is" + ":" + sum);
        }
}

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