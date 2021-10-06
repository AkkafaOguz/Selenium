package day03;

import com.sun.jdi.event.ThreadStartEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_CssSelector {

//    1. Bir class oluşturun : Locators_css
//2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
//    a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
//    b. Locate email textbox
//    c. Locate password textbox ve
//    d. Locate signin button
//    e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
//    i. Username : testtechproed@gmail.com
//    ii. Password : Test1234!

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/90534/OneDrive/Belgeler/Selenium Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");
        Thread.sleep(1000);

        //<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
        //<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
        //<input type="submit" name="commit" value="Sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">

        WebElement mail = driver.findElement(By.cssSelector("input[type='email']"));
        WebElement sifre = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        WebElement submit = driver.findElement(By.cssSelector("input[data-test='submit']"));

        mail.sendKeys("testtechproed@gmail.com");
        Thread.sleep(1000);
        sifre.sendKeys("Test1234!");
        Thread.sleep(1000);
        submit.click();
        Thread.sleep(1000);
        driver.close();
    }
}
