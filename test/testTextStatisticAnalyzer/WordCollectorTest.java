package testTextStatisticAnalyzer;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import textStatisticAnalyzer.WordCollector;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;

public class WordCollectorTest {
    WordCollector wordCollector = new WordCollector();
    String[] expected = {"some",
            "text",
            "for",
            "test",
            "word",
            "anotherword"};

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void wordCollector() {
        String str = "some, text? for; test. word! anotherword";
        String[] actual = wordCollector.wordSplitter(str);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void readFile() throws IOException {
        String str = wordCollector.readFile("src/main/java/textStatisticAnalyzer/source/test.txt");
        String[] actual = wordCollector.wordSplitter(str);
        assertArrayEquals(expected, actual);
    }

    @Ignore //@Test (expected = FileNotFoundException.class)
    public void readFileNegativeCase() throws IOException {
        wordCollector.readFile("src/main/java/textStatisticAnalyzer/source/god.txt");

    }
}