package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        //Techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");//get() methodu ile aynı mantıkta calışır
        Thread.sleep(3000); // Java kodlarını bekletmek için "Thread.sleep" kullanılır.

        //Sonra Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);


        //Amazon sayfasının baslığını yazdıralım
        System.out.println("Amazon sayfa baslığı : "+ driver.getTitle());
        Thread.sleep(3000);

        //Techproeducation sayfasına geri dönelim
        driver.navigate().back();
        Thread.sleep(3000);

        //Sayfa baslığını yazdıralım
        System.out.println("Techproeducation sayfa baslığı : "+ driver.getTitle());
        Thread.sleep(3000);

        //Amazon sayfasına tekrar gidip Url'i yazdıralım.
        driver.navigate().forward();
        System.out.println("Amazon Url'si : "+ driver.getCurrentUrl());
        Thread.sleep(3000);

        //Amazon sayfasındayken sayfayı yenileyelim.
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Sayfayı kapatalım
        driver.close();
    }
}
