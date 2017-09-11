package util;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


/**
 * Created by mff on 2017/5/11.
 */
public class ScreenshotListener extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult tr) throws NullPointerException{
        TestBase tb= (TestBase)tr.getInstance();
        WebDriver driver=tb.getDriver();
        Screenshot sc= new Screenshot(driver);
        sc.takeScreenShot();
    }
}
