package pageObjects;

import beforeAfter.BeforeAfter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HamburgerButtonHomePage extends BeforeAfter {
    WebDriver driver;

    By hamburgerButton = By.id("menu_button_container");
    By allItemsBtn = By.id("inventory_sidebar_link");
    By aboutBtn = By.id("about_sidebar_link");
    By logoutBtn = By.id("logout_sidebar_link");
    By resetAppStateBtn = By.id("reset_sidebar_link");

    public HamburgerButtonHomePage (WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnHamburgerButton() {
        WebElement hamburgerBtnElement = driver.findElement(hamburgerButton);
        hamburgerBtnElement.click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_button_container")));
    }
     public void clickOnAllItemsBtn() {

        WebElement allItemsBtnElement = driver.findElement(allItemsBtn);
        allItemsBtnElement.click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
     }

     public void clickOnAboutButton(){
         WebElement aboutBtnElement = driver.findElement(aboutBtn);
         aboutBtnElement.click();
         WebDriverWait wait = new WebDriverWait(driver, 3);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[7]")));
     }
     public void clickOnLogoutBtn(){
         WebElement logoutBtnElement = driver.findElement(logoutBtn);
         logoutBtnElement.click();
         WebDriverWait wait = new WebDriverWait(driver, 3);
         wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/"));
     }

     public void clickOnResetAppStateBtn() {
        WebElement resetAppStateBtnElement = driver.findElement(resetAppStateBtn);
        resetAppStateBtnElement.click();
     }



}
