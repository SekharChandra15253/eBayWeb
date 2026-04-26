package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public void launchBrowser() {}

    public void openEbay() {
        driver.get("https://www.ebay.com");
    }

    public void search(String item) {
        driver.findElement(By.id("gh-ac")).sendKeys(item);
        driver.findElement(By.id("gh-search-btn")).click();
    }
}