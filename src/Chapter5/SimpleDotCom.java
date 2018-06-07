package Chapter5;

public class SimpleDotCom {
    int [] locationcells;
    int numOfHits=0;

    public void setLocationcells(int[] locs) {
        locationcells = locs;
    }
    public String checkYourself(String stringGuess) {

        int guess=Integer.parseInt(stringGuess);
        String result="miss";
        for(int cell :locationcells){
            if (guess==cell){
                result="hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits==locationcells.length){
            result="Kill";
        }
        System.out.println(result);
        return result;
    }
}
