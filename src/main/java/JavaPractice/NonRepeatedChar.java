package JavaPractice;

import java.util.HashSet;
import java.util.Set;

public class NonRepeatedChar {
    public static void main(String[] args){

        String text = "AABCDBEABCCCSB";
        Set<Character> data = new HashSet<>();

        for(int i=0;i<text.length();i++){
            for(int j=i+1;j<text.length();j++){
                if(text.charAt(i)==text.charAt(j)){
                    if(!data.contains(text.charAt(i))){
                        System.out.println("Repeated Char is : "+text.charAt(i));
                        data.add(text.charAt(i));
                    }

                   break;
                }
            }
        }

        /*for(int i=0;i<text.length();i++){
            data.add(text.charAt(i));
        }*/
        }
    }
