package JavaPractice;

public class StringRepeat {
    public static void main(String[] args){
        String s = "SIRIMALLA SRINATH";
        char targetChar = 'S';
        int count =0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==targetChar){
                count++;
            }
        }

        System.out.println("Number of times "+targetChar+" occurred is : "+count);

    }
}
