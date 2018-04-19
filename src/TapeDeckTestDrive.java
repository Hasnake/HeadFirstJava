/**
 * Created by hasnake on 4/19/18.
 */
public class TapeDeckTestDrive {
    public static void main(String[] args){
        TapeDeck t =new TapeDeck();
        t.canRecord=true;
        t.playTape();
        if (t.canRecord==true){
            t.recordTape();
        }
    }
}
