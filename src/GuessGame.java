//import sun.security.pkcs11.P11TlsKeyMaterialGenerator;
//
//import java.security.PublicKey;

/**
 * Created by hasnake on 4/17/18.
 */
public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1=new Player();
        p2=new Player();
        p3=new Player();

        int guessp1=0;
        int guessp2=0;
        int guessp3=0;

        boolean p1isRight=false;
        boolean p2isRight=false;
        boolean p3isRight=false;

        int targetNumber = (int) (Math.random()*10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("I'm thinking of a number between 0 and 9...");

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1=p1.number;
            System.out.println("Player one guessed" +guessp1);

            guessp2=p1.number;
            System.out.println("Player one guessed" +guessp2);

            guessp3=p1.number;
            System.out.println("Player one guessed" +guessp3);

            if (guessp1==p1.number){
                p1isRight=true;
            }
            if (guessp2==targetNumber) {
                p2isRight=true;
            }
            if (guessp3==targetNumber) {

            }
            if (p1isRight || p2isRight || p3isRight){
                System.out.println("We have a winner");
                System.out.println("Player one got it right?"+p1isRight);
                System.out.println("Player two got it right?"+p1isRight);
                System.out.println("Player three got it right?"+p1isRight);
                System.out.println("Game is over.");
                break;
            }else {
                System.out.println("Player will have to try again");
            }
        }
    }
}
