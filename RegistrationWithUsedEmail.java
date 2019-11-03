import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationWithUsedEmail {

    public static void main(String[] args)

    {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://trello.com ");
        driver.findElement(By.xpath("/html/body/header/nav/div[2]/a[2]")).click();
        driver.findElement(By.id("email")).sendKeys("bilskitomaszz@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"signup\"]")).click();
        driver.findElement(By.id("name")).sendKeys("bilskitomaszz@gmail");
        driver.findElement(By.id("password")).sendKeys("testpassword");
        driver.findElement(By.xpath("//*[@id=\"signup\"]")).click();
        if( driver.findElement(By.xpath("//*[@id=\"login-prompt\"]")).isDisplayed()){}
        else{
            driver.quit();
        }
        driver.quit();
        System.out.println("Test ended successfully. The registration using previously used e-mail address was not possible");
    }

}
