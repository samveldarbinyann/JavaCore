package homeworks.fileAnalyzer;
import java.io.IOException;

public class AnalyzerDemo {
    public static void main(String[] args) throws IOException {
        FileAnalyzer f =  new FileAnalyzer();
        String path = "C:\\Users\\samve\\JavaCore\\src\\homeworks\\fileAnalyzer\\file.txt";

        int totalWords = f.totalWordCount(path);
        System.out.println(totalWords);
        int uniqueWords = f.uniqueWordCount(path);
        System.out.println(uniqueWords);
        int cwo = f.countWordOccurrences(path, "Hello");
        System.out.println(cwo);
    }
}
