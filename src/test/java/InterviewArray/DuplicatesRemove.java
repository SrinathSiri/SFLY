package InterviewArray;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicatesRemove {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 5, 6, 3};

        HashSet<Integer> setobj = new HashSet();

        for (int i = 0; i < arr.length; i++) {
            setobj.add(arr[i]);
        }
        System.out.println(setobj);
    }

}
