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
    public void positiveLoginNonPageObjectModel() throws IOException {


        driver.findElement(By.id("ctl00_MainContent_name")).sendKeys(ConfigReader.getProperty("username"));
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys(ConfigReader.getProperty("password"));
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Web Orders");
    }


    @Test
    public void positiveLoginWithPageObjectModel() throws IOException {

        LoginPage loginPage = new LoginPage();
        loginPage.username.sendKeys(ConfigReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("password"));
        loginPage.loginButton.click();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Web Orders");
    }










    @Test
    public void negativeLoginNoCredentials() throws IOException {


        new LoginPage().login("", "");
        Assert.assertNotEquals(driver.getTitle(), "Web Orders");



    }

    @Test
    public void negativeLoginOmitPass() throws IOException {


        new LoginPage().login(ConfigReader.getProperty("username"), "");
        Assert.assertNotEquals(driver.getTitle(), "Web Orders");



    }
}
