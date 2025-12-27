package JavaPractice;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList2 {
    @Test
    public void arraytocollection(){

        String[] cars = {"vw","bmw","audi","ford"};

        ArrayList<String> carlist = new ArrayList<>(Arrays.asList(cars));
        System.out.println("Car list before sorting : "+carlist);
        Collections.sort(carlist);
        System.out.println("Car list after sorting : "+carlist);
        Collections.reverse(carlist);
        System.out.println("car list after reversing : "+carlist);
    }

    @Test
    public void collectiontoArray(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("grape");

        String[] fruitarray = new String[fruits.size()];
        fruits.toArray(fruitarray);

        System.out.println("Fruits array elements are : ");
        for(String fruit: fruitarray){
            System.out.println(fruit);
        }
    }
}
