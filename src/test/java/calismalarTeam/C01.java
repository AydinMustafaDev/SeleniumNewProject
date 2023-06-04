package calismalarTeam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {

        System.setProperty("mustafaDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       //ödev : 1
       //GetMethods
       //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

       //Sayfa basligini(title) yazdirin
        String title = driver.getTitle();
        System.out.println(title);

        //Sayfa basliginin "Amazon" icerdigini test edin
        String expectedValue = "Amazon";
        if (title.contains(expectedValue)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

       //Sayfa adresini(url) yazdirin
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        //Sayfa url'inin "amazon" icerdigini test edin.
        if (currentUrl.contains("amazon")) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

       //Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        if (driver.getPageSource().contains("Gateway")) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

       //Sayfayi kapatin.
        driver.close();
    }
}
