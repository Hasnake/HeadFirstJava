package Chapter2;

import Chapter2.DVDPlayer;

/**
 * Created by hasnake on 4/19/18.
 */
public class DVDPlayerTestDrive {
    public static void main (String[] args){
        DVDPlayer d= new DVDPlayer();
        d.canRecord=true;
        d.playDVD();
        if (d.canRecord=true){
            d.recordDVD();
        }
    }
}
