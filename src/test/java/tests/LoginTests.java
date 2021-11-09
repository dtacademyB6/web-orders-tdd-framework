package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.io.IOException;

public class LoginTests extends TestBase{


    @Test
    public void positiveLogin() throws IOException {

        driver.get(ConfigReader.getProperty("url"));
        driver.findElement(By.id("ctl00_MainContent_name")).sendKeys(ConfigReader.getProperty("username"));
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys(ConfigReader.getProperty("password"));
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Web Orders");
    }


    @Test
    public void positiveLoginWithPageObjectModel() throws IOException {

        LoginPage loginPage = new LoginPage();

        driver.get(ConfigReader.getProperty("url"));
        loginPage.username.sendKeys(ConfigReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.loginButton.click();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Web Orders");
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
