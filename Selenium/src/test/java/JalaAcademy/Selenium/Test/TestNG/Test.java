package JalaAcademy.Selenium.Test.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test {
    WebDriver driver;
    @BeforeTest
    public void testlaunchBrowser() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://magnus.jalatechnologies.com/");
    }

    @org.testng.annotations.Test
    public void testloginMagnus() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("training@jalaacademy.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        Thread.sleep(1000);
    }

    @AfterTest
    public void testclosingBrowser() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[2]/header/nav/div/ul/li/a")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
