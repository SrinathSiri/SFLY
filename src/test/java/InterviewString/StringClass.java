package InterviewString;

public class StringClass {
    public static void main(String[] args){
        String s="";
        System.out.println(s);

        String obj = new String("PAVAN");
        System.out.println(obj);

        obj = obj+"Kalyan";
        System.out.println("After + operator is : "+obj); // New object created

        //obj = obj.concat("KALYAN");
        //System.out.println("After concat : "+obj);

    }
}
