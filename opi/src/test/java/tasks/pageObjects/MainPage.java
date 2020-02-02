package tasks.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public final By productQuickView = 
        By.cssSelector("ul#homefeatured > li div.product-image-container > a.quick-view");//mouseover, click

    public final By productLink = 
        By.cssSelector("ul#homefeatured > li div.product-image-container > a.product_img_link");//click
    
    public final By productContainer = 
        By.cssSelector("ul#homefeatured > li div.product-image-container");//click
}