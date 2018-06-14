package Chapter5;

public class CastingandParsing {
    public static void main(String[] args){

//parse string to int
    String line = "7";
    int a = Integer.parseInt(line);
    System.out.println(a);

    //parse int to string

        Integer num = 7;
        System.out.println(num.toString());

        //Casting
        // All casting really means is taking an Object of one particular type and “turning it into” another Object type.
        // This process is called casting a variable.
        // This topic is not specific to Java, as many other programming languages support casting of their variable types.
        double calculatedMark = 87.6;
        int finalGrade = (int)calculatedMark;
        System.out.println(finalGrade);

}
}