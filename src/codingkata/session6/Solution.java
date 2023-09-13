package codingkata.session6;

class Solution {
    int[][] moves = {{1, 0}, {0, -1}, {0, 1}, {-1, 0}};

    public static void main(String[] args) {
        Solution solution = new Solution();


        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        System.out.println(solution.numIslands(grid));
    }

    public int numIslands(char[][] grid) {
        int islandCount = 0;

        for (int rowIndex = 0; rowIndex < grid.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < grid[rowIndex].length; columnIndex++) {
                if (grid[rowIndex][columnIndex] == '1') {
                    discoverIsland(grid, rowIndex, columnIndex);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

    public void discoverIsland(char[][] grid, int rowIndex, int columnIndex) {
        grid[rowIndex][columnIndex] = '0';

        for (int[] move : moves) {
            int neighborRowIndex = rowIndex;
            int neighborColumnIndex = columnIndex;

            if (rowIndex + move[0] >= 0 && rowIndex + move[0] < grid.length) {
                neighborRowIndex = rowIndex + move[0];
            }
            if (columnIndex + move[1] >= 0 && columnIndex + move[1] < grid[rowIndex].length) {
                neighborColumnIndex = columnIndex + move[1];
            }
//            System.out.print(neighborRowIndex + ' ' + neighborColumnIndex);
            if (grid[neighborRowIndex][neighborColumnIndex] == '1') {
                discoverIsland(grid, neighborRowIndex, neighborColumnIndex);
            }
        }
    }
}
