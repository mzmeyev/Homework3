package Homework4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginPagePom extends BasePage{

    private final By ienaktButton = By.xpath("//div[@class='btn-login btn btn-default visible-xs visible-sm']");

    public void pressIenaktButton(){
        driver.findElement(ienaktButton).click();
    }
}
