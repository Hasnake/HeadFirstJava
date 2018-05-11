package Chapter3;

/**
 * Created by hasnake on 5/10/18.
 */
public class Student {

    String  name;

    public static void main(String[] args) {
        int x = 0;

        Student[] st = new Student[5];
        String [] name = {"Fred", "Sally", "Timmy", "Pat", "Phil"};
        double [] examScore = {87.9, 90.0, 12.1, 75.5, 61.8};
        char [] gradeLetter={'B','A','F','C','D'};



        while (x < 5) {

            st[x] = new Student();
            System.out.println(name[x]+" "+examScore[x]+" "+gradeLetter[x]);


            x++;
        }


    }
}