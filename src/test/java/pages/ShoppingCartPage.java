package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Hema on 03-Mar-19.
 */
public class ShoppingCartPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@id = 'mainContent'/descendant::div[@class = 'cartsummary-cta']/button[text() = 'Go to checkout']]")
    WebElement checkoutButton;

    public ShoppingCartPage(WebDriver browser)
    {
        this.driver = browser;
        PageFactory.initElements(browser, this);
    }

    public WebElement getCheckoutButton()
    {
        return checkoutButton;
    }

    public void clickCheckoutButton()
    {
     getCheckoutButton().click();
    }
}
