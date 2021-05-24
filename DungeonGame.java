import java.util.Scanner;

public class DungeonGame {
    public static void calculate(int[][] dungeon, int x, int y, int sum, int ans){
        if(x== dungeon.length || y== dungeon[0].length) return;
        // if (x == dungeon.length-1 && y == dungeon[0].length-1){
        //     ans= 
        //     return;
        // }
 
    }
    public static int calculateMinimumHP(int[][] dungeon) {
        int ans=0;
        calculate(dungeon, 0, 0, 0, ans);
        return ans;
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m= scan.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int ans = calculateMinimumHP(a);
        System.out.println(ans);
        scan.close();
    }
}
