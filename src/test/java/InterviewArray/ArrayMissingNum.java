package InterviewArray;

public class ArrayMissingNum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};

       int increment = 1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==increment){
                increment++;
            } else {
                System.out.println("Missing number is: " + increment);
                break;
            }
        }
    }
}
