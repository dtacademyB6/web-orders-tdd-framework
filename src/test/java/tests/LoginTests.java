package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilitities.ConfigReader;

import java.io.IOException;

public class LoginTests extends TestBase{


    @Test
    public void positiveLogin() throws IOException {

        driver.get(ConfigReader.getProperty("url"));
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(
                ConfigReader.getProperty("username"), Keys.TAB,
                ConfigReader.getProperty("password"), Keys.ENTER);
        Assert.assertEquals(driver.getTitle(), "Web Orders");
    }


    @Test
    public void negativeLoginNoCredentials() throws IOException {

        driver.get(ConfigReader.getProperty("url"));
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(
                "", Keys.TAB,
                "", Keys.ENTER);
        Assert.assertNotEquals(driver.getTitle(), "Web Orders");

    }

    @Test
    public void negativeLoginOmitPass() throws IOException {

        driver.get(ConfigReader.getProperty("url"));
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(
                ConfigReader.getProperty("username"), Keys.TAB,
                "", Keys.ENTER);
        Assert.assertNotEquals(driver.getTitle(), "Web Orders");



    }
}
