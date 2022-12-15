import java.util.HashMap;
import java.util.List;

public class Subject {
    String name;
    String description;
    HashMap<String, Test> tests;
    List<Question> questions;

    public Subject() {



    }

    public Subject(String name, String description, HashMap<String, Test> tests, List<Question> questions) {
        this.name = name;
        this.description = description;
        this.tests = tests;
        this.questions = questions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashMap<String, Test> getTests() {
        return tests;
    }

    public void setTests(HashMap<String, Test> tests) {
        this.tests = tests;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
