import java.util.*;
import java.util.stream.*;

class WordCounter {
    public static void main(String[] args) {
        String text = "The news today is about the rise in technology trends.";

        // Step 1: Clean text (remove punctuation, lowercase)
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Step 2: Split into words
        String[] words = text.split("\\s+");

        // Step 3: Count occurrences using Map + Stream
        Map<String, Long> wordCount = Arrays.stream(words)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        // Step 4: Sort by frequency (descending)
        wordCount.entrySet().stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .forEach(entry -> 
                    System.out.println(entry.getKey() + " → " + entry.getValue())
                );
    }
}
