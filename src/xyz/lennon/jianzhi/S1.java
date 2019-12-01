package xyz.lennon.jianzhi;

public class S1 {
    public boolean Find(int target, int[][] array) {
        int rows = array.length;
        if (rows == 0) {
            return false;
        }
        int cols = array[0].length;
        if (cols == 0) {
            return false;
        }
        // 左下
        int row = rows - 1;
        int col = 0;
        while (row >= 0 && col < cols) {
            if (array[row][col] < target) {
                col++;
            } else if (array[row][col] > target) {
                row--;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean Find2(int target, int [][] array) {
        int x = 0;
        int y = array[0].length - 1;
        while (x < array.length && y >= 0) {
            if (target < array[x][y]) {
                y--; continue;
            }
            if (target > array[x][y]) {
                x++; continue;
            }
            if (target == array[x][y]) {
                return true;
            }
        }
        return false;
    }
}
