package Chapter2;

/**
 * Created by hasnake on 4/27/18.
 */

class DaysExercise {
    public static void main(String[]args ){
        String[] days = new String[7];

        days[0] = "Monday, the 1st ";
        days[1] = "Tuesday,the 2nd";
        days[2] = "Wednesday,the 3rd";
        days[3] = "Thursday,the 4th";
        days[4] = "Friday, the 5th ";
        days[5] = "Saturday,the 6th ";
        days[6] = "Sunday, the 7th";

        int[] index = new int[7];

        index[0] = 0;
        index[1] = 1;
        index[2] = 2;
        index[3] = 3;
        index[4] = 4;
        index[5] = 5;
        index[6] = 6;


        int y = 0;

        while (y < 7) {


            int ref;
            ref = index[y];
            System.out.println("It's "+ days[ref] + " day of the week.");

            y = y + 1;

        }

    }
}

