package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        //Amazon sayfasına gidelim
        //Syaf başlığının "Amazon"(expected) içerdiğini test edelim
        // Url'in https://www.amazon.com oldugunu test edelim
        //Sayfayı kapatalım

        driver.get("https://amazon.com"); //Amazon sayfasına gidelim

        String actualTitle = driver.getTitle(); //Sayfa başlığının "Amazon" içerdiğini kontrol edelim
        String expectedTitle = "Amazon";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        //Url'in https://wwww.amazon.com olldugunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://wwww.amazon.com";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAİLED ->" + actualUrl);
        }

        //Sayfayı kapatalım
        driver.close(); // Browser'ı kapatır
        // driver.quit(); ==> Birden fazla browser varsa hepsini kapatır




    }
}
