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



        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(ConfigReader.getProperty("username"));

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys(ConfigReader.getProperty("password"));

        driver.findElement(By.xpath("//input[@value='Login']")).click();

        Assert.assertEquals(Driver.getDriver().getTitle(), "Web Orderz");

    }


    @Test
    public void positiveLoginWithPageObjectModel() throws IOException {

        LoginPage loginPage = new LoginPage();

        logger.info("Sending the username");
        loginPage.username.sendKeys(ConfigReader.getProperty("username") );

        logger.info("Sending the password");
        loginPage.password.sendKeys(ConfigReader.getProperty("password")+"er");

        logger.info("Clicking on login");
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

        logger.info("Logging in with no password");
        new LoginPage().login(ConfigReader.getProperty("username"), "");
        Assert.assertNotEquals(driver.getTitle(), "Web Orders");



    }

    @Test
    public void positiveLoginNonPageObjectModel2() throws IOException {



        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(ConfigReader.getProperty("username"));

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys(ConfigReader.getProperty("password"));

        driver.findElement(By.xpath("//input[@value='Login']")).click();

        Assert.assertEquals(Driver.getDriver().getTitle(), "Web Orderz");

    }


    @Test
    public void positiveLoginWithPageObjectModel2() throws IOException {

        LoginPage loginPage = new LoginPage();

        logger.info("Sending the username");
        loginPage.username.sendKeys(ConfigReader.getProperty("username") );

        logger.info("Sending the password");
        loginPage.password.sendKeys(ConfigReader.getProperty("password")+"er");

        logger.info("Clicking on login");
        loginPage.loginButton.click();

        Assert.assertEquals(Driver.getDriver().getTitle(), "Web Orders");

    }










    @Test
    public void negativeLoginNoCredentials2() throws IOException {

        new LoginPage().login("", "");
        Assert.assertNotEquals(driver.getTitle(), "Web Orders");



    }

    @Test
    public void negativeLoginOmitPass2() throws IOException {

        logger.info("Logging in with no password");
        new LoginPage().login(ConfigReader.getProperty("username"), "");
        Assert.assertNotEquals(driver.getTitle(), "Web Orders");



    }

    @Test
    public void positiveLoginNonPageObjectModel3() throws IOException {



        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(ConfigReader.getProperty("username"));

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys(ConfigReader.getProperty("password"));

        driver.findElement(By.xpath("//input[@value='Login']")).click();

        Assert.assertEquals(Driver.getDriver().getTitle(), "Web Orderz");

    }


    @Test
    public void positiveLoginWithPageObjectModel3() throws IOException {

        LoginPage loginPage = new LoginPage();

        logger.info("Sending the username");
        loginPage.username.sendKeys(ConfigReader.getProperty("username") );

        logger.info("Sending the password");
        loginPage.password.sendKeys(ConfigReader.getProperty("password")+"er");

        logger.info("Clicking on login");
        loginPage.loginButton.click();

        Assert.assertEquals(Driver.getDriver().getTitle(), "Web Orders");

    }










    @Test
    public void negativeLoginNoCredentials3() throws IOException {

        new LoginPage().login("", "");
        Assert.assertNotEquals(driver.getTitle(), "Web Orders");



    }

    @Test
    public void negativeLoginOmitPass3() throws IOException {

        logger.info("Logging in with no password");
        new LoginPage().login(ConfigReader.getProperty("username"), "");
        Assert.assertNotEquals(driver.getTitle(), "Web Orders");



    }
}
