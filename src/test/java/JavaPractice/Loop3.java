package JavaPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loop3 {
    public static void main(String[] args){
       int i =1;
       do{
           System.out.println(i); // statement execution completes atleast once even when 'while condition' fail
       }
       while(i == 5);

    }
}
