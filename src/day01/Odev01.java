package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev01 {

//1. Yeni bir class olusturun (TekrarTesti)
//2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
//(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
//3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
//URL'yi yazdırın.
//4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
//5. Youtube sayfasina geri donun
//6. RefrSayfayi yenileyin
//7. Amazon sayfasina donun
//8. Sayfayi tamsayfa yapin
//9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
//doğru başlığı(Actual Title) yazdırın.
//10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
//URL'yi yazdırın
//11.Sayfayi kapatin

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/90534/OneDrive/Belgeler/Selenium Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        Thread.sleep(1000);
        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test for Youtube title is passed!");
        } else {
            System.out.println("Test for Youtube title is failed!");
            System.out.println("Actual title is " + actualTitle);
        }

        String expectedURLpart = "youtube";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURLpart)) {
            System.out.println("Test for Youtube URL is passed!");
        } else {
            System.out.println("Test for Youtube URL is failed!");
            System.out.println("The actual URL is " + actualURL);
        }
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        String actualTitleForAmazon = driver.getTitle();
        String expectedTitlePartForAmazon = "Amazon";

        if (actualTitleForAmazon.contains(expectedTitlePartForAmazon)) {
            System.out.println("Test for Amazon title is passed!");
        } else {
            System.out.println("Test for Amazon title is failed!");
            System.out.println("Actual title is " + actualTitleForAmazon);
        }

        String expectedURLForAmazon = "https://www.amazon.com/";
        String actualURLForAmazon = driver.getCurrentUrl();

        if (expectedURLForAmazon.equals(actualURLForAmazon)) {
            System.out.println("Test for Amazon URL is passed!");
        } else {
            System.out.println("Test for Amazon title is failed!");
            System.out.println("Actual URL is" + actualURLForAmazon);
        }

        driver.close();

    }

}
