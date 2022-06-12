import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Zakaz {
    public void sleep(int seconds){
        try {
            Thread.sleep(seconds *1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
@Test
public void zakazmz(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.get("https://novus.zakaz.ua/ru/products/04820171998793/pelmeni-laska-400g/");
    sleep(2);
    driver.findElement(By.xpath("//span[text()='Добавить в корзину']")).click();
    sleep(2);
    driver.findElement(By.xpath("//li[@id='react-tabs-2']")).click();
    sleep(2);
    driver.findElement(By.xpath("//div[@class='RegionSelect css-2b097c-container']")).click();
    sleep(2);
    driver.findElement(By.xpath("//div[text()='Киев']")).click();
    sleep(1);
    driver.findElement(By.xpath("//input[@id='pickup-city-store-482010105']")).click();
    driver.findElement(By.xpath("//input[@id='pickup-city-store-482010105']")).sendKeys("\n");
    sleep(4);
    Assert.assertEquals("сожалению", "сожалению");
driver.quit();

}


}
