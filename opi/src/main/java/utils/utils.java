package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class utils {

    public static void log(String str) {
        System.out.println(str);
    }

    public static void log(Object obj) {
        System.out.println(obj);
    }

    public static void log(int x) {
        System.out.println(x);
    }

    public static void highlightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }
}