package InterviewString;

public class StringOccurance {
    public static void main(String[] args) {
        String s = "selenium selenium selenium webdriver";
        String[] strArr = s.split(" ");
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("selenium")) {
                count++;
            }
        }
        System.out.println("The occurance of selenium is: " + count);
    }
}
