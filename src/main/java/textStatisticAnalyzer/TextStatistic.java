//"src/main/java/textStatisticAnalyzer/source/txt.txt"
package textStatisticAnalyzer;

import java.io.IOException;

public class TextStatistic {

    private final WordCollector wordCollector = new WordCollector();
    private final WordMatchStatistic wordMatchStatistic = new WordMatchStatistic();
    private final StatisticVisualizer statisticVisualizer = new StatisticVisualizer();

    public String textStatisticAnalyzer(String path) throws IOException {

        String[] words = wordCollector.wordSplitter(wordCollector
                .readFile(path));
        return statisticVisualizer.groupResult(wordMatchStatistic.collectStatistic(words));
    }
}
