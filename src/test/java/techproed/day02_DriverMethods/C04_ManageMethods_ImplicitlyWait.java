package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*
        İmplicitlyWait(Duration.ofSeconds(20) sayfadaki webEelement'leri görünür olana kadar (sayfada olusana kadar)
        maksimum 20 saniye bekleyecek. Eger webElement'ler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.
        Fakat belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa
        testimiz fail verir.
        Thread.sleep() ise java kodlarını bizim belirttigimiz süre kadar bekler. 30 saniye beklemesini belirtirsem
        her şartta tam 30 saniye bekler ve alt satıra gecer.
         */

        //techproed sayfasına gidelim
        String amazonuRL = "https://amazon.com/";
        String techproUrl = "https://techproeducation.com";
        driver.get(techproUrl);

        //amazona gidelim
        driver.get(amazonuRL);

        //techproed sayfasına geri dönelim
        driver.navigate().back();

        //sayfa baslıgının techpro icerdiğini test edelim
        String actualTitleTechpro = driver.getTitle();
        String arananKelime = "Techpro";
        if (actualTitleTechpro.contains(arananKelime)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED"+ actualTitleTechpro);
        }

        //tekrar amazon sayfasıa gidelim
        driver.navigate().forward();

        //sayfa baslıgının Amazon icerdigini test edelim
        String actualTitleAmazon= driver.getTitle();
        String expectedTitleAmazon= "Amazon";
        if (actualTitleAmazon.contains(expectedTitleAmazon)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED"+ actualTitleAmazon);
        }

        //Sayfayı kapatınız
        driver.close();



    }
}
