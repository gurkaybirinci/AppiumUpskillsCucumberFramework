package generalstore.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.time.Duration;

import static generalstore.utils.ConfigReader.getProperty;

public class Driver {
    public static AndroidDriver driver;
    public static AppiumDriverLocalService service;

    public static AndroidDriver getDriver() {
        if (driver == null) {
            String appUrl = System.getProperty("user.dir")
                    + File.separator + "src"
                    + File.separator + "test"
                    + File.separator + "resources"
                    + File.separator + "apps"
                    + File.separator + getProperty("apkName");

            UiAutomator2Options options = new UiAutomator2Options()
                    .setUiautomator2ServerInstallTimeout(Duration.ofSeconds(40))
                    .setApp(appUrl);

            driver = new AndroidDriver(service.getUrl(), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }

    public static void serverBaslat(String ipAdres, int port){
        service = new AppiumServiceBuilder()
                .withAppiumJS(new File("C:\\Users\\gurka\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
                .withIPAddress(ipAdres)
                .usingPort(port)
                .build();
        service.start();
    }

    public static void uygulamayiKapat() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static void serverKapat(){
        service.stop();
    }


}
