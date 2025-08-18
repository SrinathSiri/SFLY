package JavaPractice;

import org.openqa.selenium.devtools.v129.debugger.Debugger;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupliString {

    public static void main(String[] args){

        // 1st Approach
        String company = "AON HEWITT WIPRO VALUE LABS";

        StringBuffer sb = new StringBuffer();

        for(int i=0;i<company.length();i++){
            char ch = company.charAt(i);
            int indexnum = company.indexOf(ch,i+1);
            if(indexnum==-1){
                sb.append(ch);
            }

        }
        System.out.println(sb);

       //2nd Approach

       String S = "PAVAN KALYAN";
       StringBuffer sb1 = new StringBuffer();

       char[] cadata = S.toCharArray();
       for(int i=0;i<cadata.length;i++){
           Boolean repeated = false;
           for(int j=i+1;j<cadata.length;j++){
               if(cadata[i]==cadata[j]){
                   repeated=true;
                   break;
               }
           }
           if(!repeated){
               sb1.append(cadata[i]);
           }
       }
       System.out.println(sb1);

       // 3rd approach

        StringBuffer sb3 = new StringBuffer();
        Set<Character> setdata = new LinkedHashSet<>();

        for(int i=0;i<S.length();i++){
            setdata.add(S.charAt(i));
        }

       for(Character ec:setdata){
           sb3.append(ec);
       }
       System.out.println("Third Approach : "+sb3);
    }
}
