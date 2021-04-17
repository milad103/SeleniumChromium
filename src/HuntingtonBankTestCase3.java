import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HuntingtonBankTestCase3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Milad\\IdeaProjects\\SeleniumChromium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://huntingtonbank.com");
Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@role='button']")).click();
    }
}
