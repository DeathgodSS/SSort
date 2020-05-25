package testTextStatisticAnalyzer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import textStatisticAnalyzer.TextStatistic;

import java.io.IOException;

import static org.junit.Assert.*;

public class TextStatisticTest {

    TextStatistic textStatistic;
    String expected = "F:  for 1\n" +
            "G:  get 4\n" +
            "S:  some 2\n" +
            "\tstatistic 1\n" +
            "W:  words 3\n";

    @Before
    public void setUp() throws Exception {
        textStatistic = new TextStatistic();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void textStatisticAnalyzer() throws IOException {

        String actual = textStatistic.textStatisticAnalyzer("src/main/java/textStatisticAnalyzer/source/test2.txt");
        assertEquals(expected, actual);
    }
}