package JavaPractice;

public class MethodOveride2 extends MethodOveride1{


    public void m1() {
        System.out.print("m3 method");
    }

    public static void main(String[] args){
        MethodOveride2 obj = new MethodOveride2();
        obj.m1();
    }


}
