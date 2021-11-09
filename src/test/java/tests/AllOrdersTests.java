package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AllOrdersPage;
import pages.LoginPage;
import utilities.ConfigReader;

import java.util.List;

public class AllOrdersTests extends  TestBase{

    LoginPage loginPage;
    AllOrdersPage allOrdersPage;



    @Test
    public void verifyCheckAllButton(){
        driver.get(ConfigReader.getProperty("url"));

        loginPage = new LoginPage();

        loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));

        allOrdersPage = new AllOrdersPage();
        allOrdersPage.checkAllButton.click();

        for (WebElement checkbox : allOrdersPage.checkboxes) {
            Assert.assertTrue(checkbox.isSelected());
        }
    }

    @Test
    public void verifyCheckAllButton2(){
        driver.get(ConfigReader.getProperty("url"));

        loginPage = new LoginPage();

        loginPage.login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));



       allOrdersPage = new AllOrdersPage();
       allOrdersPage.checkAllButton.click();

        for (WebElement checkbox : allOrdersPage.checkboxes) {
            Assert.assertTrue(checkbox.isSelected());
        }
    }
}
