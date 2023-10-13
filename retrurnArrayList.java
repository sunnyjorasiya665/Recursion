import java.util.ArrayList;

public class retrurnArrayList {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 2, 5, 5 };
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllindex(arr, 2, 0, list));
    }

    static ArrayList<Integer> findAllindex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllindex(arr, target, index + 1, list);
    }
}
