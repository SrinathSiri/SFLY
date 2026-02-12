package FunctionalLambda;

import java.util.function.Predicate;

public class Predicate4 {

    String ename;
    int esalary;
    int eexperience;

    Predicate4(String name, int sal, int exp) {
        this.ename = name;
        this.esalary = sal;
        this.eexperience = exp;
    }

    public static void main(String[] args) {
        Predicate4 emp1 = new Predicate4("SRINATH", 25000, 12);
        if (emp1.eexperience > 3 && emp1.esalary > 20000) {
            System.out.println(emp1.ename);
        }

        Predicate4 emp2 = new Predicate4("RATAN", 30000, 15);

        Predicate<Predicate4> obj = (Predicate4 e) -> {
            return e.eexperience > 3 && e.esalary > 20000;
        };

        System.out.println(obj.test(emp2));
    }

}
