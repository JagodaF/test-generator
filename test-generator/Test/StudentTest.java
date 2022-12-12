import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Subject subject = new Subject();
    List<Subject> subjects = new ArrayList<>();
    Question question = new Open("sd","100","123123",QuestionStatus.PENDING);
    Result result = new Result(12,380,500);
    List<Question> questions = new ArrayList<>();

    University university = new University("PJATK","dunno","+48111",subjects);
    Student student = new Student("Ahmet", " Duzduran","blabla@gmail.com","12345");



    @Test
    void getStudentNumber() {
        assertEquals(student.getStudentNumber(),"123123");
    }

    @Test
    void setStudentNumber() {

    }

    @Test
    void getUniversity() {
        assertEquals(student.getUniversity(),"123123");

    }

    @Test
    void setUniversity() {
    }

    @Test
    void getTests() {
        assertEquals(student.getStudentNumber(),"123123");

    }

    @Test
    void setTests() {
    }
}