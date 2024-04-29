package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

    WebDriver driver;
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.xpath("postal-code");
    By continueButton = By.id("continue");
    By totalSum = By.id("checkout_summary_container");
    By finishButton = By.id("finish");
    By completeOrder = By.id("checkout_complete_container");


    public CheckoutPage (WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName() {
        WebElement firstNameElement = driver.findElement(firstName);
        firstNameElement.sendKeys("Ivan");

    }
    public void enterLastName() {

        WebElement lastNameElement = driver.findElement(lastName);
        lastNameElement.sendKeys("Dimitrov");

    }
    public void enterPostalCode() {

        WebElement postalCodeElement = driver.findElement(postalCode);
        postalCodeElement.sendKeys("1000");

    }
    public void pressContinueButton() {
        WebElement continueButtonElement = driver.findElement(continueButton);
        continueButtonElement.click();

    }
    public void finishButtonClick() {
        WebElement finishBtnElement = driver.findElement(finishButton);
        finishBtnElement.click();

    }

    public void completeOrderText(){
        WebElement completeOrderElement = driver.findElement(completeOrder);
        completeOrderElement.isDisplayed();
    }

    public void totalSum(){

        WebElement totalSumElement = driver.findElement(totalSum);
                totalSumElement.getText();
    }

    public void completeOrderFinal(){

        WebElement completeOrderElement = driver.findElement(completeOrder);
                completeOrderElement.getText();
    }
}

