package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        //getTitle()  Sayfa başlığını verir
        System.out.println("Amazon sayfa baslığı :"+driver.getTitle()); // methoddan önce son açılan
                                                                         // sayfanın title'ını verir.
        System.out.println("Amazon Actual Url :"+ driver.getCurrentUrl()); // Url verir
        driver.get("https://techproeducation.com");
        String amazonWindowHandle = driver.getWindowHandle();
        System.out.println("Techproed sayfa başlığı :"+ driver.getTitle());

        //getCurrentUrl  Gidilen sayfanın Url'ini verir
        System.out.println("Techproed Actual Url :"+ driver.getCurrentUrl()); // methoddan önce son
                                                                        // açılan sayfanın title'ını verir.

        //getPageSource()  Açılan sayfanın kaynak kodlarını verir.
        // System.out.println(driver.getPageSource());    çalıştırmaya gerek yok

        // getWindowHandle()  Gidilen sayfanın handle degerini(hashcode olarak) verir.
        // Bu handle degerini sayfalar arası geciş için kullanırız
        System.out.println("Techproed Window Handle Degeri :"+ driver.getWindowHandle());
        //CDwindow-4C1B07A0058E38F24A7D81DD6C3FFC9F


    }
}
