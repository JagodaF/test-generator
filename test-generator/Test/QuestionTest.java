import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {
    Question question = new Open("sd","100","123123",QuestionStatus.PENDING);


    @Test
    void getQuestionId() {
        assertEquals(question.getQuestionId(),"sd");
    }

    @Test
    void setQuestionId() {
        question.setQuestionId("newID");
        assertEquals(question.getQuestionId(),"newID");
    }

    @Test
    void getContent() {        assertEquals(question.getContent(),"100");

    }

    @Test
    void setContent() {
        question.setContent("newco");
        assertEquals(question.getContent(),"newco");
    }

    @Test
    void getCorrectAnswer() {        assertEquals(question.getCorrectAnswer(),"123123");

    }

    @Test
    void setCorrectAnswer() {
        question.setCorrectAnswer("ans");
        assertEquals(question.getCorrectAnswer(),"ans");
    }

    @Test
    void getStatus() {assertEquals(question.getQuestionId(),"sd");

    }

    @Test
    void setStatus() {
        question.setStatus(QuestionStatus.REJECTED);
        assertEquals(question.getStatus(),QuestionStatus.REJECTED);
    }

}