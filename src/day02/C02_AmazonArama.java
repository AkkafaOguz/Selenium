package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_AmazonArama {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:/Users/90534/OneDrive/Belgeler/Selenium Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        //<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">

        WebElement arama = driver.findElement(By.id("twotabsearchtextbox"));

        arama.sendKeys("Java" + Keys.ENTER);  // Tiklama icin 1.yol

        //<input id="nav-search-submit-button" type="submit" class="nav-input nav-progressive-attribute" value="Go" tabindex="0">

        WebElement tikla = driver.findElement(By.id("nav-search-submit-button")); //Tiklama icin 2. yol
        tikla.click();

        WebElement sonucYazisi = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonucYazisi.getText());
        //Web elementler obje oldugu icin direkt olarak yazdirilamazlar. Web elementin sahip oldugu yaziyi String olarak yazdirmak icin getText() methodu kullanilir.

    }
}
