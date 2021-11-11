package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

import java.util.List;

public class AllOrdersPage {

    @FindBy (linkText = "View all products")
    public WebElement allProductsLink;

    public AllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (id = "ctl00_MainContent_btnCheckAll")
    public WebElement checkAllButton;

    @FindBy (xpath = "//input[@type='checkbox']")
    public List<WebElement> checkboxes;



}
