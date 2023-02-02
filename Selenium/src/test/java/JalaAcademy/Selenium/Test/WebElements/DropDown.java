package JalaAcademy.Selenium.Test.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown {
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
        driver.findElement(By.xpath("//a[normalize-space()='Employee']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Create']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='CountryId']")).click();
        driver.findElement(By.xpath("//select[@id='CountryId']//option[@value='6']")).click();
        Thread.sleep(1000);
    }

    @Test (priority = 2)
    public void initialTest() throws InterruptedException {
        /*
        Print all the options available in the dropdown
         */
        Select s = new Select(driver.findElement(By.xpath("//select[@id='CountryId']")));
        List<WebElement> options = s.getOptions();
        for(WebElement e : options)
        {
            System.out.println(e.getText());
        }
        Thread.sleep(1000);
    }

    @Test (priority = 3)
    public void initialTest1() throws InterruptedException {
        /*
        Print first selected option from a dropdown
         */
        Select s = new Select(driver.findElement(By.xpath("//select[@id='CountryId']")));
        List<WebElement> options = s.getOptions();
        System.out.println("The selected dropdown value is : ");
        for(WebElement e : options) {
            if(e.isSelected()) {
                System.out.println(e.getText());
            }
        }
        Thread.sleep(1000);
    }

    @Test (priority = 4)
    public void initialTest2() throws InterruptedException {
        /*
        Select an option by value from a dropdown
         */
        driver.findElement(By.xpath("//select[@id='CountryId']")).click();
        driver.findElement(By.xpath("//select[@id='CountryId']//option[@value='1']")).click();
        Thread.sleep(1000);
    }

    @Test (priority = 5)
    public void initialTest3() throws InterruptedException {
        /*
        Select an option by visible text from a dropdown
         */
        driver.findElement(By.xpath("//select[@id='CountryId']")).click();
        Select s = new Select(driver.findElement(By.xpath("//select[@id='CountryId']")));
        s.selectByVisibleText("Canada");
        Thread.sleep(1000);
    }

    @Test (priority = 6)
    public void initialTest4() throws InterruptedException {
        /*
        Select an option by index from a dropdown
         */
        driver.findElement(By.xpath("//select[@id='CountryId']")).click();
        Select s = new Select(driver.findElement(By.xpath("//select[@id='CountryId']")));
        s.selectByIndex(1);
        Thread.sleep(1000);
    }

    @Test (priority = 7)
    public void destroy() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
