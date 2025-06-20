public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        double[][] persons = new double[10][3];

        for (int i = 0; i < 10; i++) {
            double weight = 50 + Math.random() * 50;
            double height = 140 + Math.random() * 40;
            double bmi = calculateBMI(weight, height);

            persons[i][0] = weight;
            persons[i][1] = height;
            persons[i][2] = bmi;

            System.out.printf("Person %d => Weight: %.1fkg, Height: %.1fcm, BMI: %.2f (%s)\n",
                    i + 1, weight, height, bmi, getStatus(bmi));
        }
    }
}
