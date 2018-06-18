package Basic_concepts;

public class StudyMethods

{
    //main method
    //What does the keyword static mean in the declaration of the main method?
    //The method can be called without creating an instance.
    public static void main(String[] args)
    {

        methodRankPoints(255.7);  //calling a void method
        int d=0;
        int a = 11;
        int b = 6;
        int c = minFunction(a, b);//calling the method that returns value.
        System.out.println("Minimum Value = " + c);
        System.out.println("Random Number:"+random(6));
        addAndSub(5,3);//calling a void method
        System.out.println();
        fahToCent(98.6);//calling a void method
        centToFah(37.0);
        System.out.println();
        System.out.println(total(45));

    }
    public static void addAndSub(int x, int y)
    {

        System.out.println("Addition of the two values:"+(x+y));
        System.out.println("Subtraction of the two values:"+(x-y));
    }


    /**
     * returns the minimum of two numbers
     */
    public static void centToFah(double degreecent)
    {

        System.out.println("degree Fahrenheit:"+((9*degreecent/5)+32));

    }
    public static void fahToCent(double degreeFa)
    {

        System.out.println(("degree Centigrade:"+0.5556*(degreeFa-32)));

    }
    public static int minFunction(int n1, int n2)
    {

        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }
    public static int total(int aNumber)
    {
        int a_Value=aNumber+10;
        return a_Value;
    }


    public static void methodRankPoints(double points)
    {
        if (points >= 202.5) {
            System.out.println("Rank:A1");
        } else if (points >= 122.4) {
            System.out.println("Rank:A2");
        } else {

            System.out.println("Rank:A3");
        }
    }
    public static int random(int maxRange)
    {
       int randomnumber;
       randomnumber=(int) ((Math.random() * maxRange) + 1);
       return randomnumber;
    }
}

//A Java method is a collection of statements that are grouped together to perform an operation.
// When you call the System.out.println() method, for example, the system actually executes several statements in order to display a message on the console.
//Now you will learn how to create your own methods with or without return values, invoke a method with or without parameters, and apply method abstraction in the program design.
//Syntax **public static int methodName(int a, int b) {body}**


//public static ---------------is a  modifier It defines the access type of the method and it is optional to use.
//int/void..................... is return type
//methodName/main −--------------- name of the method
//a, b −--------------------- formal parameters
//int a, int b −------------- list of parameters