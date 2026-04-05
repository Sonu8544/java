package MultidinantionalArray;

public class SetZero {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    setZero(arr, i, j);
                }
            }
        }

        // Print the modified array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setZero(int[][] arr, int row, int col) {
        // Set the entire row to zero
        for (int j = 0; j < arr[row].length; j++) {
            arr[row][j] = 0;
        }

        // Set the entire column to zero
        for (int i = 0; i < arr.length; i++) {
            arr[i][col] = 0;
        }
    }
}
