package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebElements {

//    <button value="1" class="_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy" id="loginbutton" name="login" tabindex="0" type="submit">Giriş Yap</button>

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/90534/OneDrive/Belgeler/Selenium Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //email textbox
//        <input type="text" class="inputtext _55r1 inputtext _1kbt inputtext _1kbt" name="email" id="email" tabindex="0" placeholder="E-posta veya Telefon Numarası" value="" autofocus="1" autocomplete="username" aria-label="E-posta veya Telefon Numarası">
        WebElement mailTextBox = driver.findElement(By.id("email"));
        mailTextBox.sendKeys("aliselenium@gmail.com");
        Thread.sleep(2000);

        mailTextBox.clear();

//        WebElement mailKutusuTagNameIle = driver.findElement(By.tagName("input"));
//        mailKutusuTagNameIle.sendKeys("alican@gmail.com"); // ElementNotInteractableException: element not interactable
//
//        WebElement yanlisElement = driver.findElement(By.id("emailyanlis"));
//        yanlisElement.sendKeys("yanlis eleman"); // NoSuchElementException: no such element: Unable to locate element. Locator problem.


        //Giris Yap butonuna tikla
        WebElement girisButonu = driver.findElement(By.tagName("button"));
        System.out.println(girisButonu.isEnabled());
        girisButonu.click();


    }

}
