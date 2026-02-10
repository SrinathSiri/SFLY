package FunctionalLambda;

import java.util.function.Predicate;

public class Predicate2 {
    public static void main(String[] args){

        Predicate<String> obj = (String s) ->{return s.length()>=6;};
        System.out.println(obj.test("PAVAN"));

    }
}
