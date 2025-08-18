package JavaPractice;

import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args){
        ArrayList<String> obj = new ArrayList<String>();
        System.out.println(obj.size());
        System.out.println(obj.isEmpty());

        obj.add("Pavan");
        obj.add("Ratan");
        obj.add("Suresh");
        obj.add("Mukesh");

        System.out.println(obj.size());
        System.out.println(obj.isEmpty());
        System.out.println(obj);

        System.out.println(obj.contains("Ratan"));
        System.out.println(obj.remove("Ratan"));
        System.out.println(obj.size());
        System.out.println(obj);

    }
}
