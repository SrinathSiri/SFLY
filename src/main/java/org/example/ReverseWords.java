package org.example;

public class ReverseWords {

    public static void main(String[] args){

        String words = "Java Code";
        String[] twowords = words.split(" ");

        for(String word2:twowords){
            String ecword = "";
            String reversewords = "";
            for(int i=word2.length()-1;i>=0;i--){
                ecword = ecword+word2.charAt(i);
            }
            reversewords =  reversewords+" "+ecword;
            System.out.print(reversewords);
        }

    }
}
