import java.util.*;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        int[][] marks = new int[students][3];
        double[] percentage = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                int m = sc.nextInt();
                if (m < 0 || m > 100) {
                    j--;
                    continue;
                }
                marks[i][j] = m;
            }
        }

        for (int i = 0; i < students; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70&&percentage[i]<=79) grade[i] = 'B';
            else if (percentage[i] >= 60&&percentage[i]<=69) grade[i] = 'C';
            else if (percentage[i] >= 50&&percentage[i]<=59) grade[i] = 'D';
            else if (percentage[i] >= 40&&percentage[i]<=49) grade[i] = 'E';
            else grade[i] = 'R';
        }

        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f\n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }
    }
}
