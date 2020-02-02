package tasks.acceptancetests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.By;
// import org.openqa.selenium.Keys;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.support.FindBy;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.PageFactory;
// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.interactions.Action;
// import org.openqa.selenium.interactions.Actions;



import org.openqa.selenium.chrome.ChromeDriver;



import static utils.utils.*;
import tasks.pageObjects.MainPage;
import tasks.pageObjects.QuickView;
import tasks.pageObjects.CartPreviewPage;




public class Task2Unit {

    private WebDriver driver;

    private final int productNumberToAddToCart = 2;
    private String productName;



    @Before
    public void before(){
        log("Running task 2");

        System.setProperty("webdriver.chrome.driver", "dependencies/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

    }

    @Test
    public void navigateToMainPage() {
        log("Navigate to site main page");
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    public void clickQuickView() {
        log("Quick view 2nd product details and click it");
        MainPage mainPage = new MainPage(driver);
        mainPage.waitUntilElementLocated(mainPage.productContainer, 10);
        List<WebElement> products = mainPage.findAll(mainPage.product);
        mainPage.mouseover(products.get(this.productNumberToAddToCart));
        mainPage.waitUntilElementVisible(mainPage.productLink, 5).click();
        mainPage.waitForLoading();
    }

    @Test
    public void addProductToCart() {
        log("Add the product to cart");
        QuickView quickView = new QuickView(driver);
        quickView.switchToFrame();
        productName = quickView.getProductName();
        quickView.addToCart();
        quickView.switchToDefaultPage();
    }

    @Test
    public void checkCartPreview() {
        log("Check cart preview");
        CartPreviewPage cartPreview = new CartPreviewPage(driver);
        String cartInfo = cartPreview.getCartInfo();
        String expected = "There is 1 item in your cart.";
        cartPreview.proceedToCheckout();
        Assert.assertEquals(expected, cartInfo);
    }

    @Test
    public void ffffffffff() {
        log("Go to checkout");
        
    }

    @After
    public void hhh(){
        
    }

    
}