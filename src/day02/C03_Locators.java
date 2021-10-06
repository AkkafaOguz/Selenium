package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class C03_Locators {

//    1. Bir class oluşturun: LocatorsIntro
//2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
//            a. http://a.testaddressbook.com adresine gidiniz.
//    b. Sign in butonuna basin
//    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
//    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
//    i. Username : testtechproed@gmail.com
//    ii. Password : Test1234!
//    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
//    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
//            3. Sayfada kac tane link oldugunu bulun.

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/90534/OneDrive/Belgeler/Selenium Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //<a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
        WebElement sign = driver.findElement(By.id("sign-in"));
        sign.click();
        Thread.sleep(1000);

        //<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
        //<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
        //<input type="submit" name="commit" value="Sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">

        WebElement email = driver.findElement(By.id("session_email"));
        email.sendKeys("testtechproed@gmail.com");

        WebElement pass = driver.findElement(By.id("session_password"));
        pass.sendKeys("Test1234!");

        WebElement enter = driver.findElement(By.name("commit"));
        enter.click();

        //<span class="navbar-text" data-test="current-user">testtechproed@gmail.com</span>

        WebElement control = driver.findElement(By.className("navbar-text"));
        String expectedUser = "testtechproed@gmail.com";
        String actualUser = control.getText();

        if (actualUser.equals(expectedUser)){
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
            System.out.println("Actual user is " + actualUser);
        }

        //<a class="nav-item nav-link" data-test="addresses" href="/addresses">Addresses</a>
        //<a class="nav-item nav-link" data-test="sign-out" rel="nofollow" data-method="delete" href="/sign_out">Sign out</a>

        WebElement addressbutton = driver.findElement(By.linkText("Addresses"));
        WebElement singbutton = driver.findElement(By.linkText("Sign out"));

        System.out.println(addressbutton.isEnabled());
        System.out.println(singbutton.isEnabled());


        List <WebElement> linkAdet = driver.findElements(By.tagName("a"));
        System.out.println(linkAdet.size());

        linkAdet.stream().forEach(t-> System.out.println(t.getText()));

        driver.close();

    }
}
