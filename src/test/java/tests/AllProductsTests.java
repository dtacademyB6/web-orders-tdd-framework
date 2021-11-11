package tests;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AllOrdersPage;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.SeleniumUtils;

import java.util.*;

public class AllProductsTests extends TestBase{


    @Test
    public void verifyColumnNames(){

        LoginPage loginPage = new LoginPage();
        loginPage.positiveLogin();
        AllOrdersPage allOrdersPage = new AllOrdersPage();
        allOrdersPage.allProductsLink.click();
        List<String> expected = Arrays.asList("Product name", "Price", "Discount");
        ProductsPage productsPage = new ProductsPage();
        List<String> actual = SeleniumUtils.getElementsText(productsPage.columnNames);
        Assert.assertEquals(actual, expected);



    }


    @Test
    public void verifyProductDetails(){

        new LoginPage().positiveLogin();
        new AllOrdersPage().allProductsLink.click();
        Map<String, List<String>> expected = new HashMap<>();

        expected.put("MyMoney", Arrays.asList("$100", "10%"));
        expected.put("FamilyAlbum", Arrays.asList("$80", "15%"));
        expected.put("ScreenSaver", Arrays.asList("$20", "11%"));

        ProductsPage productsPage = new ProductsPage();

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(SeleniumUtils.getElementsText(productsPage.myMoney), expected.get("MyMoney"));
        softAssert.assertEquals(SeleniumUtils.getElementsText(productsPage.scrrenSaver), expected.get("ScreenSaver"));
        softAssert.assertEquals(SeleniumUtils.getElementsText(productsPage.familyAlbum), expected.get("FamilyAlbum"));

        softAssert.assertAll();





    }
}
