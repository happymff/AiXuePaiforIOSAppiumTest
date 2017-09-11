package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by mengfeifei on 2017/9/11.
 */
public class TestBase {
    WebDriver driver;
    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/mengfeifei/Downloads/chromedriver");
        return driver;
    }
    @BeforeMethod
    public void setUp() throws Exception {
       driver = new ChromeDriver();
    }

    @Test
    public void myTest() throws Exception {
       driver.get("http://wwww.baidu.com");
       driver.findElement(By.id("kw")).sendKeys("Hello");
       driver.findElement(By.id("su")).click();
       Thread.sleep(3000);
        Assert.assertEquals(1,2);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
