package Assignment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase {
    @Test
    public void testLetterCount() {
        Logic data = new Logic();
        data.inputSize("hej");
        data.inputSize("en rad till");
        data.inputSize("blanksteg räknas");

        int expected = 30;
        int actual = data.getLetterCount();

        assertEquals(expected, actual);
    }
    @Test
    public void testRowCount() {
        Logic data = new Logic();
        data.inputSize("första raden");
        data.inputSize("en rad till");
        data.inputSize("två till");
        data.inputSize(",");

        int expected = 4;
        int actual = data.getRows();

        assertEquals(expected, actual);
    }
    @Test
    public void testStopCheck() {
        Logic data = new Logic();
        data.inputSize("stop");

        boolean expected = true;
        boolean actual = data.stopCheck;

        assertEquals(expected, actual);
    }
    @Test
    public void testLetterCountWhenStop() {
        Logic data = new Logic();
        data.inputSize("Stop");

        int expected = 0;
        int actual = data.getLetterCount();

        assertEquals(expected, actual);
    }
    @Test
    public void testRowCountWhenStop() {
        Logic data = new Logic();
        data.inputSize("Stop");

        int expected = 0;
        int actual = data.getRows();

        assertEquals(expected, actual);
    }
    @Test
    public void testLongestWordWhenStop() {
        Logic data = new Logic();
        data.inputSize("Stop");

        String expected = "";
        String actual = data.getLongestWord();

        assertEquals(expected, actual);
    }
    @Test
    public void testWordCountWhenStop() {
        Logic data = new Logic();
        data.inputSize("Stop");

        int expected = 0;
        int actual = data.getWordCount();

        assertEquals(expected, actual);
    }
    @Test
    public void testLongestWord() {
        Logic data = new Logic();
        data.inputSize("tjena, vi testar olika längder!");
        data.inputSize("flaggstång");
        data.inputSize("Linus");


        String expected = "flaggstång";
        String actual = data.longestWord;
        assertEquals(expected, actual);
    }
    @Test
    public void testWordCount() {
        Logic data = new Logic();
        data.inputSize("ett två tre");
        data.inputSize("pizzeria");
        int expected = 4;
        int actual = data.getWordCount();

        assertEquals(expected, actual);
    }

}
