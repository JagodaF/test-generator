import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentAnswerTest {
    StudentAnswer studentAnswer = new StudentAnswer("answer");
    @Test
    void getAnswer() {
        assertEquals(studentAnswer.getAnswer(),"answer");
    }

    @Test
    void setAnswer() {
        studentAnswer.setAnswer("aaa");
        assertEquals(studentAnswer.getAnswer(),"aaa");
    }
}