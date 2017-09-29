package task_5;

public class Task_5 {
    public static void main(String[] args) {

        printTwoDimensionalMatrix(specialTwoDimensionalArray(11));
    }

    /**
     * create Two-Dimensional square Array where main and side diagonals have 1
     *
     * @param n - the size of a square matrix
     * @return a - matrix
     */
    public static int[][] specialTwoDimensionalArray(int n) {
        int a[][] = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            a[i][a.length - 1 - i] = 1;
            a[i][i]=1;
        }
        return a;
    }

    /**
     * print matrix in console
     * @param a-matrix
     */
    public static void printTwoDimensionalMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%2d|", a[i][j]);
            }
            System.out.printf("%n");
        }
    }


}
