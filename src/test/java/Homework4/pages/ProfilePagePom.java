package Homework4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import static org.assertj.core.api.Assertions.assertThat;

public class ProfilePagePom extends BasePage{

    private final By clearFirstName = By.xpath("//input[@value='Mihails']");
    private final By clearLastName = By.xpath("//input[@value='Zmejevs']");
    private final By changeFirstName = By.xpath("//input[@id='inputFirstName']");
    private final By changeLastName = By.xpath("//input[@id='inputLastName']");
    private final By birthDay = By.id("bdDay");
    private final By birthMonth = By.id("bdMonth");
    private final By birthYear = By.id("bdYear");
    private final By clearPhoneNumber = By.xpath("//input[@value='29956819']");
    private final By changePhoneNumber = By.xpath("//input[@id='inputMobile']");
    private final By clearCity = By.xpath("//input[@value='Jelgava']");
    private final By changeCity = By.xpath("//input[@id='inputCity']");
    private final By changeGenderButton = By.xpath("//input[@id='genderUnknown']");
    private final By preferredLanguage = By.id("preferredLanguage");

    public void changeFirstAndLastName(String firstname, String lastname){
        driver.findElement(clearFirstName).clear();
        driver.findElement(clearLastName).clear();
        driver.findElement(changeFirstName).sendKeys(firstname);
        driver.findElement(changeLastName).sendKeys(lastname);
    }

    public void validateFirstAndLastName(String firstname, String lastname) {
        String firstNameText = driver.findElement(changeFirstName).getAttribute("value");
        assertThat(firstNameText).isEqualTo(firstname);
        String lastNameText = driver.findElement(changeLastName).getAttribute("value");
        assertThat(lastNameText).isEqualTo(lastname);
    }

    public void selectBirthDay(String day){
        Select newBirthDay = new Select(driver.findElements(birthDay).get(0));
        if ("5".equals(day)) {
            newBirthDay.selectByValue("5");
        } else {
            newBirthDay.selectByValue("0");
        }
    }
    public void validateBirthDay(String day) {
        String dayText = driver.findElement(birthDay).getAttribute("value");
        assertThat(dayText).isEqualTo(day);
    }


    public void selectBirthMonth(String month){
        Select newBirthMonth = new Select(driver.findElements(birthMonth).get(0));
        if ("Marts".equals(month)) {
            newBirthMonth.selectByValue("3");
        } else {
            newBirthMonth.selectByValue("0");
        }
    }

    public void validateBirthMonth(String month) {
        String monthText = driver.findElement(birthMonth).getAttribute("value");
        assertThat(monthText).isEqualTo(month);
    }

    public void selectBirthYear(String year){
        Select newBirthYear = new Select(driver.findElements(birthYear).get(0));
        if ("2000".equals(year)) {
            newBirthYear.selectByValue("2000");
        } else {
            newBirthYear.selectByValue("0");
        }
    }
    public void validateBirthYear(String year) {
        String yearText = driver.findElement(birthYear).getAttribute("value");
        assertThat(yearText).isEqualTo(year);
    }

    public void changePhoneNumber(String phonenumber){
        driver.findElement(clearPhoneNumber).clear();
        driver.findElement(changePhoneNumber).sendKeys(phonenumber);
    }

    public void validatePhoneNumber(String phonenumber) {
        String phoneNumberText = driver.findElement(changePhoneNumber).getAttribute("value");
        assertThat(phoneNumberText).isEqualTo(phonenumber);
    }

    public void changeCurrentCity(String city){
        driver.findElement(clearCity).clear();
        driver.findElement(changeCity).sendKeys(city);
    }

    public void validateCurrentCity(String city) {
        String currentCityText = driver.findElement(changeCity).getAttribute("value");
        assertThat(currentCityText).isEqualTo(city);
    }

    public void pressGenderButton(){
        driver.findElement(changeGenderButton).click();
    }


    public void selectPreferredLanguage(String language){
        Select newPreferredLanguage = new Select(driver.findElements(preferredLanguage).get(0));
        if ("Latviešu".equals(language)) {
            newPreferredLanguage.selectByValue("1002");
        } else if ("Krievu".equals(language)) {
            newPreferredLanguage.selectByValue("1004");
        } else if ("Angļu".equals(language)) {
            newPreferredLanguage.selectByValue("1000");
        }
    }

    public void validatePreferredLanguage(String language) {
        String preferredLanguageText = driver.findElement(preferredLanguage).getAttribute("value");
        assertThat(preferredLanguageText).isEqualTo(language);
    }

}
