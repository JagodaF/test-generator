import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Guest guest = new Guest("Ahmet", " Duzduran","blabla@gmail.com","12345");



        Question question = new Open("sd","100","123123",QuestionStatus.PENDING);
        Result result = new Result(12,380,500);
        List<Question> questions = new ArrayList<>();
        Test test = new Test("sd",12,questions,result);


        System.out.println(guest.getName());
        guest.setName("Diyorbek");
        System.out.println(guest.getName());
    }
}
