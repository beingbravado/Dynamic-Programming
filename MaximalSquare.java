import java.util.Scanner;

public class MaximalSquare {
    public static int maximalSquare(char[][] matrix) {

    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println(maximalSquare(a));
        scan.close();
    }
}
