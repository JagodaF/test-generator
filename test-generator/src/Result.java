public class Result {
    Integer correctAnswersCount;
    Integer incorrectAnswersCount;
    Integer totalScore;

    public Result(Integer correctAnswersCount, Integer incorrectAnswersCount, Integer totalScore) {
        this.correctAnswersCount = correctAnswersCount;
        this.incorrectAnswersCount = incorrectAnswersCount;
        this.totalScore = totalScore;
    }

    public Integer getCorrectAnswersCount() {
        return correctAnswersCount;
    }

    public void setCorrectAnswersCount(Integer correctAnswersCount) {
        this.correctAnswersCount = correctAnswersCount;
    }

    public Integer getIncorrectAnswersCount() {
        return incorrectAnswersCount;
    }

    public void setIncorrectAnswersCount(Integer incorrectAnswersCount) {
        this.incorrectAnswersCount = incorrectAnswersCount;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }
}
