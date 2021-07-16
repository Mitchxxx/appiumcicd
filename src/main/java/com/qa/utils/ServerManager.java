package com.qa.utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.util.HashMap;

public class ServerManager {

    private static ThreadLocal<AppiumDriverLocalService> server = new ThreadLocal<>();
    TestUtils utils = new TestUtils();


    public AppiumDriverLocalService getServer(){
        return server.get();
    }
// Class to Start Server
    public void startServer(){
        utils.log().info("Starting Appium Server");
        AppiumDriverLocalService server = MacGetAppiumService();
        server.start();
        if(server == null || !server.isRunning()) {
            utils.log().fatal("Appium server not Started. ABORT!!!");
            throw new AppiumServerHasNotBeenStartedLocallyException("Appium server not Started. ABORT!!!");
        }

        server.clearOutPutStreams();
        this.server.set(server);
        utils.log().info("Appium server started");
    }


    public AppiumDriverLocalService getAppiumServerDefault() {
        return AppiumDriverLocalService.buildDefaultService();
    }
// Configuration to Launch Appium Server
    public AppiumDriverLocalService MacGetAppiumService(){
        GlobalParams params = new GlobalParams();
        HashMap<String, String> environment = new HashMap<>();
        environment.put("PATH", "/Users/mitchxxx1/Library/Java/JavaVirtualMachines/jdk-11.0.11.jdk/Contents/Home/bin:/Users/mitchxxx1/Library/Android/sdk/platform-tools:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin" + System.getenv("PATH"));
        environment.put("ANDROID_HOME", "/Users/mitchxxx1/Library/Android/sdk");
        environment.put("JAVA_HOME", "/Library/Java/JavaVirtualMachines/jdk-11.0.11.jdk/Contents/Home");
        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingDriverExecutable(new File("/usr/local/bin/node"))
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .usingAnyFreePort()
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withEnvironment(environment)
                .withLogFile(new File(params.getPlatformName() + "_"
                        + params.getDeviceName() + File.separator + "Server.log")));
    }
}
