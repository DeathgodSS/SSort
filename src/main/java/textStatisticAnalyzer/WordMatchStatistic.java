package textStatisticAnalyzer;

import java.util.Map;
import java.util.TreeMap;

public class WordMatchStatistic {

    public Map<String, Integer> collectStatistic(String[] words) {
        Map<String, Integer> tempTreeMap = new TreeMap<>();
        int count = 0;
        for (String word : words) {
            for (String str : words) {
                if (word.equalsIgnoreCase(str)) {
                    count++;
                }
            }
            tempTreeMap.put(word.toLowerCase(), count);
            count = 0;
        }
        return tempTreeMap;
    }
}
