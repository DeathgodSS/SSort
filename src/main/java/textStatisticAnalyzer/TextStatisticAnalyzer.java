package textStatisticAnalyzer;

import java.util.Map;
import java.util.TreeMap;

public class TextStatisticAnalyzer {
    private String text;

    public TextStatisticAnalyzer(String text) {
        this.text = text;
    }

    public String receiveAnalise() {
        String[] words = wordSplitter(text);
        Map<String, Integer> statistic = collectStatistic(words);
        return groupResult(statistic);
    }

    private String[] wordSplitter(String text) {
        String[] words = text.split("[^a-zA-Z']+");
        return words;
    }

    private String groupResult(Map<String, Integer> treeMap) {
        StringBuilder result = new StringBuilder();
        char previousLetter = ' ';
        char letter = ' ';
        for (Map.Entry<String, Integer> e : treeMap.entrySet()) {
            letter = e.getKey().toUpperCase().toCharArray()[0];
            if (letter == previousLetter) {
                result.append("\t" + e.getKey() + " " + e.getValue() + "\n");

            } else {
                result.append(e.getKey().toUpperCase().toCharArray()[0] +
                        ": " + " " + e.getKey() + " " + e.getValue() + "\n");
            }
            previousLetter = e.getKey().toUpperCase().toCharArray()[0];
        }
        return result.toString();
    }

    private Map<String, Integer> collectStatistic(String[] words) {
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
