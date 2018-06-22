package Methods_Basic_concepts;

public class gradeMethods {
    public static void main(String[] args)
    {
        grade(98);//return is not necessary for void method
        gradeLetter(76);//for returning results need sout.
    }

    public static void grade(double mark) {

        if (mark > 90) {
            System.out.println("A");
        } else if (mark > 85) {
            System.out.println("B");
        } else if (mark > 70) {
            System.out.println("C");
        } else if (mark > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
    public static String gradeLetter(double mark) {
        String grade;
        if (mark > 90) {
            System.out.println(grade="A");
        } else if (mark > 85) {
            System.out.println(grade="B");
        } else if (mark > 70) {
            System.out.println(grade="C");
        } else if (mark > 60) {
            System.out.println(grade="D");
        } else {
            System.out.println(grade="F");
        }
        return grade;
    }
}


/*


Built-in:  Build-in methods are part of the compiler package, such as System.out.println( ) and  System.exit(0).
User-defined: User-defined methods are created by you, the programmer. These methods take-on names that you assign to them and perform tasks that you create.
Method Declaration

In general, method declarations has six components :

Modifier-: Defines access type of the method i.e. from where it can be accessed in your application. In Java, there 4 type of the access specifiers.
    A.public: accessible in all class in your application.
    B.protected: accessible within the class in which it is defined and in its subclass(es)
    C.private: accessible only within the class in which it is defined.
    D.Default (declared/defined without using any modifier) : accessible within same class and package within which its class is defined.
The return type : The data type of the value returned by the the method or void if does not return a value.
Method Name : the rules for field names apply to method names as well, but the convention is a little different.
Parameter list : Comma separated list of the input parameters are defined, preceded with their data type, within the enclosed parenthesis. If there are no parameters, you must use empty parentheses ().
Exception list : The exceptions you expect by the method can throw, you can specify these exception(s).
Method body : it is enclosed between braces. The code you need to be executed to perform your intended operations.
*/
