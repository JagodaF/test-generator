import java.util.List;

public class Student extends Guest {
    String studentNumber;
    University university;
    List<Test> tests;

    public Student(String name, String surname, String email, String password, String studentNumber, University university, List<Test> tests) {
        super(name, surname, email, password);
        this.studentNumber = studentNumber;
        this.university = university;
        this.tests = tests;

    }
    public Student(String name, String surname, String email, String password, String studentNumber, University university) {
        super(name, surname, email, password);
        this.studentNumber = studentNumber;
        this.university = university;
    }
    public Student(String name, String surname, String email, String password) {
        super(name, surname, email, password);
    }

    void ChooseUniversity(String universityName) {
    }

    static void ChooseSubject(String subjectName) {
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }
}
