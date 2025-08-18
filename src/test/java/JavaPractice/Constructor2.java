package JavaPractice;

public class Constructor2 {
    int id;
    String name;
    double sal;

    public void m1() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(sal);
    }

    Constructor2(int empid, String empname, double empsal) {
        id=empid;
        name=empname;
        sal=empsal;
    }

    public static void main(String[] args){
        Constructor2 obj1 = new Constructor2(111,"Madduri",23245.04);
        obj1.m1();
        Constructor2 obj2 = new Constructor2(222,"vasantha",17353.02);
        obj2.m1();

    }


}
