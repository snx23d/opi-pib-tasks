package tasks.acceptancetests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

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


import org.openqa.selenium.chrome.ChromeDriver;



import static utils.utils.*;
import tasks.pageObjects.MainPage;




public class Task2Unit {

    private WebDriver driver;

    private MainPage MainPage;

    



    @Before
    public void before(){
        log("Running task 2");

        System.setProperty("webdriver.chrome.driver", "dependencies/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        MainPage = new MainPage(driver);

        driver.get("http://automationpractice.com/index.php");
        MainPage.waitUntilElementLocated(MainPage.productContainer, 10);

    }

    @Test
    public void fff() {
        log("hhhh allll");
    }

    @After
    public void hhh(){
        log("hkkkkkkkkkkkhhallllll");
    }

    
}