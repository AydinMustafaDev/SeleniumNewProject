package calismalarTeam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // ödev : 5
        // Yeni bir class olusturalim (Homework)
        // ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        // oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        //         Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
        // yazdirin.
        String expectedUrlElement = "facebook";
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains(expectedUrlElement)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        //         https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");

        // Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        String actualTitleWalmart = driver.getTitle();
        String expectedTitleWalmart = "Walmart.com";
        if (actualTitleWalmart.contains(expectedTitleWalmart)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        // Tekrar "facebook" sayfasina donun
        driver.navigate().back();

        // Sayfayi yenileyin
        driver.navigate().refresh();

        // Sayfayi tam sayfa (maximize) yapin  9.Browser'i kapatin
        driver.manage().window().maximize();
        driver.close();

    }
}
