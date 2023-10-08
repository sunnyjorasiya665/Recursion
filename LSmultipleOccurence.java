import java.util.ArrayList;

public class LSmultipleOccurence {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 5, 8, 4, 7, 5 };
        findAllindex(arr, 5, 0);
        System.out.println(list);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllindex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllindex(arr, target, index + 1);
    }
}
