import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    Result result = new Result(12,123,1234);
    @Test
    void getCorrectAnswersCount() {
        assertEquals(result.getCorrectAnswersCount(),12);
    }

    @Test
    void setCorrectAnswersCount() {
        result.setCorrectAnswersCount(999);
        assertEquals(result.getCorrectAnswersCount(),999);
    }

    @Test
    void getIncorrectAnswersCount() {
        assertEquals(result.getIncorrectAnswersCount(),123);
    }

    @Test
    void setIncorrectAnswersCount() {
        result.setIncorrectAnswersCount(111);
        assertEquals(result.getIncorrectAnswersCount(),111);
    }

    @Test
    void getTotalScore() {
        assertEquals(result.getTotalScore(),1234);

    }

    @Test
    void setTotalScore() {
        result.setTotalScore(987);
        assertEquals(result.getTotalScore(),987);
    }
}