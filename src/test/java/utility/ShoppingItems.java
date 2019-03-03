package utility;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by Hema on 03-Mar-19.
 */
public class ShoppingItems {
     HomePage hompage;
     MyAccountPage acctpage;
     SearchResultsPage srchrespage;
     SelectedItemPage selitempage;
     ShoppingCartPage shopcartpage;
     SignInPage signinpage;
     WebDriver driver;

     public void navigationForHomePage(String arg1)
     {
         System.setProperty("webdriver.gecko.driver", "C:\\Geckodriver\\geckodriver.exe");
         driver = new FirefoxDriver();
         hompage = new HomePage(driver);
         hompage.navigateToHomePage(arg1);
     }

     public void enterUsername(String strArg1)
     {
         hompage.clickSignInLink();
         signinpage.enterUsernameInput(strArg1);
     }

     public void enterPassword(String strArg1)
     {
         signinpage.enterPasswordInput(strArg1);
     }

     public void verifySigninPage()
     {
       String titleSigninPage;
       titleSigninPage = driver.getTitle();
       Assert.assertEquals("Sign in or Register | eBay", titleSigninPage);
     }

     public void Signin()
     {
         acctpage = signinpage.clickSubmitButton();
     }

     public void verifyLogin()
     {
         assertTrue(acctpage.getProfileButton().isDisplayed());
     }

     public void searchItem(String item)
     {
         acctpage.enterInputSearchbox(item);
         srchrespage = acctpage.clickSearchButton();
     }

     public void selectResult()
     {
         selitempage = srchrespage.clickFirstSearchResultItem();
     }

     public void addToCart()
     {
         selitempage.clickAddToCartButton();
     }

     public void verifyAddeditem()
     {
         String titleShoppingCartPage;
         titleShoppingCartPage = driver.getTitle();
         Assert.assertEquals("Shopping cart", titleShoppingCartPage);
     }

    public void exit()
    {
        try
        {
            driver.quit();
        }catch (Exception ignore) { }
        driver = null;
    }

    public void navigateShoppingCart()
    {
        shopcartpage = acctpage.clickCartIcon();
    }

    public void checkout()
    {
        shopcartpage.clickCheckoutButton();
    }

    public void verifyCheckout()
    {
        String titleCheckoutPage;
        titleCheckoutPage = driver.getTitle();
        Assert.assertEquals("Checkout", titleCheckoutPage);
    }
}
