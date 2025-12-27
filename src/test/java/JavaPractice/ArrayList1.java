package JavaPractice;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class ArrayList1 {

    @Test
    public void arraylistmethods() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("No numbers exist, so arraylist object empty "+numbers.isEmpty());
        System.out.println("No numbers so size is : "+numbers.size());
        System.out.println(""+numbers.add(10));
        System.out.println(""+numbers.add(20));
        System.out.println("Print total numbers : "+numbers);
        System.out.println(numbers.remove(1));
        System.out.println("After removing 20, numbers are : "+numbers);
        System.out.println("Size after removing 20 is : "+numbers.size());
        System.out.println("Is 10 present in numbers? : "+numbers.contains(10));

        }
}
