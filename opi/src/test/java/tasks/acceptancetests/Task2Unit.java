package tasks.acceptancetests;

import java.util.List;
import java.util.concurrent.TimeUnit;

// import org.junit.After;
import org.junit.AfterClass;
// import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runners.MethodSorters;

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
import tasks.pageObjects.CartPage;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Task2Unit {

    private static WebDriver driver;

    private final String testedURL = "http://automationpractice.com/index.php";
    private final int productNumberToAddToCart = 2;
    private final int expectedProductQuantity = 1;
    private static String productName;

    @BeforeClass
    public static void before() {
        log("Running task 2");

        System.setProperty("webdriver.chrome.driver", "dependencies/chromedriver.exe");

        /*
         * For som reason this creates 2 separate instances of the browser where only
         * one of them is controlled by selenium. Also chromedriver doesn't quit when
         * process ends. I tried to fix this but was unable to do so. This doesn't
         * happen with JS Selenium (selenium-webdriver npm package).
         */
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        // explicit waits are used so no implicit wait timeout config
    }

    @Test
    public void aa_navigateToMainPage() {
        log("Navigate to site main page");
        driver.get(testedURL);
    }

    @Test
    public void ab_clickQuickView() {
        log("Quick view 2nd product details and click it");
        MainPage mainPage = new MainPage(driver);
        mainPage.waitUntilElementLocated(mainPage.productContainer, 10);
        mainPage.showQuickViewOfProduct(productNumberToAddToCart);
        mainPage.waitForLoading();
    }

    @Test
    public void ac_addProductToCart() {
        log("Add the product to cart");
        QuickView quickView = new QuickView(driver);
        quickView.switchToFrame();
        productName = quickView.getProductName();
        quickView.addToCart();
        quickView.waitForQuickViewToDisappear();
    }

    @Test
    public void ad_checkCartPreview() {
        log("Check cart preview");
        CartPreviewPage cartPreview = new CartPreviewPage(driver);
        String cartInfo = cartPreview.getCartInfo();
        String expected = "There is 1 item in your cart.";
        cartPreview.proceedToCheckout();
        Assert.assertEquals(expected, cartInfo);
    }

    @Test
    public void ae_checkCart() {
        log("Check cart");
        CartPage cart = new CartPage(driver);

        int numberOfProductsIncart = cart.getNumberOfRows();
        Assert.assertEquals(1, numberOfProductsIncart);

        String cartProductName = cart.getProductNameFromRow(0);
        Assert.assertEquals(productName, cartProductName);

        int productQuantity = cart.getProductQuantityFromRow(0);
        Assert.assertEquals(expectedProductQuantity, productQuantity);
    }

    @AfterClass
    public static void finish(){
        log("Test ended, clean up");
        driver.quit();
    }

    
}