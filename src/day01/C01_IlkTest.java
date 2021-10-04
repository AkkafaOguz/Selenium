package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C01_IlkTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/90534/OneDrive/Belgeler/Selenium Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        System.out.println("Su anki URL: "+driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.quit();
        //Quit acik olan tum browser'lari kapatirken close sadece bir browser kapatir.
        //Birden fazla pencere ile calistiysak ve hepsini kapatmak istiyorsak quit() kullaniriz.
        driver.close();
        //Birden fazla sekme acik ise close son sekmeyi kapatir, quit ise butun sekmeleri kapatir.

    }
}
