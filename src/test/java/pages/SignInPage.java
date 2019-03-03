package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Hema on 03-Mar-19.
 */
public class SignInPage {
    WebDriver driver;

    @FindBy(name = "userid")
    WebElement usernameInputTextField;

    @FindBy(name = "pass")
    WebElement passwordInputTextField;

    @FindBy(id = "sgnBt")
    WebElement submitButton;

    public SignInPage(WebDriver browser)
    {
        this.driver = browser;
        PageFactory.initElements(browser, this);
    }

    public WebElement getUsernameInputTextField()
    {
        return usernameInputTextField;
    }

    public WebElement getPasswordInputTextField()
    {
        return passwordInputTextField;
    }

    public WebElement getSubmitButton()
    {
        return submitButton;
    }

    public void enterUsernameInput(String username)
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userid")));
        getUsernameInputTextField().sendKeys(username);
    }

    public void enterPasswordInput(String password)
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("pass")));
        getPasswordInputTextField().sendKeys(password);
    }
    public MyAccountPage clickSubmitButton()
    {
        getSubmitButton().click();
        return new MyAccountPage(driver);
    }

}
