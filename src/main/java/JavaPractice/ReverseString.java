package JavaPractice;

public class ReverseString {
    public static void main(String[] args){

        String S = "Value Labs Hyderabad";

        // 1st approach with toCharArray method
        char[] stext = S.toCharArray();

        for(int i=stext.length-1;i>=0;i--){
            System.out.print(stext[i]);
        }

        // 2nd approach for StringBuffer method

        StringBuffer sb = new StringBuffer(S);

        System.out.println("StringBuffer text is : "+sb.reverse());

        // 3rd approach using String class another method

        for(int i=S.length()-1;i>=0;i--){
            System.out.print(S.charAt(i));
        }

        //4th approach using StringBuilder Class

        StringBuilder sbuild = new StringBuilder(S);
        System.out.print("StringBuilder : "+sbuild.reverse());
    }
}
