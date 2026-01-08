package InterviewArray;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondLargeElement {
    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 89, 23};
        Arrays.sort(arr);
        System.out.println("second largest element is: " + arr[arr.length - 2]);

        /*ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr[0], arr[1], arr[2], arr[3], arr[4]));
        list.sort(null);
        System.out.println("second largest element is: " + list.get(list.size() - 2));*/

    }
}
