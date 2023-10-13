import java.util.ArrayList;

public class listWithoutPassingArgunments {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 5 };
        ArrayList<Integer> numList = new ArrayList<>();
        numList = findAllindex(arr, 2, 0);
        System.out.println(numList); // create arraylist
    }

    static ArrayList<Integer> findAllindex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ans = findAllindex(arr, target, index + 1);
        list.addAll(ans);
        return list;
    }
}
