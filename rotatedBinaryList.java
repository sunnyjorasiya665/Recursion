public class rotatedBinaryList {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 8, 6, 7 };
        System.out.println(binarySearch(arr, 6, 0, arr.length));
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return binarySearch(arr, target, s, m - 1);
            } else
                return binarySearch(arr, target, m + 1, e);
        }
        if (target >= arr[m] && target <= arr[e]) {
            return binarySearch(arr, target, m + 1, e);
        }
        return binarySearch(arr, target, s, m - 1);
    }
}
