import java.util.Scanner;

public class MinimumPathSum {
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int ans = Integer.MAX_VALUE;
        path(grid, visited, m, n, 0, 0, 0, ans);
        return ans;
    }

    public static void path(int[][] grid, boolean[][] visited, int m, int n, int x, int y, int sum, int ans) {
        // System.out.println(x + " " + y);
        if (sum > ans || x < 0 || y < 0 || x >= m || y >= n || visited[x][y])
            return;
        if (x == m - 1 && y == n - 1) {
            ans = Math.min(ans, sum + grid[x][y]);
            return;
        }
        visited[x][y] = true;
        path(grid, visited, m, n, x + 1, y, sum + grid[x][y], ans);
        path(grid, visited, m, n, x, y + 1, sum + grid[x][y], ans);
        path(grid, visited, m, n, x - 1, y, sum + grid[x][y], ans);
        path(grid, visited, m, n, x, y - 1, sum + grid[x][y], ans);
        visited[x][y] = false;
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
        int ans = minPathSum(a);
        System.out.println(ans);
        scan.close();
    }
}
