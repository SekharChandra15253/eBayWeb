package pages;

import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

public class BasePage {
    protected WebDriver driver = DriverFactory.getDriver();
}