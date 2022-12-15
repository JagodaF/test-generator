public abstract class Question {
    String questionId;
    String content;
    String correctAnswer;
    QuestionStatus status;
    Question parent;
    public Question(String questionId, String content, String correctAnswer, QuestionStatus status) {
        this.questionId = questionId;
        this.content = content;
        this.correctAnswer = correctAnswer;
        this.status = status;

    }
    public Question(String questionId, String content, String correctAnswer, QuestionStatus status, Question parent) {
        this.questionId = questionId;
        this.content = content;
        this.correctAnswer = correctAnswer;
        this.status = status;
        this.parent = parent;
    }

    static void ViewQuestion(String questionId) {
    }

    static void AddQuestion(Question question) {
    }

    static void EditQuestion(String questionId) {
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public QuestionStatus getStatus() {
        return status;
    }

    public void setStatus(QuestionStatus status) {
        this.status = status;
    }

    public Question getParent() {
        return parent;
    }

    public void setParent(Question parent) {
        this.parent = parent;
    }
}

