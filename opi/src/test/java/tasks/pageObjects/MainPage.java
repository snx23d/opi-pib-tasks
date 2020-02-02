package tasks.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.FindBy;
// import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
        // PageFactory.initElements(driver, this);
    }

    // @FindBy(css = "ul#homefeatured > li div.product-image-container > a.quick-view")
    // WebElement productQuickView;
    private final By productQuickView = 
        By.cssSelector("a.quick-view");//mouseover, click

    // @FindBy(css = "a.product_img_link")
    // WebElement productLink;
    private final By productLink = 
        By.cssSelector("a.product_img_link");//click
    
    // @FindBy(css = "ul#homefeatured > li div.product-image-container")
    // WebElement productContainer;
    public final By productContainer = 
        By.cssSelector("ul#homefeatured > li div.product-image-container");//click


    private final By loading = 
        By.cssSelector("div.fancybox-loading > div");//stales





    public void waitForLoading() {
        waitForElementToStale(loading, 10);
    }

    public void showQuickViewOfProduct(int productIndex) {
        List<WebElement> products = findAll(productContainer);
        WebElement container = products.get(productIndex);
        mouseover(container);
        findIn(container, productQuickView).click();
    }
}