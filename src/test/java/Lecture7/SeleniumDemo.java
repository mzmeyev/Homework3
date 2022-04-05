package Lecture7;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    @Test
    public void firstSeleniumDemoTest() {
        //          Configure path to driver location
        String driverPath = "C:\\Users\\Dell\\IdeaProjects\\MyFirstGradleProject\\src\\test\\resources\\chromedriver.exe";
        //          Configure system for driver location in system
        System.setProperty("webdriver.chrome.driver", driverPath);
        //        Create driver object using path from system
        ChromeDriver driver = new ChromeDriver();
        //        Open url using newly created object
        driver.get("https://www.1a.lv/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //        Close driver
        driver.quit();
    }

}

