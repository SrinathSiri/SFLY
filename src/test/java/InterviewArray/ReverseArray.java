package InterviewArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {10, 45, 2, 89, 23};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            //System.out.println(arr[i]);
            list.add(arr[i]);
        }

        System.out.println("Reversed Array: " + list);
        // how to convert ArrayList to Array
        Integer[] reversedArr = list.toArray(new Integer[0]);
        System.out.print("Reversed Array in Array format: ");
        for (Integer num : reversedArr) {
            System.out.print(num + " ");
        }

        List<Integer> listobj = Arrays.asList(reversedArr); // converting Array to List
        Collections.reverse(listobj);
        System.out.println("\nOriginal Array after reversing the reversed array: " + listobj);

    }
}
