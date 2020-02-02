package tasks.acceptancetests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



import org.openqa.selenium.chrome.ChromeDriver;



import static utils.utils.*;
import tasks.pageObjects.MainPage;
import tasks.pageObjects.QuickView;




public class Task2Unit {

    private WebDriver driver;

    private MainPage mainPage;
    private QuickView quickView;


    private final int productNumberToAddToCart = 2;
    



    @Before
    public void before(){
        log("Running task 2");

        System.setProperty("webdriver.chrome.driver", "dependencies/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        mainPage = new MainPage(driver);
        quickView = new QuickView(driver);
        

    }

    @Test
    public void navigateToMainPage() {
        log("Navigate to site main page");
        driver.get("http://automationpractice.com/index.php");
        mainPage.waitUntilElementLocated(mainPage.productContainer, 10);
    }

    @Test
    public void navigateToMainPage1() {
        log("Navigate to site main page");
        driver.get("http://automationpractice.com/index.php");
        mainPage.waitUntilElementLocated(mainPage.productContainer, 10);
    }

    @Test
    public void clickQuickView() {
        log("Quick view 2nd product details and click it");
        List<WebElement> products = mainPage.findAll(mainPage.product);
        mainPage.mouseover(products.get(this.productNumberToAddToCart));
        mainPage.waitUntilElementVisible(mainPage.productLink, 5).click();
        mainPage.waitForLoading();
    }

    @Test
    public void navigateToMa() {

    }

    @Test
    public void navigateToMai() {

    }

    @After
    public void hhh(){
        
    }

    
}