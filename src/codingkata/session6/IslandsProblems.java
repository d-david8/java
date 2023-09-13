package codingkata.session6;

public class IslandsProblems {

    public static void main(String[] args) {
        int islandCount = 0;
        int a[][] = {{1, 1, 0}, {1, 0, 0}, {1, 0, 1}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 1) {
                    discoverIsland(a, i, j);
                    islandCount++;
                }
            }
        }
        System.out.println(islandCount);

    }

    public static void discoverIsland(int[][] a, int i, int j) {
        if (i < a.length && i >= 0 && j < a[i].length && j >= 0 && a[i][j] == 1) {
            a[i][j] = 0;
            discoverIsland(a, i - 1, j);
            discoverIsland(a, i + 1, j);
            discoverIsland(a, i, j - 1);
            discoverIsland(a, i, j + 1);
        }
    }
}
