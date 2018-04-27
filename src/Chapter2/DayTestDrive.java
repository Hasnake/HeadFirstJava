package Chapter2;

/**
 * Created by hasnake on 4/27/18.
 */
class DayTestDrive {
    public static void main(String[] args) {
        //1.Create seven instances a Day object SAMPLE: Day three = new Day();
        Day one = new Day();
        //2. Assign numerical value to each day of the week SAMPLE: three.dayNum = 3;
        one.dayNum = 1;
        Day two = new Day();
        two.dayNum = 2;
        Day three = new Day();
        three.dayNum = 3;
        Day four = new Day();
        four.dayNum = 4;
        Day five = new Day();
        five.dayNum = 5;
        Day six = new Day();
        six.dayNum = 6;
        Day seven = new Day();
        seven.dayNum = 7;

       // 3.) Create method using if & else conditionals to determine what each day’s suffix is (ie. 1st, 7th) SAMPLE: six.determineSuffix();
        one.determineSuffix();
        two.determineSuffix();
        three.determineSuffix();
        four.determineSuffix();
        five.determineSuffix();
        six.determineSuffix();
        seven.determineSuffix();

    }
}
