package JalaAcademy.Selenium.Test.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBox {
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
        driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
        Thread.sleep(1000);
    }


    @Test (priority = 2)
    public void initialize() throws InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Create']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Aftab");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Mulani");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='EmailId']")).sendKeys("aftabmulani001@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='MobileNo']")).sendKeys("7972281955");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='DOB']")).sendKeys("11/09/2001");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='M']")).click(); //Radio Button by Label Text / value
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='Address']")).sendKeys("Pune");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='CountryId']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='CountryId']//option[@value='1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='CityId']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='CityId']//option[@value='5']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='chkSkill_1']")).click();
        driver.findElement(By.xpath("//input[@id='chkSkill_2']")).click();
        driver.findElement(By.xpath("//input[@id='chkSkill_3']")).click();
        driver.findElement(By.xpath("//input[@id='chkSkill_4']")).click();
        driver.findElement(By.xpath("//input[@id='chkSkill_5']")).click();
        driver.findElement(By.xpath("//input[@id='chkSkill_6']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
        Thread.sleep(1500);
    }

    @Test (priority = 3)
    public void checkbox() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Create']")).click();
        Thread.sleep(1000);
        List<WebElement> radio = driver.findElements(By.name("rdbGender")); //number of elements in a radio group
        System.out.println("Radio elements are " + radio.size());
        System.out.println(driver.findElement(By.name("rdbGender")).getAttribute("value")); //all radio button values
        if (driver.findElement(By.xpath("//input[@value='M']")).isSelected()) // Radio Button is selected
        {
            System.out.println("male Radio button is selected");
        }
        else
        {
            System.out.println("male radio button is not selected");
        }
        System.out.println("If true, the webelement is enabled; else false means disabled: " +driver.findElement(By.xpath("//input[@value='M']")).isEnabled()); //Radio Button is enabled or disabled
    }
    @Test (priority = 4)
    public void destroy() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
