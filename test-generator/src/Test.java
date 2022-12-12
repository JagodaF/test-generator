import java.util.List;

public class Test {
    String name;
    Integer allowedTime;
    List<Question> questions;
    Result result;

    public Test(String name, Integer allowedTime, List<Question> questions, Result result) {
        this.name = name;
        this.allowedTime = allowedTime;
        this.questions = questions;
        this.result = result;
    }

    void StartTest() {
    }

    void FinishTest() {
    }

    static void TakeTest(String testName) {
    }

    static void ViewTestResults(String testName) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAllowedTime() {
        return allowedTime;
    }

    public void setAllowedTime(Integer allowedTime) {
        this.allowedTime = allowedTime;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
