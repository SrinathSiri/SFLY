package JavaPractice;

public class ArrayEx1 {
    public static void main(String[] args) {
        String[][] data = new String[3][3];
        data[0][0] = "SNO";
        data[0][1] = "Technology";
        data[0][2] = "Language";

        data[1][0] = "001";
        data[1][1] = "Selenium";
        data[1][2] = "Java";

        data[2][0] = "002";
        data[2][1] = "Playwright";
        data[2][2] = "JavaScript";

        System.out.println(data[0][0]);
        System.out.println(data[0][1]);
        System.out.println(data[0][2]);
        System.out.println(data[1][0]);
        System.out.println(data[1][1]);
        System.out.println(data[1][2]);
        System.out.println(data[2][0]);
        System.out.println(data[2][1]);
        System.out.println(data[2][2]);
    }
}
