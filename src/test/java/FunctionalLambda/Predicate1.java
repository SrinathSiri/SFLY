package FunctionalLambda;


interface Predicate11<Integer> {
    boolean test(int i);
}

/*class classpredicate implements Predicate<Integer> {

    @Override
    public boolean test(int i) {
        return i >= 10;
    }
}*/

public class Predicate1 {

    public static void main(String[] args) {
        //Predicate<Integer> obj = new classpredicate();

        Predicate11<Integer> obj1 = (int i) -> {
            return i >= 10;
        };
        System.out.println(obj1.test(9));
    }
}
