package Chapter3;

/**
 * Created by hasnake on 5/15/18.
 */
public class StudentTestDrive {
    public static void main(String[] args) {
        //Refer page 36.//The TestDrive class has the main() method and its sole purpose is to create objects of your new type.
        // And then use the dot operator to access the methods and variables of the new object.
        int x = 0;
        Student st  = new Student();
        while (x < 5) {

            st.grade(st.examScore[x]);
            System.out.println(st.name[x] + " " + st.examScore[x] + " "+st.gradeLetter);
            x++;
        }

    }
}

//Main class:Instant variables and the methods
//TestDrive :has the main method and the output.
//Student  St[x] = new Student