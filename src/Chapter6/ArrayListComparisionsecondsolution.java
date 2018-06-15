package Chapter6;
import java.util.ArrayList;
public class ArrayListComparisionsecondsolution {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        for (String e : c1) {
            if (c2.contains(e)) {
                System.out.println(e + " " + "from c1 is conatined in c2");
            }else {
                System.out.println(e + " " + "from c1 isnot conatined in c2");
            }
        }

    }
}
