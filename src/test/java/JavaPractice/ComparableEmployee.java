package JavaPractice;

public class ComparableEmployee implements Comparable{

    int empid;
    String empname;
    int age;

    public ComparableEmployee(int empid,String empname,int age){
        this.empid=empid;
        this.empname=empname;
        this.age=age;
    }

    public int getEmpid(){
        return empid;
    }

    public String getEmpname(){
        return empname;
    }

    public int getEmpage(){
        return age;
    }

    @Override
    public int compareTo(Object o) {

       ComparableEmployee e = (ComparableEmployee)o;

       if(this.getEmpid()==e.getEmpid()){
           return 0;
       }
       else if(this.getEmpid()>e.getEmpid()){
           return 1;
        }
       return -1;
    }
}
