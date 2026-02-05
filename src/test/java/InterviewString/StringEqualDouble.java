package InterviewString;

public class StringEqualDouble {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "He";
        String s3 = s2 + "llo";

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

    }
}
