package Homework4;

import Homework4.pages.LoginPagePom;
import Homework4.pages.BasePage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class SeleniumTask {

    BasePage basePage = new BasePage();
    LoginPagePom loginPagePom = new LoginPagePom();

    @Test
    public void Homework4() {

        basePage.openChromeByUrl("https://www.forumcinemas.lv/");
        loginPagePom.pressIenaktButton();


        // Wait for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        basePage.closeChrome();

    }


}
