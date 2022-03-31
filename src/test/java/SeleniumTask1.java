import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class SeleniumTask1 {

    @Test
    public void ssLvTest() {
//  Configure path to driver location
        String driverPath = "C:\\Users\\Dell\\IdeaProjects\\MyFirstGradleProject\\src\\test\\resources\\chromedriver.exe";
//  Configure system for driver location in system
        System.setProperty("webdriver.chrome.driver", driverPath);
//  Create driver object using path from system
        ChromeDriver driver = new ChromeDriver();
//  Open url using newly created object
        driver.get("https://www.ss.lv/");
//  Find and click on cars menu item
        driver.findElement(By.id("mtd_97")).click();
//  Get current url and save to String variable
        String currentUrl = driver.getCurrentUrl();
//  Validate current url
        assertThat(currentUrl).isEqualTo("https://www.ss.lv/lv/transport/cars/");
//  Find element Price and enter some value
        driver.findElement(By.id("f_o_8_min")).sendKeys("6000");
        driver.findElement(By.id("f_o_8_max")).sendKeys("10000");
//  Create select dropdown option
        Select carYear = new Select(driver.findElement(By.id("f_o_18_min")));
        carYear.selectByValue("2001");
        Select carEngine = new Select(driver.findElement(By.id("f_o_15_max")));
        carEngine.selectByValue("3.0");
        Select carColor = new Select(driver.findElement(By.id("f_o_17")));
        carColor.selectByValue("6318");

//  Find element meklet button by xpath
        driver.findElement(By.xpath("//input[@class='b s12']")).click();

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