package JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class CharOccrString {

    public static void main(String[] args){

        String word = "PAVANKALYAN";
        char[] chars = word.toCharArray();

        Map<Character,Integer> mapobj = new HashMap();

        for(char ecchar:chars){

            if(!mapobj.containsKey(ecchar)) {
                mapobj.put(ecchar, 1);
            } else{
                int cnt = mapobj.get(ecchar);
                mapobj.put(ecchar,cnt+1);
            }
        }
        System.out.println(mapobj);
    }
}
