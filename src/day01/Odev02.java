package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Odev02 {

//1.Yeni bir class olusturalim (Homework)
//2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
//oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
//3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
//yazdirin.
//4.https://www.walmart.com/ sayfasina gidin.
//5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
//6. Tekrar “facebook” sayfasina donun
//7. Sayfayi yenileyin
//8. Sayfayi tam sayfa (maximize) yapin
//9.Browser’i kapatin

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/90534/OneDrive/Belgeler/Selenium Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";

        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Test for Facebook title is passed!");
        } else {
            System.out.println("Test for Facebook title is failed!");
            System.out.println("The actual title is " + actualTitle);
        }

        String actualURL = driver.getCurrentUrl();
        String expectedURLPart = "facebook";

        if (actualURL.contains(expectedURLPart)) {
            System.out.println("Test for Facebook URL is passed!");
        } else {
            System.out.println("Test for Facebook URL is failed!");
            System.out.println("The actual URL is " + actualURL);
        }

        driver.navigate().to("https://www.walmart.com/");

        String actualTitleForWalmart = driver.getTitle();
        String expectedTitleForWalmart = "Walmart.com";

        if (actualTitleForWalmart.equalsIgnoreCase(expectedTitleForWalmart)) {
            System.out.println("Test for Walmart title is passed!");
        } else {
            System.out.println("Test for Walmart title is failed!");
            System.out.println("The actual title is " + actualTitleForWalmart);
        }

        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.close();

    }
}
