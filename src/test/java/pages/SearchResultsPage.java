package pages;

import org.openqa.selenium.By;
import utils.WaitUtils;

public class SearchResultsPage extends BasePage {

    public void clickFirstItem() {
        WaitUtils.waitForElement(By.cssSelector("ul.srp-results li:first-child .s-card__link"));
        driver.findElements(By.cssSelector("ul.srp-results li:first-child .s-card__link")).get(0).click();

        // switch to new tab
        for (String win : driver.getWindowHandles()) {
            driver.switchTo().window(win);
        }
    }
}