package JavaPractice;

public class DupliString {

    public static void main(String[] args){

        String name = "VALUE LABS WIPRO AON HEWITT";

        char lettera = 'A';
        int a_count=0;

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==lettera){
                a_count++;
            }
        }

        System.out.println("A letter occurances : "+a_count);
    }
}
