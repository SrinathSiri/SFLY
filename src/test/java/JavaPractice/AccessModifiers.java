package JavaPractice;

import org.sfly.HelloWorld;
import org.testng.annotations.Test;

public class AccessModifiers extends HelloWorld{

    protected void m1() {
        System.out.println("m1 method");
    }

    static void m2() {
        System.out.println("m2 method");
    }

    private void m3() {
        System.out.println("m3 method");
    }
    @Test
    public void executeMethod(){
        AccessModifiers obj =  new AccessModifiers();
        obj.helloWorld();

        obj.m1();
        AccessModifiers.m2();
        obj.m3();

    }
}
