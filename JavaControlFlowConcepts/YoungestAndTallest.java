import java.util.Scanner;

/**
 * Program to find the youngest and tallest among three friends based on age and height.
 */
public class YoungestAndTallest {
    /**
     * Main method to execute the program.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User input for ages and heights
        System.out.print("Enter Amar's age: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter Amar's height (cm): ");
        int heightAmar = scanner.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter Akbar's height (cm): ");
        int heightAkbar = scanner.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter Anthony's height (cm): ");
        int heightAnthony = scanner.nextInt();

        // Find youngest
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngest = "";
        if (youngestAge == ageAmar) youngest += "Amar ";
        if (youngestAge == ageAkbar) youngest += "Akbar ";
        if (youngestAge == ageAnthony) youngest += "Anthony ";
        System.out.println("Youngest friend(s): " + youngest.trim());

        // Find tallest
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallest = "";
        if (tallestHeight == heightAmar) tallest += "Amar ";
        if (tallestHeight == heightAkbar) tallest += "Akbar ";
        if (tallestHeight == heightAnthony) tallest += "Anthony ";
        System.out.println("Tallest friend(s): " + tallest.trim());

        scanner.close();
    }
}
