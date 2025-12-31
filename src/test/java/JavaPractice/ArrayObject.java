package JavaPractice;

public class ArrayObject {

    public static void main(String[] args){

        ArrayStudent[] object = new ArrayStudent[4];
        object[0] = new ArrayStudent(1,"PAVAN");
        object[1] = new ArrayStudent(2,"Jeevan");
        object[2] = new ArrayStudent(3,"Kalyan");
        ArrayStudent obj1 = new ArrayStudent(4,"G1");
        object[3] = obj1;

        System.out.println(object[0].id);
        System.out.println(object[0].name);

        System.out.println(object[3].id);
        System.out.println(object[3].name);

    }

}
