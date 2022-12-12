import java.util.List;

public class Teacher extends Student {
    public Teacher(String name, String surname, String email, String password) {
        super(name, surname, email, password);
    }

    public Teacher(String name, String surname, String email, String password, String studentNumber, University university, List<Test> tests) {
        super(name, surname, email, password, studentNumber, university, tests);
    }

    void ApproveQuestion(String questionId) {
    }

    void RejectQuestion(String questionId) {
    }

    void EditQuestion(String questionId) {
    }

    void ViewSubmittedQuestions() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "studentNumber='" + studentNumber + '\'' +
                ", university=" + university +
                ", tests=" + tests +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
