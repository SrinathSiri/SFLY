package InterviewString;

public class StringJunkRemove {
    public static void main(String[] args) {

        String S = "S%d#u@h$&Ho(93U^";

        // to remove all special characters

        String S1 = S.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(S1);
    }
}
