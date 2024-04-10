package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
   public WebDriver Idriver;

   public AddCustomerPage(WebDriver rdriver){
       Idriver=rdriver;
       PageFactory.initElements(Idriver,this);
   }

   @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement emailInput;

   @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElement passwordInput;



    @FindBy(xpath = "//*[@id=\"FirstName\"]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElement lastName;


}
