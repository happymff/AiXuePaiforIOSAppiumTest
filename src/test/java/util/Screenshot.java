package util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by mengfeifei on 2017/9/11.
 */
public class Screenshot {
    WebDriver driver;

    public Screenshot(WebDriver driver) {
        this.driver =driver;
    }

    private void takeScreenShot(String filepath){
        File screenShot =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(screenShot, new File(filepath));
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void takeScreenShot(){
        String fileName = String.valueOf(new Date().getTime()+".jpg");
        File dir = new File("test-output/snapshots");
       if (!dir.exists()){
           dir.mkdir();
       }
       String screenShotPath = dir.getAbsolutePath()+"/"+fileName;

       takeScreenShot(screenShotPath);
    }

}
