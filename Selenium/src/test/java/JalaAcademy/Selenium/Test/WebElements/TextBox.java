package JalaAcademy.Selenium.Test.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TextBox {
    WebDriver driver;
    @Test(priority = 0)
    public void launch() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://magnus.jalatechnologies.com/");
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void initialize() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("training@jalaacademy.com"); //Type in text box
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("jobprogram"); //Type in text box
        Thread.sleep(1000);
        System.out.println("The entered text in textbox: "+ driver.findElement(By.xpath("//*[@id=\"UserName\"]")).getText()); //value of text box
        System.out.println("The entered placeholder in the textbox is: " + driver.findElement(By.xpath("//*[@id=\"Password\"]")).getAttribute("placeholder")); //placeholder name
        driver.findElement(By.xpath("//*[@id=\"UserName\"]")).clear(); //command to clear all text box
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear(); //command to clear all text box
        System.out.println("If true, the webelement is enabled; else false means disabled: "+driver.findElement(By.xpath("//*[@id=\"UserName\"]")).isEnabled()); //check if web element is enabled or not
    }

    @Test(priority = 2)
    public void distroy() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
