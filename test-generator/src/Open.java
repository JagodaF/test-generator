public class Open extends Question{
    public Open(String questionId, String content, String correctAnswer, QuestionStatus status, Question parent) {
        super(questionId, content, correctAnswer, status, parent);
    }
    public Open(String questionId, String content, String correctAnswer, QuestionStatus status) {
        super(questionId, content, correctAnswer, status);

    }
}
