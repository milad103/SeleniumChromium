import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HuntingtonBankTestCase1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Milad\\IdeaProjects\\SeleniumChromium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://huntingtonbank.com");

        driver.findElement(By.xpath("//input[@id='personal-username']")).sendKeys("jake123");
        driver.findElement(By.xpath("//input[@id='personal-password']")).sendKeys("123456789");
        driver.findElement(By.xpath("//button[@aria-label='Log in to Huntington Online Banking']")).click();
        //you will be redirected to another URL (https://onlinebanking.huntington.com/rol/Auth/login.aspx?error=0x132120c8)
        //where it says that "The username or password is incorrect."

    }
}
