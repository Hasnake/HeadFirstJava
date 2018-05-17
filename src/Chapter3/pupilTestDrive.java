package Chapter3;

/**
 * Created by hasnake on 5/17/18.
 */
public class pupilTestDrive {
    public static void main(String[] args) {
        //Refer page 36.//The TestDrive class has the main() method and its sole purpose is to create objects of your new type.
        // And then use the dot operator to access the methods and variables of the new object.
        Student st  = new Student();

        for (int x = 0;x < 5; x++)
        {
            st.grade(st.examScore[x]);//calling the method
            System.out.println(st.name[x] + " " + st.examScore[x] + " " + st.gradeLetter);
        }
    }
}
