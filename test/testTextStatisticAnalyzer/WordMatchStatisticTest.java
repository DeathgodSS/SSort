package testTextStatisticAnalyzer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import textStatisticAnalyzer.WordMatchStatistic;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class WordMatchStatisticTest {

    WordMatchStatistic wordMatchStatistic;

    String[] words = {"some", "some", "some",
            "text", "text", "text", "text",
            "for", "for",
            "test",
            "word"};

    Map<String, Integer> expectedTreeMap = new TreeMap<>();

    @Before
    public void setUp() throws Exception {
        wordMatchStatistic = new WordMatchStatistic();
        expectedTreeMap.put("for", 2);
        expectedTreeMap.put("some", 3);
        expectedTreeMap.put("test", 1);
        expectedTreeMap.put("text", 4);
        expectedTreeMap.put("word", 1);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void collectStatistic() {
        Map<String, Integer> actual = wordMatchStatistic.collectStatistic(words);
        assertEquals(actual, expectedTreeMap);
    }
}