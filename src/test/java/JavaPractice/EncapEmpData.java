package JavaPractice;

public class EncapEmpData {
    private int empid;
    private String empname;
    private double empsalary;

    public void setEmpid(int empid) {

        if (empid <= 0) {
            System.out.println("Invalid EmpId, Please change Id");
            System.exit(1);
        } else {
            this.empid = empid;
        }
    }

    public void setEmpname(String empname) {

        this.empname = empname;
    }

    public void setEmpsalary(double empsalary) {

        this.empsalary = empsalary;
    }

    public int getEmpid() {

        return empid;
    }

    public String getEmpname() {

        return empname;
    }

    public double getEmpsalary() {

        return empsalary;
    }


}
