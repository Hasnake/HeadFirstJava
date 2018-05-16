package Chapter3;

/**
 * Created by hasnake on 5/15/18.
 */
public class StudentTestDrive {
    public static void main(String[] args) {
        Student st = new Student();
        int x = 0;
        while (x < 5) {

            st.grade(st.examScore[x]);
            System.out.println(st.name[x] + " " + st.examScore[x] + " "+st.gradeLetter);
            x++;
        }

    }
}
