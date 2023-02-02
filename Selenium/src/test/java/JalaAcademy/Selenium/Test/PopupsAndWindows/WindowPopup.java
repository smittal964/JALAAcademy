package JalaAcademy.Selenium.Test.PopupsAndWindows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowPopup {
    WebDriver driver;

    @Test(priority = 0)
    public void launch() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://magnus.jalatechnologies.com/");
        Thread.sleep(1000);
    }

    @Test (priority = 1)
    public void initilize() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("training@jalaacademy.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
        Thread.sleep(1000);
    }

    @Test (priority = 2)
    public void popupTest() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("Aftab");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='btnSearch']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//tr[@class='odd']//a[@title='Delete'][normalize-space()='Delete']")).click();
        Thread.sleep(1000);
        System.out.println("Text inside popup window: "+ driver.findElement(By.xpath("//button[normalize-space()='Yes']")).getText());
        driver.findElement(By.xpath("//button[normalize-space()='Yes']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='More']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='/Home/Popup']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='alertBox']")).click();
        Thread.sleep(1000);
        Alert al1 = driver.switchTo().alert();
        al1.accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='confirmBox']")).click();
        Thread.sleep(1000);
        Alert al2 = driver.switchTo().alert();
        al2.dismiss();
        Thread.sleep(1000);


    }

    @Test (priority = 11)
    public void destroy () throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='dropdown-toggle p-22']")).click();
        driver.quit();
    }
}
