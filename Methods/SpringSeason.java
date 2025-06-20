public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month == 4 || month == 5) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        int month = 4, day = 15;
        System.out.println(isSpringSeason(month, day) ? "It's a Spring Season" : "Not a Spring Season");
    }
}
