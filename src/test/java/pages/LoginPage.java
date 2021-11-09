package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // Non-pagefactory style page class elements

//    public WebElement username = Driver.getDriver().findElement(By.id("ctl00_MainContent_username"));
//    public WebElement password = Driver.getDriver().findElement(By.name("ctl00$MainContent$password"));
//    public WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@value='Login']"));


    @FindBy (id = "ctl00_MainContent_username")
    public WebElement username;

    @FindBy (name = "ctl00$MainContent$password")
    public WebElement password;

    @FindBy (xpath = "//input[@value='Login']")
    public WebElement loginButton;



    public void login(String user, String pass){
        username.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
    }









}
