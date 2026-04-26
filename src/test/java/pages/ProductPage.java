package pages;

import org.openqa.selenium.By;
import utils.WaitUtils;

public class ProductPage extends BasePage {

    By addToCartBtn = By.id("atcBtn_btn_1");

    // Popup close button (from your screenshot)
    By closePopup = By.cssSelector("div.lightbox-dialog__window.lightbox-dialog__window--animate.keyboard-trap--active button[aria-label=\"Close dialog\"]");

    public void addToCart()  {
        WaitUtils.waitForElement(addToCartBtn).click();
        //Thread.sleep(4000);
        closeCartPopup();
    }

    public void closeCartPopup() {
        try {
            Thread.sleep(4000);
            WaitUtils.waitForElement(closePopup).click();
            System.out.println("Popup closed");
        } catch (Exception e) {
            System.out.println("Popup not displayed");
        }
    }
}