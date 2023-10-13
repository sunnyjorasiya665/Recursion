import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 6, 3, 2, 8, 3, 9 };
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[max]) {
                sort(arr, row, col + 1, col);
            } else {
                sort(arr, row, col + 1, max);
            }

        } else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            sort(arr, row - 1, 0, 0);
        }
        // return arr;
    }
}