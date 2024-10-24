package gov.login.secure;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void test1() {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://secure.login.gov/");
        String inputSignInXpath = "//*[@id=\"new_user\"]/lg-submit-button/button";
        By inputSignInBy = By.xpath(inputSignInXpath);
        WebElement signInwebElement = chromeDriver.findElement(inputSignInBy);
        signInwebElement.click();
    }
}
