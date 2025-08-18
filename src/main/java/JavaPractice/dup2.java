package JavaPractice;

import java.util.HashSet;

public class dup2 {

    public static void main(String[] args){

        // 1st Approach
        String company = "AON HEWITT WIPRO VALUE LABS";
        StringBuilder sb = new StringBuilder();
        HashSet<Object> ss= new HashSet<>();
        for(char c:company.toCharArray()){
            if(ss.add(c)){
                sb.append(c);
            }
        }
        System.out.println(sb);



    }
}
