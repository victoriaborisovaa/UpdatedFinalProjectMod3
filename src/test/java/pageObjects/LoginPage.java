package pageObjects;

import beforeAfter.BeforeAfter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class LoginPage extends BeforeAfter {
    WebDriver driver;

    By usernameLog = By.id("user-name");
    By passwordLog = By.id("password");
    By loginButton = By.id("login-button");



    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        WebElement loginInput = driver.findElement(usernameLog);
        loginInput.sendKeys("standard_user");
    }

    public void enterPassword (String password) {
        WebElement passInput = driver.findElement(passwordLog);
        passInput.sendKeys("secret_sauce");


    }

    public void clickOnButton() {
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("contents_wrapper")));


    }
}
