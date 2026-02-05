package InterviewString;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringDuplicates {
    public static void main(String[] args) {

        String abc = "madam";
        Set<Character> charset = new LinkedHashSet<>();
        for (int i = 0; i < abc.length(); i++) {
            charset.add(abc.charAt(i));
        }

        for(Character ec:charset){
            System.out.print(ec);
        }
    }
}
