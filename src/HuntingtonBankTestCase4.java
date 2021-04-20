import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HuntingtonBankTestCase4 {

    public static void main(String[] args) {

        //Test case#4: Check that if select the drop down(under title: Community Involvement)
        // by down arrow key then all items are getting listed in alphabetic order

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Milad\\IdeaProjects\\SeleniumChromium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://huntingtonbank.com");

        driver.findElement(By.xpath("//select[@name='selectedId']")).click();


    }
}
