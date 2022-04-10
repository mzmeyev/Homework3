package Homework4;

import Homework4.pages.LoginPagePom;
import Homework4.pages.BasePage;
import Homework4.pages.ProfilePagePom;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class SeleniumTask {

    BasePage basePage = new BasePage();
    LoginPagePom loginPagePom = new LoginPagePom();
    ProfilePagePom profilePagePom = new ProfilePagePom();

    @Test
    public void Homework4() {

        basePage.openChromeByUrl("https://www.forumcinemas.lv/");
        loginPagePom.pressIenaktButton();
        loginPagePom.enterUsernameAndPassword("akdmisha", "Homework4Password");
        loginPagePom.pressSubmitButton();
        loginPagePom.pressProfilePageButton();
        loginPagePom.pressEditProfileButton();
        basePage.scrollDownOnce();
        profilePagePom.changeFirstAndLastName("test", "this is a test");
        profilePagePom.validateFirstAndLastName("test", "this is a test");
        profilePagePom.selectBirthDay("5");
        profilePagePom.validateBirthDay("5");
        profilePagePom.selectBirthMonth("Marts");
        profilePagePom.validateBirthMonth("3");
        profilePagePom.selectBirthYear("2000");
        profilePagePom.validateBirthYear("2000");
        profilePagePom.changePhoneNumber("42069");
        profilePagePom.validatePhoneNumber("42069");
        profilePagePom.changeCurrentCity("Riga");
        profilePagePom.validateCurrentCity("Riga");
        profilePagePom.pressGenderButton();
        basePage.scrollDownTwice();
        profilePagePom.selectPreferredLanguage("Krievu");
        profilePagePom.validatePreferredLanguage("1004");

        // Wait for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        basePage.closeChrome();

    }


}
