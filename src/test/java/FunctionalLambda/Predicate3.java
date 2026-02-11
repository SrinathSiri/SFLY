package FunctionalLambda;

import java.util.function.Predicate;

public class Predicate3 {

    public static void main(String[] args) {

        Predicate<String> obj = (String s) -> {
            return s.length() > 3;
        };
        //obj.test("");

        String[] array = {"PAVAN", "JOHN", "SAMPLE", "GOODMORNING"};
        for (String ecarray : array) {
            if (obj.test(ecarray)) {
                System.out.println(ecarray);
            }
        }
    }
}
