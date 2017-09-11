package util;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;


public class InitializeDriver {


    public DesiredCapabilities driverInitialize(String platv, String devName, String udid) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platform", "iOS");
        caps.setCapability("platformVersion", platv);
        caps.setCapability("deviceName", devName);
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("autoAcceptAlerts", "true");
        caps.setCapability("noReset", "false");
        caps.setCapability("udid", udid);
        caps.setCapability("bundleId", "com.etiantian.ettaixuepai");
// relative path to .app file
        final File classpathRoot = new File(System.getProperty("user.dir"));
        final File appDir = new File(classpathRoot, "src/test/resource/");
        final File app = new File(appDir, "ettAiXuePaiNextGen.app");
        caps.setCapability("app", app.getAbsolutePath());

        return caps;
    }
}
