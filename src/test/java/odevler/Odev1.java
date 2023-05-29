package odevler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev1 {
    public static void main(String[] args) throws InterruptedException {

        System.getProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

       //   ODEV

       //1.Yeni bir Class olusturalim.C06_ManageWindow
       //2.Amazon soyfasina gidelim. https://www.amazon.com/
          String amazonuRL = "https://amazon.com/";
          driver.get(amazonuRL);

       //3.Sayfanin konumunu ve boyutlarini yazdirin
        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu : "+ driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları : "+ driver.manage().window().getSize());

       //4.Sayfayi simge durumuna getirin
        //Sayfayı minimize yapalım
        driver.manage().window().minimize();

       //5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

       //6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu : "+ driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları : "+ driver.manage().window().getSize());

       //7.Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

       //8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        //Browser'ın konumunu yazdıralım
        System.out.println("Sayfanın konumu : "+ driver.manage().window().getPosition());

        //Browser'ın boyutlarını yazdıralım
        System.out.println("Sayfanın boyutları : "+ driver.manage().window().getSize());

       //9.Sayfayi kapatin
        driver.close();
    }
}
