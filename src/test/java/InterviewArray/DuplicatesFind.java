package InterviewArray;

public class DuplicatesFind {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 1, 2, 5, 6, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element is : " + arr[i]);
                    break;
                }
            }
        }

    }
}
