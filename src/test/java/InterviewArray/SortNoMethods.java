package InterviewArray;

import java.util.Arrays;

public class SortNoMethods {
    public static void main(String[] args) {
        //bubble sort algorithm is little tough to remember, so using Arrays.sort() method here
        int[] arr = {10, 45, 2, 89, 23};
        Arrays.sort(arr);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
