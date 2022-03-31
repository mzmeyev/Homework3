import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Homework3 {

    @Test
    public void AliExpress(){
        //  Configure path to driver location
        String driverPath = "C:\\Users\\Dell\\IdeaProjects\\MyFirstGradleProject\\src\\test\\resources\\chromedriver.exe";
        //  Configure system for driver location in system
        System.setProperty("webdriver.chrome.driver", driverPath);
        //  Create driver object using path from system
        ChromeDriver driver = new ChromeDriver();
        //  Open url using newly created object
        driver.get("https://www.aliexpress.com/");
        // Maximize the screen
        driver.manage().window().maximize();
        // Dismiss Pop-ops
        driver.findElement(By.className("btn-close")).click(); //if only two adds appear during test, then comment this line
        driver.findElement(By.className("_24EHh")).click();
        driver.findElement(By.className("close-btn")).click();
        //  Find element Price and enter some value
        driver.findElement(By.className("search-key")).sendKeys("tattoo");
        // Find and click search button
        driver.findElement(By.className("search-button")).click();
        //  Find element Price and enter some value
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/span[1]/span[2]/input")).sendKeys("10");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/span[1]/span[3]/input")).sendKeys("20");
        // Press OK button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/span[1]/a")).click();
        // Wait for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //        Close driver
        driver.quit();
    }
}
