package JavaPractice;

import org.testng.annotations.Test;

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
    }
}
