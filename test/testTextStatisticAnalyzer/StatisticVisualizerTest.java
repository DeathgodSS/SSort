package testTextStatisticAnalyzer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import textStatisticAnalyzer.StatisticVisualizer;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class StatisticVisualizerTest {

    StatisticVisualizer statisticVisualizer;
    Map<String, Integer> testTreeMap = new TreeMap<>();
    String expected = "F:  for 1\n" +
            "G:  get 4\n" +
            "S:  some 2\n" +
            "\tstatistic 1\n" +
            "W:  words 3\n";

    @Before
    public void setUp() throws Exception {
        statisticVisualizer = new StatisticVisualizer();
        testTreeMap.put("some", 2);
        testTreeMap.put("words", 3);
        testTreeMap.put("for", 1);
        testTreeMap.put("get", 4);
        testTreeMap.put("statistic", 1);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void groupResult() {
        String actual = statisticVisualizer.groupResult(testTreeMap);
        assertEquals(expected, actual);
    }
}