import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;

public class StudentScores {
    public static void main(String[] args) {
        // Create HashMap to store student name -> marks
        Map<String, Integer> studentScores = new HashMap<>();

        // Add students
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);

        // Find highest scorer using streams
        Map.Entry<String, Integer> highest = studentScores.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .orElse(null);

        if (highest != null) {
            System.out.println("Topper = " + highest.getKey() + " with score " + highest.getValue());
        }
    }
}
