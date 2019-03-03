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
public class MyAccountPage {
    WebDriver driver;

    @FindBy(xpath = "//header/descendant::div[@id = 'gh-ac-box2']/input[@id = 'gh-ac'][@class = 'gh-tb ui-autocomplete-input']")
    WebElement inputSearchbox;

    @FindBy(xpath = "//header/input[@class = 'btn btn-prim gh-spr']/[text() = Search]")
    WebElement searchButton;

    @FindBy(xpath = "//header/div[@id = 'gh-top'][@class = 'gh-hide-if-nocss']/button[@class = 'gh-ua gh-control']")
    WebElement profileButton;

    @FindBy(xpath = "//div[@id = 'gh-top']/div[@id = 'gh-eb-u-o']/button[@id = 'gh-ug']/descendant::li[@id = 'gh-uo']/a[text() = 'Sign out']")
    WebElement signOutLink;

    @FindBy(xpath = "//header/div[@id = 'gh-top']/descendant::ul[@id = 'gh-eb']/li[@id = 'gh-cart']/a[@id = 'gh-cart-1']/i[@id = gh-cart-i]")
    WebElement cartIcon;

    public MyAccountPage(WebDriver browser)
    {
      this.driver = browser;
      PageFactory.initElements(browser, this);
    }

    public WebElement getInputSearchbox()
    {
      return inputSearchbox;
    }

    public WebElement getSearchButton()
    {
        return searchButton;
    }

    public WebElement getCartIcon()
    {
        return cartIcon;
    }

    public WebElement getProfileButton()
    {
        return profileButton;
    }

    public WebElement getSignOutLink()
    {
        WebDriverWait wait1 = new WebDriverWait(driver, 120);
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header/div[@id = 'gh-top'][@class = 'gh-hide-if-nocss']/button[@class = 'gh-ua gh-control']")));
        profileButton.click();
        WebDriverWait wait2 = new WebDriverWait(driver, 120);
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id = 'gh-top']/div[@id = 'gh-eb-u-o']/button[@id = 'gh-ug']/descendant::li[@id = 'gh-uo']/a[text() = 'Sign out']")));
        return signOutLink;
    }

    public void enterInputSearchbox(String searchitem)
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header/descendant::div[@id = 'gh-ac-box2']/input[@id = 'gh-ac'][@class = 'gh-tb ui-autocomplete-input']")));
        getInputSearchbox().sendKeys(searchitem);

    }

    public SearchResultsPage clickSearchButton()
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header/input[@class = 'btn btn-prim gh-spr']/[text() = Search]")));
        getSearchButton().click();
        return new SearchResultsPage(driver);
    }

    public void clickSignOutLink()
    {
        getSignOutLink().click();
    }

    public ShoppingCartPage clickCartIcon()
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header/div[@id = 'gh-top']/descendant::ul[@id = 'gh-eb']/li[@id = 'gh-cart']/a[@id = 'gh-cart-1']/i[@id = gh-cart-i]")));
        getCartIcon().click();
        return new ShoppingCartPage(driver);
    }
}
