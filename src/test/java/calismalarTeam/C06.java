package calismalarTeam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       //ödev : 6
       //Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın  (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }


       //Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("youtube")) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

       //Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com");

       //Youtube sayfasina geri donun
        driver.navigate().back();

       //Sayfayi yenileyin
        driver.navigate().refresh();

       //Amazon sayfasina donun
       driver.navigate().forward();

       //Sayfayi tamsayfa yapin
       driver.manage().window().fullscreen();

       //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa  doğru
        // başlığı(Actual Title) yazdırın.
        String currentUrlAmazon = driver.getCurrentUrl();

        if (currentUrl.contains("Amazon")) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

       //        Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
       //URL'yi yazdırın
        String current_Url = driver.getCurrentUrl();

       //Sayfayi kapatin
        driver.close();
    }
}
