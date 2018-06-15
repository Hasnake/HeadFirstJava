package Chapter6;
import java.util.ArrayList;
//Create two array lists
//   * ArrayList<String> c1= new ArrayList<String>(); c1.add("Red"); c1.add("Green"); c1.add("Black"); c1.add("White"); c1.add("Pink");
//   *  ArrayList<String> c2= new ArrayList<String>(); c2.add("Red"); c2.add("Green"); c2.add("Black"); c2.add("Pink");
//   * Create a comparison that looks at each color/element in the first list to see if it exists in the 2nd list
//   * Output your answer for each color to the command line
//       * Red from c1 is contained in c2……etc
public class ArrayListComparision {
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

        //Storing the comparison output in ArrayList<String>
        //ArrayList<String> c3 = new ArrayList<String>();
        for (String e : c1) {
            //c3.add(c2.contains(e) ? e +" "+"from c1 is conatined in c2" :  e +" "+"from c1 isnot conatined in c2");
            if (c2.contains(e)) {
                System.out.println(e + " " + "from c1 is conatined in c2");
            }else {
                System.out.println(e + " " + "from c1 isnot conatined in c2");
            }
            //System.out.println(c3);

        }

    }
}
