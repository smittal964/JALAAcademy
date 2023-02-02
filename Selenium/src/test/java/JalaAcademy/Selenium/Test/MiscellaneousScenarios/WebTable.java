package JalaAcademy.Selenium.Test.MiscellaneousScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class WebTable {
    WebDriver driver;

    @Test(priority = 0)
    public void launch() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://magnus.jalatechnologies.com/");
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void login() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("training@jalaacademy.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("jobprogram");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
        Thread.sleep(1000);
    }

    @Test(priority=2)
    public void testprintWebTable() throws InterruptedException {
        List<WebElement> rowelements = driver.findElements(By.xpath("//table[@id='tblEmployee']//tbody/tr"));
        System.out.println("No. of row elements are : " + rowelements.size());
        int rowsize = rowelements.size();
        List<WebElement> columnelements = driver.findElements(By.xpath("//table[@id='tblEmployee']//tbody/tr[1]/td"));
        System.out.println("No. of column elements are : " + columnelements.size());
        int columnsize = columnelements.size();
        for (int i = 1; i <= rowsize; i++) {
            for (int j = 1; j <= columnsize; j++) {
                System.out.println(driver.findElement(By.xpath("//table[@id='tblEmployee']//tbody/tr[" + i + "]/td[" + j + "]")).getText());
            }
        }
    }

    @Test(priority = 3)
    public void destroy() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='dropdown-toggle p-22']")).click();
        driver.quit();
    }
}
