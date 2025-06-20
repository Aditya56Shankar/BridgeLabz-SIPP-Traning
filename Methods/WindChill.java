public class WindChill {
    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temp * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        System.out.println("Wind Chill: " + calculateWindChill(30, 10));
    }
}
