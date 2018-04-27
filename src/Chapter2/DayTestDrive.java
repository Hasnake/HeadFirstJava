package Chapter2;

/**
 * Created by hasnake on 4/27/18.
 */
class DayTestDrive {
    public static void main(String[] args) {
        Day one = new Day();
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

        one.determineSuffix();
        two.determineSuffix();
        three.determineSuffix();
        four.determineSuffix();
        five.determineSuffix();
        six.determineSuffix();
        seven.determineSuffix();

    }
}
