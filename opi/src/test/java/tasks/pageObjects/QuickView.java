package tasks.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.FindBy;
// import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.WebElement;

public class QuickView extends BasePage {



    public QuickView(WebDriver driver) {
        super(driver);
        // PageFactory.initElements(driver, this);
    }

    private final int iframeTimeout = 30;

    private final By iframe = 
        By.cssSelector("iframe");//click

    private final By addToCart = 
        By.cssSelector("button[type=\"submit\"]");//click

    private final By productName =
        By.cssSelector("'h1[itemprop=\"name\"]");



    public void switchToFrame() {
        WebDriverWait wait = new WebDriverWait(driver, iframeTimeout);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
    }

    public void addToCart() {
        find(addToCart).click();
        super.waitForElementToStale(iframe, iframeTimeout);

    }

    public String getProductName() {
        return find(productName).getText();
    }
}