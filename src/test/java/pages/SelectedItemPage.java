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
public class SelectedItemPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@id = 'mainContent']/descendant::div[@class = 'nonActPanel']/div[@class = 'actPanel vi-noborder']/div[@class = 'u-cb']/span/a[text() = 'Add to cart']")
    WebElement addToCartButton;

    @FindBy(xpath = "//div[@class = 'adndesc addon-overlay-body']/descendant::div[@class = 'adnactions']/div[@class = 'addonBtn']/button[text() = 'No thanks']")
    WebElement noThanksButton;

    public SelectedItemPage(WebDriver browser)
    {
        this.driver = browser;
        PageFactory.initElements(browser, this);
    }

    public WebElement getAddToCartButton()
    {
        return addToCartButton;
    }

    public WebElement getNoThanksButton()
    {
        return noThanksButton;
    }

    public void clickAddToCartButton()
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id = 'mainContent']/descendant::div[@class = 'nonActPanel']/div[@class = 'actPanel vi-noborder']/div[@class = 'u-cb']/span/a[text() = 'Add to cart']")));
        getAddToCartButton().click();
    }

    public void clickNoThanksButton()
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class = 'adndesc addon-overlay-body']/descendant::div[@class = 'adnactions']/div[@class = 'addonBtn']/button[text() = 'No thanks']")));
        getNoThanksButton().click();
    }
}
