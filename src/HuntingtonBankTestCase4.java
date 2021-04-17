import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HuntingtonBankTestCase4 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Milad\\IdeaProjects\\SeleniumChromium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://huntingtonbank.com");

        driver.findElement(By.xpath("//select[@name='selectedId']")).click();
    }
}
