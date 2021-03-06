package tasks.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.support.FindBy;
// import org.openqa.selenium.Keys;
// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Selenium wrapper and adapter container
 */
public class BasePage {

    WebDriver driver;
    final int defaultTimeout = 5;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Waits for an element given by bySelector to be located.
     * 
     * @param bySelector
     * @param timeout
     * @return WebElement
     */
    public WebElement waitUntilElementLocated(By bySelector, int timeout) {
        WebDriverWait wait = new WebDriverWait(this.driver, timeout);
        return wait.until(ExpectedConditions.presenceOfElementLocated(bySelector));
    }

    /**
     * Waits for an element given by bySelector to be visible.
     * 
     * @param bySelector
     * @param timeout
     * @return WebElement
     */
    public WebElement waitUntilElementVisible(By bySelector, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(bySelector));
    }

    /**
     * 
     * @param bySelector
     */
    public void mouseover(By bySelector) {
        WebElement element = waitUntilElementVisible(bySelector, defaultTimeout);
        new Actions(driver).moveToElement(element).perform();
    }

    /**
     * 
     * @param WebElement
     */
    public void mouseover(WebElement element) {
        new Actions(driver).moveToElement(element).perform();
    }

    /**
     * Waits until element becomes stale
     * 
     * @param bySelector
     * @param timeout
     */
    public void waitForElementToStale(By bySelector, int timeout) {
        WebElement element = waitUntilElementLocated(bySelector, timeout);
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.stalenessOf(element));
    }

    /**
     * Waits until element becomes stale
     * @param element
     * @param timeout
     */
    public void waitForElementToStale(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.stalenessOf(element));
    }

    public List<WebElement> findAll(By bySelector) {
        return driver.findElements(bySelector);
    }

    public WebElement find(By bySelector) {
        return driver.findElement(bySelector);
    }

    public WebElement findIn(WebElement element, By bySelector) {
        return element.findElement(bySelector);
    }

    public List<WebElement> findAllIn(WebElement element, By bySelector) {
        return element.findElements(bySelector);
    }

    public void switchToDefaultPage() {
        driver.switchTo().defaultContent();
    }


}