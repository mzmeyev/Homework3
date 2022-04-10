package Homework4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginPagePom extends BasePage{

    private final By ienaktButton = By.xpath("//div[@class='btn-login btn btn-default popover-link hidden-xs hidden-sm']");
    private final By enterUsername = By.xpath("//input[@placeholder='Lietotājvārds']");
    private final By enterPassword = By.xpath("//input[@placeholder='Parole']");
    private final By submitButton = By.xpath("//button[@class='btn btn-primary btn-lg']");
    private final By profilePageButton = By.xpath("//a[@class='navbar-link']");
    private final By editProfileButton = By.xpath("//a[@class='margin-bottom-quarter inline-block']");


    public void pressIenaktButton(){
        driver.findElement(ienaktButton).click();
    }

    public void enterUsernameAndPassword(String username, String password){
        driver.findElement(enterUsername).sendKeys(username);
        driver.findElement(enterPassword).sendKeys(password);
    }

    public void pressSubmitButton(){
        driver.findElement(submitButton).click();
    }

    public void pressProfilePageButton(){
        driver.findElement(profilePageButton).click();
    }

    public void pressEditProfileButton(){
        driver.findElement(editProfileButton).click();
    }

}
