import java.util.List;

public class MultipleChoice extends Question {
    List<String> choices;

    public MultipleChoice(String questionId, String content, String correctAnswer, QuestionStatus status, Question parent, List<String> choices) {
        super(questionId, content, correctAnswer, status, parent);
        this.choices = choices;
    }

    public MultipleChoice(String questionId, String content, String correctAnswer, QuestionStatus status, Question parent) {
        super(questionId, content, correctAnswer, status, parent);

    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }
}