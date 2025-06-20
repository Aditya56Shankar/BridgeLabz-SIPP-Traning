public class ChocolateDivider {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        int[] result = findRemainderAndQuotient(35, 6);
        System.out.println("Each child gets: " + result[0] + ", Remaining: " + result[1]);
    }
}
