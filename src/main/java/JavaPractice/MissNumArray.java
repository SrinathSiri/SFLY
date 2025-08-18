package JavaPractice;

import java.util.Arrays;

public class MissNumArray {

    public static void main(String[] args) {

        int ar[] = {2,4,3,1,7,5,9};
        Arrays.sort(ar); // 1,2,3,4,5,7,9

        int expected = ar[0]; // lowest number

        for(int i=0;i<ar.length;i++){

            while(ar[i]!=expected){
                System.out.println(expected);
                expected++;
            }
            expected++;
        }


    }
}
