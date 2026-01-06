package InterviewArray;

import java.util.TreeSet;

public class SmallLargeElements {

    public static void main(String[] args){

        int[] arr = {5, 3, 2, 4, 1};

        TreeSet<Integer> obj = new TreeSet<>();

        for(int i=0;i<arr.length;i++){
            obj.add(arr[i]);
        }

        System.out.println("small element : "+obj.first()); // first and last methods (not applicable for ArrayList) are applicable for TreeSet as it implements navigable set.
        System.out.println("large element : "+obj.last());

        // ------------------------------------------------------

        // Another Approach without using Collections
        int small = arr[0];
        int large = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<small){
                small = arr[i];
            }
            if(arr[i]>large){
                large = arr[i];
            }
        }
        System.out.println("small element without collections : "+small);
        System.out.println("large element without collections : "+large);

    }


}
