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
public class HomePage {
    WebDriver driver;

    @FindBy(linkText = "Sign in")
    WebElement signInLink;

    public HomePage(WebDriver browser)
    {
        this.driver = browser;
        PageFactory.initElements(browser, this);
    }

    public WebElement getSignInLink()
    {
        return signInLink;
    }

    public void navigateToHomePage(String url)
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Geckodriver\\geckodriver.exe");
        driver.navigate().to(url);
    }

    public SignInPage clickSignInLink()
    {
      WebDriverWait wait = new WebDriverWait(driver, 120);
      wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sign In")));
      getSignInLink().click();
      return new SignInPage(driver);
    }
}
