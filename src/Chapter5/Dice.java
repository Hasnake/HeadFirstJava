package Chapter5;
//The super class has the instance variables and the methods or logic.

public class Dice {
    public int rollDice() //rollDice method that calculates a random number between 1 & 6
    {
        int random3 = (int) (Math.random() * 6 + 1);
        return random3;
    }

    public int determineWinner(int[] randomValue)
    {

        int sum = 0;
        for (int i = 0; i < randomValue.length; i++) {
            sum += randomValue[i];

        }
        System.out.println("Here are the three dice turn values " + randomValue[0] + "," + randomValue[1] + "," + randomValue[2]);

        if (randomValue[0] == randomValue[1] && randomValue[0] == randomValue[2] && randomValue[1] == randomValue[2]) {
            System.out.println("Yatzee");

        } else if (randomValue[0] == randomValue[1] || randomValue[1] == randomValue[2] || randomValue[0] == randomValue[2]){
            System.out.println("You got pairs!");
        }
        else{System.out.println("You lose");}

        System.out.println("Sum of the three dice values is" + ":" + sum);
        return sum;
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
//int[] random3 = new int[3];//array object.
//In the Java programming language, arrays are objects,are dynamically created,
// and may be assigned to variables of type Object.