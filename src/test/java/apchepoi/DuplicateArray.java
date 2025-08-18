package apchepoi;

public class DuplicateArray {

    public  static void main(String[]args){

        String s = "Hello World";
        char a ;
        int count =0;
        for(int i=0;i<s.length();i++)
        {
            //i=3 (l)
            a=s.charAt(i); //a=e
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j));
                {
                    count++;
                }
            }
        }
        System.out.println(count);



    }


}
