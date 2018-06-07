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


        myList.add(2,25);//Add: adding element 25 at third position
        myList.remove(3);//Remove:removing element index at position
        boolean isIn=myList.contains(15);//Contains:Find out if it conatins something,it returns true or false.
        boolean isempty=myList.isEmpty();//isEmpty:Find out if the list is empty or not,it returns true or false.
        int indexofmynum=myList.indexOf(22);//IndexOf:Findout the index of an object in the arrayList.



        // let us print all the elements available in list
        for (Integer number : myList) {
            System.out.println("Number = " + number);


        }
        System.out.println("The size of myList array is :"+myList.size());
        System.out.println("is my number in the list :"+isIn);
        System.out.println("is my list empty :"+isempty);
        System.out.println("index of my number in the list is :"+indexofmynum);

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


