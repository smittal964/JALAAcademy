package JalaAcademy.Selenium.Test.WebMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebDriverMethods {
    WebDriver driver;

    @Test(priority = 0)
    public void launch() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://magnus.jalatechnologies.com/");
        Thread.sleep(1000);
        System.out.println("current url is: "+driver.getCurrentUrl());
        System.out.println("Title of the page : "+ driver.getTitle());
        System.out.println("Source of the page : "+ driver.getPageSource());
    }

    @Test (priority = 1)
    public void login() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("training@jalaacademy.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("jobprogram");
        Thread.sleep(1000);
        driver.findElements(By.className("form-control")).clear();
        Thread.sleep(1000);
        System.out.println("Handle of the WebPage: " +driver.getWindowHandle());
        driver.switchTo();
        Thread.sleep(1000);
        driver.switchTo().parentFrame();
        Thread.sleep(1000);
        driver.navigate().to("https://jalaacademy.com/");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("training@jalaacademy.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jobprogram");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Create']")).click();
        Thread.sleep(1000);

    }

    @Test (priority = 2)
    public void testCase2 () throws InterruptedException {
        System.out.println("The getAttribute value for radiobutton male is: "+driver.findElement(By.xpath("//input[@id='rdbMale']")).getAttribute("value"));
        System.out.println("The tagname for following web element: "+ driver.findElement(By.xpath("//*[@id=\"frmEmployee\"]/div[2]/button")).getTagName());
        driver.findElement(By.xpath("//a[@class='dropdown-toggle p-22']")).click();
    }
    @Test (priority = 11)
    public void destroy() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
