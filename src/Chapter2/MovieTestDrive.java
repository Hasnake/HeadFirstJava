package Chapter2;

import Chapter2.Movie;

/**
 * Created by hasnake on 4/19/18.
 */
public class MovieTestDrive {
    public static void main(String[] args){
        Movie one=new Movie();
        one.title="Gone with the stock";
        one.genre="Tragic";
        one.rating=-2;
        one.playIt();
        Movie two=new Movie();
        two.title="Lost in cubicle Space";
        two.genre="Comedy";
        two.rating=5;
        two.playIt();
        Movie three=new Movie();
        three.title="Byte club";
        three.genre="Tragic but ultimately uplifiting";
        three.rating=127;
        three.playIt();
    }
}
