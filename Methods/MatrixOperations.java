public class MatrixOperations {
    public static int[][] transpose(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[j][i] = mat[i][j];
        return result;
    }

    public static int determinant2x2(int[][] mat) {
        return mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0];
    }

    public static double[][] inverse2x2(int[][] mat) {
        int det = determinant2x2(mat);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1] / (double) det;
        inv[0][1] = -mat[0][1] / (double) det;
        inv[1][0] = -mat[1][0] / (double) det;
        inv[1][1] = mat[0][0] / (double) det;
        return inv;
    }

    public static void printMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row)
                System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{4, 7}, {2, 6}};
        System.out.println("Inverse:");
        printMatrix(inverse2x2(mat));
    }
}
