import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Positivelogin

{

    public static void main(String[] args)

    {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://trello.com ");
        driver.findElement(By.xpath("/html/body/header/nav/div[2]/a[1]")).click();
        driver.findElement(By.id("user")).sendKeys("bilskitomaszz@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div/div/div[2]/div/div/div"));
        driver.quit();
        System.out.println("Test ended successfully. The user was logged into the system");

    }

}