package com.qa.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class CapabilitiesManager {
    TestUtils utils = new TestUtils();

    public DesiredCapabilities getCaps() throws IOException {

        GlobalParams params = new GlobalParams();
        Properties props = new PropertyManager().getProps();

        try {
            utils.log().info("Getting the Capabilities");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, params.getPlatformName());
            caps.setCapability(MobileCapabilityType.UDID, params.getUdId());
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, params.getDeviceName());

            switch(System.getProperty("platformName", "Android")){

            case "Android":

                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("androidAutomationName"));
                caps.setCapability("appPackage", props.getProperty("androidAppPackage"));
                caps.setCapability("appActivity", props.getProperty("androidAppActivity"));
                caps.setCapability("systemPort", params.getSystemPort());
                caps.setCapability("chromeDriverPort", params.getChromeDriverPort());
                // Get location of APP and set as asspUrl
             //   String androidAppUrl = getClass().getResource(props.getProperty("androidAppLocation")).getFile();
                String androidAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                        +File.separator + "resources" + File.separator + "Apps" + File.separator + "Android.SauceLabs.Mobile.Sample.app.2.7.1.apk";
                utils.log().info("appUrl is" + androidAppUrl);
                caps.setCapability("app", androidAppUrl);
                break;

            case "iOS":
                caps.setCapability("automationName", props.getProperty("iOSAutomationName"));

                // Get location of APP and set as iosAppUrl
                String  iOSAppUrl = getClass().getResource(props.getProperty("iOSAppLocation")).getFile();
                caps.setCapability("app", iOSAppUrl);
                System.out.println("\n" +"the appUrl is " + iOSAppUrl);

                break;

        }
        return caps;
        } catch(Exception e){
            e.printStackTrace();
            utils.log().info("Failed to load Capabilities. ABORT !!!");
            throw e;

        }

    }
}
