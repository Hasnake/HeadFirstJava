package Chapter4;

/**
 * Created by hasnake on 5/17/18.
 */
public class TestingMethods {

    public static void main(String[] args)
    {
        TestingMethods ts = new TestingMethods();

        System.out.println("Add two numbers to"+" "+ts.add(10,2));
        System.out.println("Subtract two numbers to"+" "+ts.subtract(10,2));
        System.out.println("Multiply two numbers to"+" "+ts.multiply(10,2));
        System.out.println("Divide two numbers to"+" "+ts.divide(10,2));
    }

    public int add (int c, int d){
        int results = c + d;
        return results;
    }
    public int subtract (int c, int d){
        int results = c - d;
        return results;

    }
    public int multiply (int c, int d){
        int results = c * d;
        return results;
    }
    public int divide(int c, int d){
        int results = c / d;
        return results;
    }

}
