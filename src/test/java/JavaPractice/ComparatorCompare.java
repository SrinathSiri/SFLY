package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorCompare {

    public static void main(String[] args) {

        ComparatorEmployee e1 = new ComparatorEmployee(222, "Aravind", 38);
        ComparatorEmployee e2 = new ComparatorEmployee(333, "Pavan", 45);
        ComparatorEmployee e3 = new ComparatorEmployee(111, "SriAnish", 3);

        ArrayList<ComparatorEmployee> listobj = new ArrayList<>();
        listobj.add(e1);
        listobj.add(e2);
        listobj.add(e3);

        Collections.sort(listobj, (a, b) -> {
            if (a.getEmpid() == b.getEmpid()) {
                return 0;
            } else if (a.getEmpid() > b.getEmpid()) {
                return 1;
            } else {
                return -1;
            }
        });

        printEeData(listobj);
    }

    public static void printEeData(ArrayList<ComparatorEmployee> eesobj) {
        for (ComparatorEmployee eceedata : eesobj) {
            System.out.println(eceedata.getEmpid() + " - " + eceedata.getEmpname() + " - " + eceedata.getEmpage());
        }
    }
}
