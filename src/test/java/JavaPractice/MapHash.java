package JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class MapHash {
    public static void main(String[] args) {
        Map<String, String> obj = new HashMap<String, String>();
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());

        obj.put("TestScript", "TC_001");
        obj.put("username", "admin");
        obj.put("password", "pass123");

        System.out.println(obj);
        System.out.println(obj.size());
        System.out.println(obj.isEmpty());

        obj.replace("password", "123pass");
        System.out.println(obj);

        System.out.println(obj.get("username"));


    }
}
