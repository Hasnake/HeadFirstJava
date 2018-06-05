package Chapter5;

public class DiceRollGameHaile {

    public static void main(String[] args) {

        int[] random3 = new int[3];
        for (int i = 0; i < random3.length; i++) {
            random3[i] = (int) ((Math.random() * 6) + 1);}
            System.out.println("Here are the three dice turn values " + random3[0] + "," + random3[1] + "," + random3[2]);
            if (random3[0] == random3[1] || random3[1] == random3[2] || random3[0] == random3[2]) {
                System.out.println("you get a pair");
            }else if (random3[0] == random3[1] && random3[1] == random3[2]) {
                System.out.println("Yahtzee!");
            }else{System.out.println("You lose");}
            int sum = 0;
            for (int e : random3) sum += e;
            System.out.println("Sum of the three dice values is" + ":" + sum);
        }
}
