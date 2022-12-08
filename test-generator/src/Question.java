public abstract class Question {
    String questionId;
    String content;
    String correctAnswer;
    QuestionStatus status;
    Question parent;

    static void ViewQuestion(String questionId) {
    }

    static void AddQuestion(Question question) {
    }

    static void EditQuestion(String questionId) {
    }
}

