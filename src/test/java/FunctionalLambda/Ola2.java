package FunctionalLambda;

@FunctionalInterface
interface Cab {
    public void fuel();    // Functional Interface contains only one abstract method
}

/*class Ola implements Cab {
    public void fuel() {
        System.out.println("Booked Ola cab with Fuel filled");
    }
}*/

public class Ola2 {
    public static void main(String[] args) {
        Cab obj = () -> {
            System.out.println("Booked Ola cab with Fuel filled");
        };
        obj.fuel();
    }
}
