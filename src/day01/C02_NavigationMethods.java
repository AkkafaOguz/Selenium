package day01;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C02_NavigationMethods {

//    1. Yeni bir Class olusturalim.(NavigationMethods)
//            2. Youtube ana sayfasina gidelim . https://www.youtube.com/
//            3. Amazon soyfasina gidelim. https://www.amazon.com/
//            4. Tekrar YouTube’sayfasina donelim
//5. Yeniden Amazon sayfasina gidelim
//6. Sayfayi Refresh(yenile) yapalim
//7. Sayfayi tam ekran yapalim
//8. Sayfayi kapatalim / Tum sayfalari kapatalim

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/90534/OneDrive/Belgeler/Selenium Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        Thread.sleep(1000);
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.quit();

    }
}
