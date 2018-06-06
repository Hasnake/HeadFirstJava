package Chapter6;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String []Args){

        // create an empty array list with an initial capacity
        ArrayList<Integer> myList = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        myList.add(15);
        myList.add(22);
        myList.add(30);
        myList.add(40);


        myList.add(2,25);// adding element 25 at third position
        myList.remove(3);//removing element index at position


        // let us print all the elements available in list
        for (Integer number : myList) {
            System.out.println("Number = " + number);

        }
        System.out.println("The size of myList array is :"+myList.size());
    }
}






//    ArrayList<Egg> myList=new ArrayList<Egg>();
//        Egg s=new Egg();
//        myList.add(s);
//        Egg b=new Egg();
//        myList.add(b);
//        int theSize=myList.size();
//        System.out.println(theSize);
//    }
//}


