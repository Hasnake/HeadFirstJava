package Chapter5;
//importing scanner

import java.util.Scanner;

public class SimpleDotComTestDrive {
    public static void main(String[] args){
        SimpleDotCom dot =new SimpleDotCom();
        int [] locations={2,3,4};
        dot.setLocationcells(locations);
        //String userGuess="2";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your guess:");
        String userGuess=sc.next();
        String result=dot.checkYourself(userGuess);
    }
}
