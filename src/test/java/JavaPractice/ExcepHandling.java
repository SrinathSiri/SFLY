package JavaPractice;

public class ExcepHandling {

    public static void main(String[] args) {

        int[] num = new int[3];

        try {
            System.out.println("Start");
            num[0] = 111;
            num[1] = 222;
            num[2] = 333;
            num[4] = 444;
            System.out.println("End");
        } catch (Exception exception) {
            System.out.println(exception.toString());
        } finally {
            System.out.println("Executed Successfully");
        }
        System.out.println("End");
    }
}
