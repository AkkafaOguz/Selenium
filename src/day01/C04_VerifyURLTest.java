package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyURLTest {

//    Yeni bir class olusturalim : (VerifyURLTest)
//    Youtube ana sayfasina gidelim https://www.techproeducation.com/
//    Sayfa URL’inin www. techproeducation.com oldugunu dogrulayin

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/90534/OneDrive/Belgeler/Selenium Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techproeducation.com");

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.techproeducation.com";

        if (actualURL.equals(expectedURL)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
            System.out.println("Gecerli URL: " + driver.getCurrentUrl());
        }
        driver.close();
    }
}
