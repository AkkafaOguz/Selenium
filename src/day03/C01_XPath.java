package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_XPath {

//    1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
//            2- Add Element butonuna basin
//3- Delete butonu’nun gorunur oldugunu test edin
//4- Delete tusuna basin
//5- Delete butonunun gorunur olmadigini test edin


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/90534/OneDrive/Belgeler/Selenium Dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(1000);

        //<button onclick="addElement()">Add Element</button>

        // WebElement addButonu= driver.findElement(By.tagName("button"));
        //WebElement addButonu= driver.findElement(By.xpath("//button"));
        //WebElement addButonu= driver.findElement(By.xpath("//button[text()='Add Element']"));
        //WebElement addButonu= driver.findElement(By.xpath("//*[text()='Add Element']"));

        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        addElement.click();

        Thread.sleep(1000);

        //<button class="added-manually" onclick="deleteElement()">Delete</button>

        WebElement deleteElement = driver.findElement(By.xpath("//button[@class='added-manually']"));


        System.out.println(deleteElement.isDisplayed());

        deleteElement.click();
        Thread.sleep(2000);

        //Eger HTML kodunda butona bastigimizda ilgili kod siliniyorsa driver'in o elemente ulasmamiz mumkun olmayacagindan, varligini yahut yoklugunu test edemeyiz.
        //Dolayisiyla silindikten sonra locate etmeye calisirsak StaleElementReferenceException aliriz.

        System.out.println(deleteElement.isDisplayed());

        driver.close();

    }
}
