package JavaPractice;

import org.testng.annotations.Test;

import java.util.HashMap;

public class EncapEmpRes {
    @Test
    public void empResult() {
        EncapEmpData obj1 = new EncapEmpData();
        obj1.setEmpid(111);
        obj1.setEmpname("Pavan");
        obj1.setEmpsalary(425000);

        System.out.println(obj1.getEmpid());
        System.out.println(obj1.getEmpname());
        System.out.println(obj1.getEmpsalary());

        //---------------------------------------------

        HashMap<String,Object> empdata = new HashMap();
        empdata.put("EmpId",obj1.getEmpid());
        empdata.put("EmpName",obj1.getEmpname());
        empdata.put("EmpSalary",obj1.getEmpsalary());

        System.out.println(empdata);
    }
}
