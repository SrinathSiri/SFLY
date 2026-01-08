package JavaPractice;

public class StringCharOccurance1 {
    public static void main(String[] args) {
        String str = "programming";
        char ch = 'g';
        int count = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                count++;
            }
        }
        System.out.println("The occurance of character '" + ch + "' is: " + count);
    }
}
