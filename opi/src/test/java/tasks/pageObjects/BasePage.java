package tasks.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class BasePage {

    private WebDriver driver;
    // final int timeout = 10;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    /**
     * 
     * @param bySelector
     * @param timeout
     * @return WebElement
     */
    public WebElement waitUntilElementLocated(By bySelector, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.presenceOfElementLocated(bySelector));
    }


}