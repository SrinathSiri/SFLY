package JavaPractice;

public class Constructor1 {
    int id;
    String name;
    double salary;

    public Constructor1(int empid,String empname,double empsalary){
        id=empid;
        name=empname;
        salary=empsalary;
    }

    public void job(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args){
        Constructor1 obj = new Constructor1(111,"John",25000.05);
        obj.job();
        Constructor1 obj1 = new Constructor1(222,"Pavan",200250.07);
        obj1.job();

    }


}
