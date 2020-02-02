package tasks.guice.provider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import javax.inject.Provider;
// import java.util.Optional;

// public class WebDriverProvider implements Provider<WebDriver> {

    // private int counter;

    // @Override
    // public WebDriver get() {
    //     WebDriver driver = null;
    //     // String browser =
    //     // Optional.ofNullable(System.getProperty("browser")).orElse("");
    //     String browser = "chrome";
    //     System.setProperty("webdriver.chrome.driver", "dependencies/chromedriver.exe");

    //     // System.out.println(
    //     // "webdriver.chrome.driver"
    //     // .concat(
    //     // System.getProperty("webdriver.chrome.driver")
    //     // )
    //     // );

    //     switch (browser.toLowerCase()) {
    //     case "ie":
    //     case "internet explorer":
    //         driver = new InternetExplorerDriver();
    //         break;
    //     case "firefox":
    //         driver = new FirefoxDriver();
    //         break;
    //     case "safari":
    //         driver = new SafariDriver();
    //         break;
    //     case "opera":
    //         driver = new OperaDriver();
    //         break;
    //     case "phantomjs":
    //     case "headless":
    //         driver = new PhantomJSDriver();
    //         break;
    //     case "remote":
    //         driver = new RemoteWebDriver(new DesiredCapabilities());
    //         break;
    //     case "chrome":
    //             driver = new ChromeDriver();
    //             break;

    //         default:
    //             driver = new ChromeDriver();
    //     }

    //     return driver;
    // }
// }