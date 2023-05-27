package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu : "+ driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları : "+ driver.manage().window().getSize());

        // Browser'ı maximize yapalım
        driver.manage().window().maximize();

        /*
        Bir web sitesine gittigimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki web elementlere
        browser maximize olmadıgı icin ulasamayabiliriz. Dolayısıyla browser'ı actıktan sonra maximize yaparsak driver
         bütün web elementleri görür ve rahatlıkla müdahale edebilir. Bundan dolayı browser'ı actıktan sonra ilk
         olarak maximize yapmamız bizim web elementlere ulasmada işimizi kolaylastırır. Boylelikle FAIL almamış oluruz
         (Tam sayfa olmayınca görünmeyen butonlara basamaz bundan dolayı kullanılır.)
         */

        /*
           ODEV

        1.Yeni bir Class olusturalim.C06_ManageWindow
        2.Amazon soyfasina gidelim. https://www.amazon.com/
        3.Sayfanin konumunu ve boyutlarini yazdirin
        4.Sayfayi simge durumuna getirin
        5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        7.Sayfayi fullscreen yapin
        8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        9.Sayfayi kapatin
         */

        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu : "+driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları : "+driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayı fullscreen yapalım
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(50,50)); //istediğimiz konuma getirir
        driver.manage().window().setSize(new Dimension(600,600));//istediğimiz size'a getirir
        Thread.sleep(3000);

        //sayfayı kapatınız
        driver.close();
    }
}
