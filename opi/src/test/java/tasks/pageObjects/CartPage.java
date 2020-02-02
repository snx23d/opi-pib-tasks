package tasks.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.FindBy;
// import org.openqa.selenium.support.PageFactory;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
        // PageFactory.initElements(driver, this);
    }

    private final By cartSummaryTable =
        By.cssSelector("table#cart_summary");

    private final By tableRow =
        By.cssSelector("tbody > tr");

    private final By productName =
        By.cssSelector("p.product-name");

    private final By quantityInput =
        By.cssSelector("input.cart_quantity_input");


    private List<WebElement> getTableRows() {
        WebElement table = find(cartSummaryTable);

        return findAllIn(table, tableRow);
    }
    
    public int getNumberOfRows() {

        return getTableRows().size();
    }

    public String getProductNameFromRow(int rowNumber) {
        List<WebElement> rows = getTableRows();
        WebElement productNameLabel = findIn(rows.get(rowNumber), productName);

        return productNameLabel.getText();
    }

    public int getProductQuantityFromRow(int rowNumber) {
        List<WebElement> rows = getTableRows();
        WebElement quantity = findIn(rows.get(rowNumber), quantityInput);
        
        return Integer.parseInt(quantity.getAttribute("value"));
    }
}