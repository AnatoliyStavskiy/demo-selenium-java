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

    @Test
    public void test2() {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://secure.login.gov/");

        String inputEmailXpath = "//*[@id=\"user_email\"]";
        By inputEmailBy = By.xpath(inputEmailXpath);
        WebElement inputEmailwebElement = chromeDriver.findElement(inputEmailBy);
        inputEmailwebElement.sendKeys("testA@test.com");

        String inputSignInXpath = "//*[@id=\"new_user\"]/lg-submit-button/button";
        By inputSignInBy = By.xpath(inputSignInXpath);
        chromeDriver.findElement(inputSignInBy);
        WebElement inputSignInwebElement = chromeDriver.findElement(inputSignInBy);
        inputSignInwebElement.click();
    }

    @Test
    public void test3(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://secure.login.gov/");

        String inputEmailXpath = "//*[@id=\"user_email\"]";
        By inputEmailBy = By.xpath(inputEmailXpath);
        WebElement EmailWebElement = chromeDriver.findElement(inputEmailBy);
        EmailWebElement.sendKeys("testB@test.com");
        String inputPasswordXpath = "/html/body/main/div/form/lg-password-toggle/lg-validated-field/div/input";
        By inputPasswordBy = By.xpath(inputPasswordXpath);
        WebElement PasswordWebElement = chromeDriver.findElement(inputPasswordBy);
        PasswordWebElement.sendKeys("a1S@d3F$");
        String inputSignInXpath = "//*[@id=\"new_user\"]/lg-submit-button/button";
        By inputSignInBy = By.xpath(inputSignInXpath);
        chromeDriver.findElement(inputSignInBy);
        WebElement inputSignInwebElement = chromeDriver.findElement(inputSignInBy);
        inputSignInwebElement.click();
    }
}
