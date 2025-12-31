package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableCompareTo {

    public static void main(String[] args){

        ComparableEmployee e1 = new ComparableEmployee(222,"PAVAN",25000);
        ComparableEmployee e2 = new ComparableEmployee(333,"NITHIN",35000);
        ComparableEmployee e3 = new ComparableEmployee(111,"RATAN",125000);

        List<ComparableEmployee> employeeobj = new ArrayList<>();
        employeeobj.add(e1);
        employeeobj.add(e2);
        employeeobj.add(e3);

        Collections.sort(employeeobj);
        printmethod(employeeobj);

    }

    public static void printmethod(List<ComparableEmployee> empsdata){

        for(ComparableEmployee ecempdetails:empsdata){
            System.out.println("Empid is : "+ecempdetails.getEmpid()+" Empname : "+ecempdetails.getEmpname()+" Emp Age :"+ecempdetails.getEmpage());
        }
    }

}
