public class ScoreManager {
    // TODO: validateScoreメソッドを実装
    public void validateScore(int score)throws GameScoreException{
        if(score<0){
            throw new InvalidScoreException(score);
        }

        if(score>100){
            throw new ScoreOverflowException(score);
        }
    }
}