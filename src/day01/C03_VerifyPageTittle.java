package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTittle {

//    Yeni bir Class olusturalim. (VerifyTitle)
//    Amazon ana sayfasina gidelim . https://www.amazon.com/
//    Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/90534/OneDrive/Belgeler/Selenium Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle().equals("amazon") ? "pass" : "fail");
    }
}
