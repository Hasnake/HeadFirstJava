package Chapter6;

public class AdvancedTestDrive {
        public static void main(String[] args) {

            Advanced Advanced = new Advanced();
            int[] f = new int[5];
            for (int x = 0; x < 5; x++) {
                f[x] = Advanced.enhancedRollDice();
                System.out.println("Die #" + (x + 1));
            }
            Advanced.determineYahtzee(f[0], f[1], f[2], f[3], f[4]);

            //Test different rolls to verify correct result:
            //Advanced.determineYahtzee(6,1,1,1,1);



        }


    }

