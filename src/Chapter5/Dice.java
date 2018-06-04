package Chapter5;

public class Dice {
    public static void main(String[] args){
        int random = (int )(Math.random() * 6 + 1);
        System.out.println(random);
        int [] dice1 = new int[] { 1, 2, 3, 4,5,6 };
        int [] dice2 = new int[] { 1, 2, 3, 4,5,6 };
        int [] dice3 = new int[] { 1, 2, 3, 4,5,6 };

        for (int i : dice1) {
            //            System.out.println(i);
        }
    }
}
