package homeworks.fileAnalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FileAnalyzer {

    public Map<String, Integer> wordMap(String path) throws IOException {
        // Читаем файл, составляем мапу слово-количество и возвращаем ее
        String text = Files.readString(Paths.get(path));
        String[] words = text.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }

    public int totalWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем общее количество слов
        String text = Files.readString(Paths.get(path));
        int count = 0;
        for (String word : text.split("\\s+")) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public int uniqueWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем количество уникальных слов
        String text = Files.readString(Paths.get(path));
        String[] wordArray = text.split("\\s+");
        Set<String> words = new HashSet<String>();
        for (String word : wordArray) {
            if(!word.isEmpty()) {
                words.add(word);
            }
        }
        return words.size();
    }

    public Map<String, Integer> topFrequentWords(String path, int n) throws IOException {
        // Читаем файл, находим топ-N часто встречающихся слов
        return null;
    }

    public int countWordOccurrences(String path, String word) throws IOException {
        // Читаем файл, находим количество вхождений слова и возвращаем это число
        String text = Files.readString(Paths.get(path));
        int count = 0;
        for (String w: text.split("\\s+")) {
            if(w.equals(word)) {
                count++;
            }
        }
        return count;
    }

}
