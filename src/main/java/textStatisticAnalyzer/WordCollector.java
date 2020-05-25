package textStatisticAnalyzer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WordCollector {

    public String readFile(String fileName) throws IOException {
        int symbol;
        StringBuilder stringBuilder = new StringBuilder();
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "0";
        }
        while (fileInputStream.available() > 0) {
            symbol = fileInputStream.read();
            stringBuilder.append((char) symbol);
        }
        return stringBuilder.toString();
    }

    public String[] wordSplitter(String str) {
        String[] words = str.split("[^a-zA-Z']+");
        return words;
    }
}
