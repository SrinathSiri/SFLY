package InterviewString;

import java.util.Arrays;

public class SeparateAlpNum {

    public static void main(String[] args){

        String S = "Es1YiU2hTf3OJ(h%$)oc*h%j$h#";
        StringBuilder digit = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder specialchar = new StringBuilder();

        // separate alphbets, numbers and special characters

        char[] multichar = S.toCharArray();

        for(char echar:multichar){
            if(Character.isDigit(echar)){
                digit.append(echar);
            }
            else if(Character.isLetter(echar)){
                letters.append(echar);
            }
            else {
                specialchar.append(echar);
            }
        }

        System.out.println(digit);
        System.out.println(letters);
        System.out.println(specialchar);
    }
}
