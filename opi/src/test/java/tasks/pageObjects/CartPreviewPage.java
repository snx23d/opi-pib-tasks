package tasks.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.FindBy;
// import org.openqa.selenium.support.PageFactory;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;

public class CartPreviewPage extends BasePage {

    public CartPreviewPage(WebDriver driver) {
        super(driver);
        // PageFactory.initElements(driver, this);
    }

    private final By popup =
        By.cssSelector("div#layer_cart[style*=\"display: block\"]");

    private final By itemsInCartInfo =
        By.cssSelector("div.layer_cart_cart > h2");//in popup

    private final By proceedToCheckout =
        By.cssSelector("a[rel=\"nofollow\"]");//in popup



    private WebElement getPopup() {
        return waitUntilElementLocated(popup, 10);
    }

    public String getCartInfo() {
        WebElement popup = getPopup();
        return findIn(popup, itemsInCartInfo).getText();
    }

    public void proceedToCheckout() {
        WebElement popup = getPopup();
        findIn(popup, proceedToCheckout).click();
        waitForElementToStale(popup, 10);
    }
}