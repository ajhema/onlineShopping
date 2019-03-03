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
public class SearchResultsPage {
    WebDriver driver;

    @FindBy(xpath = "//div[@id = 'srp-river-results']/li[@class = 'srp-river-results-listing1']/descendant::h3[@class = 's-item_title']")
    WebElement firstSearchResultItem;

    public SearchResultsPage(WebDriver browser)
    {
        this.driver = browser;
        PageFactory.initElements(browser, this);
    }

    public WebElement getFirstSearchResultItem()
    {
        return firstSearchResultItem;
    }

    public SelectedItemPage clickFirstSearchResultItem()
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id = 'srp-river-results']/li[@class = 'srp-river-results-listing1']/descendant::h3[@class = 's-item_title']")));
        getFirstSearchResultItem().click();
        return new SelectedItemPage(driver);
    }
}
