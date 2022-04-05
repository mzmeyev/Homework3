package Lecture8;

import Lecture8.pages.BasePage;
import Lecture8.pages.DogsPagePom;
import Lecture8.pages.HomePagePom;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class SeleniumTask {

    BasePage basePage = new BasePage();
    DogsPagePom dogsPagePom = new DogsPagePom();
    HomePagePom homePagePom = new HomePagePom();

    @Test
    public void ssLvTest() {

        basePage.openChromeByUrl("https://www.ss.lv/");
        homePagePom.openPageByCategory("dogs");
        dogsPagePom.setPrice("100", "");
        dogsPagePom.validatePageUrl();
        dogsPagePom.setAge("1", "12");
        dogsPagePom.validateAge("1", "12");
        dogsPagePom.selectRegion("Riga");
        dogsPagePom.pressMekletButton();


        // Wait for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        basePage.closeChrome();

    }


}
