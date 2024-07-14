package WordStatistics.dogyearsconverter;


import com.example.demo_back.service.WordStatisticsService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordStatisticsServiceTest {

    private final WordStatisticsService wordStatisticsService = new WordStatisticsService();

    @Test
    public void testGetAverageWordLength_SingleWord() {
        String sentence = "a";
        double result = wordStatisticsService.getAverageWordLength(sentence);
        assertEquals(1.0, result);
    }

    @Test
    public void testGetAverageWordLength_TwoWords() {
        String sentence = "test case";
        double result = wordStatisticsService.getAverageWordLength(sentence);
        assertEquals(4.0, result);
    }

    @Test
    public void testGetAverageWordLength_Sentence() {
        String sentence = "this is a test";
        double result = wordStatisticsService.getAverageWordLength(sentence);
        assertEquals(3.0, result);
    }
}

