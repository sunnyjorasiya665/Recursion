import java.util.Arrays;

public class mergeSortUsingInPlace {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 35, 9, 3, 6, 4, 7, 2, 6, 8, 2, 8, 2, 4 };
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void merge(int arr[], int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] <= arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

    static void mergeSort(int arr[], int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid, e);
        merge(arr, s, mid, e);
    }
}
