package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProductsPage {

    public ProductsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//table[@class='ProductsTable']//th")
    public List<WebElement> columnNames;


    @FindAll(
            {
            @FindBy(xpath = "//table[@class='ProductsTable']//tr[2]//td[2]" ),
            @FindBy(xpath = "//table[@class='ProductsTable']//tr[2]//td[3]" )
            }
        )
    public List<WebElement> myMoney;

    @FindAll(
            {
                    @FindBy(xpath = "//table[@class='ProductsTable']//tr[3]//td[2]" ),
                    @FindBy(xpath = "//table[@class='ProductsTable']//tr[3]//td[3]" )
            }
    )
    public List<WebElement> familyAlbum;


    @FindAll(
            {
                    @FindBy(xpath = "//table[@class='ProductsTable']//tr[4]//td[2]" ),
                    @FindBy(xpath = "//table[@class='ProductsTable']//tr[4]//td[3]" )
            }
    )
    public List<WebElement> scrrenSaver;




}
