package JalaAcademy.Selenium.Test.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Links {
    WebDriver driver;

    @Test(priority = 0)
    public void launch() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://magnus.jalatechnologies.com/");
        Thread.sleep(1000);
    }

    @Test (priority = 1)
    public void login() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("training@jalaacademy.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("jobprogram");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='checkmark']")).click();
        driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
        Thread.sleep(1000);
    }

    @Test (priority = 2)
    public void initialTest1() throws InterruptedException {
        /*
        Clicking a link using partialLinkText
        */
        driver.findElement(By.xpath("//a[normalize-space()='More']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Links']")).click();
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Link 1")).click(); //partialLinkText
        Thread.sleep(1000);
        String mainHandle = driver.getWindowHandle();
        driver.switchTo().window(mainHandle);
        Thread.sleep(1000);
    }

    @Test (priority = 2)
    public void initialTest2() throws InterruptedException {
        /*
        Clicking a link using link Text
        */
        String mainHandle = driver.getWindowHandle();
        driver.switchTo().window(mainHandle);
        Thread.sleep(1000);
        driver.findElement(By.linkText("Link 2")).click(); //linkText
        Thread.sleep(1000);
    }

    @Test(priority = 6)
    public void initialTest3() throws InterruptedException {
        /*
        Find out all the links in a web page
         */
        Thread.sleep(1000);
        String mainHandle = driver.getWindowHandle();
        driver.switchTo().window(mainHandle);
        List<WebElement> a = driver.findElements(By.xpath("//a[@target='_blank']"));
        for(WebElement link:a){
            System.out.println(link.getText() + " - " + link.getAttribute("href"));
        }
        Thread.sleep(1000);
    }

    @Test (priority = 7)
    public void initialTest4() throws InterruptedException {
        /*
        Clicking on an image link
         */
        driver.findElement(By.xpath("//a[normalize-space()='Image Links']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@alt='Jala Technologies Link']")).click();
        Thread.sleep(3000);
    }
    @Test (priority = 8)
    public void destroy() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
