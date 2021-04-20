import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HuntingtonBankTestCase5 {

    // Testcase#5: find, click and open YouTube HomePage for Huntingtonbank.com
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\IdeaProjects\\SeleniumChromium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://huntingtonbank.com");


        driver.findElement(By.xpath("//a[@class='icon-youtube ExternalRiskLevelLow clickTracking']")).click();

        driver.findElement(By.xpath("//a[@aria-label='Continue to site']")).click();

    }
}