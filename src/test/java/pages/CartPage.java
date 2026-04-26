package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CartPage extends BasePage {

    public void verifyCart() {
        String count = driver.findElement(By.cssSelector("span.badge.gh-badge[aria-label^=\"Your shopping cart contains\"]")).getText();
        Assert.assertTrue(Integer.parseInt(count) > 0);
    }
}