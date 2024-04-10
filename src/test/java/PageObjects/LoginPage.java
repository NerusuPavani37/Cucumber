package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public  LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement emailInput;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElement passwordInput;

    @FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
    WebElement loginBtn;

    @FindBy(linkText = "Logout")
    WebElement logoutBtn;


    public void setUserName(String name){
        emailInput.clear();
        emailInput.sendKeys(name);
    }

    public void setPassword(String password){
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void login(){
        loginBtn.click();
    }

    public void logout(){
        logoutBtn.click();
    }
}
