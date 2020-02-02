package tasks.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.FindBy;
// import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
        // PageFactory.initElements(driver, this);
    }

    private final By popup =
        By.cssSelector("div#layer_cart[style*=\"display: block\"]");


}