package InterviewString;

public class stringCharOccurance {
    public static void main(String[] args) {
        String s = "automation testing";
        char ch = 't';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("The occurance of character '" + ch + "' is: " + count);
    }
}
