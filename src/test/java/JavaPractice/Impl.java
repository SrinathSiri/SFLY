package JavaPractice;

public class Impl extends AbstrImpl {
    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    public void m2() {
        System.out.println("m2 method");
    }

    public static void main(String[] args) {
        I3 obj = new Impl();
        obj.m1();
        obj.m2();
        obj.m3();
    }

}
