package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
    /* utility class that initializes and quits the WebDriver and uses singleton pattern to prevent multiple initializations or quitting
      of the WebDriver
     */

    private static WebDriver driver;

    private Driver(){}


    public static WebDriver getDriver(){
        if(driver == null){

            String browser = ConfigReader.getProperty("browser");

            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    System.out.println("Invalid browser");
                    break;
            }


        }


           return  driver;
    }



    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }

    }



}
