import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HuntingtonBankTestCase2 {

//Test case#2: Verify that the Huntington logo in Header is working properly
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Milad\\IdeaProjects\\SeleniumChromium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://huntingtonbank.com");

        driver.findElement(By.xpath("//img[@alt='Huntington, Welcome']")).click();

    }
}
