/**
 * Created by phili on 7/19/2017.
 */
public class Main {

    public static void main (String[] args){

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 4;
        int bonus = 500;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.printf("Your final score is %d\n", finalScore);
        }

        //score set to 10,000
        //levelCompleted = 8
        //bonus is 200
        //first printout above must display too

        int newScore = 10_000;
        int newLevelCopmleted = 8;
        int newBonus = 200;

        if (gameOver){
            int finalscore = newScore + (newLevelCopmleted * newBonus);
            System.out.printf("Your final score is %d\n", finalscore);
        }
    }
}
