package techproed.day03_Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WebElementLocators {
    public static void main(String[] args) throws InterruptedException {

        // https://www.amazon.com sayfasına gidiniz
        // aramakutusunu locate ediniz ve Nutella aratınız
        // sayfayı kapatınız

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://amazon.com");

        //İstediğimiz html kodunu almak için sırayla CTRL+C ,  CTRL+F ve CTRL+V yapıyoruz.
        // (Ya da saol üstteki ok'a basarız sonra koda çift tıklarız

        // aramakutusunu locate ediniz ve Nutella aratınız
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //Eger bir webElement'i birden fazla kez kullanmayacaksanız bir webEelement'e assign etmeden
        // bu sekilde de isleminizi yapıp gecebilirsiniz.
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+Keys.ENTER);

        // Driver eger elementi bulamazdsa runtime exception verir:  NoSuchElementException
        //NoSuchElementException gördüğünüzde locator'unuzu tekrar kontrol etmelisiniz. Yine olmuyorsa
        // farklı yöntem ile locate almalısınız.

        //İstediğimiz öğreyi aratmak için sendKeys() kullan.
        //WebElement.sendKeys("Metin"); ==>Parametre olarak yazılan metni Web elemente gönderir
        //Enter'a basmak için de Keys.ENTER  kullan.
        //WebElement.sendKeys("Metin"+ Keys.ENTER); ==> İstediğimiz metni gönderip sonra Enter'a basar

        //webElement.submit();  ==>  Keys.ENTER       ==> Enter'a basar. (Sonraki class'ta anlatılıyor.)

        Thread.sleep(2000);

        driver.close();


    }
}
