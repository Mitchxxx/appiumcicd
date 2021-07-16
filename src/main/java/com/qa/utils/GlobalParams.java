package com.qa.utils;

public class GlobalParams {

    // Create Global Params for Parallel testing
    private static ThreadLocal<String> platformName = new ThreadLocal<String>();
    private static ThreadLocal<String> udId = new ThreadLocal<String>();
    private static ThreadLocal<String> deviceName = new ThreadLocal<String>();
    private static ThreadLocal<String> systemPort = new ThreadLocal<String>();
    private static ThreadLocal<String> chromeDriverPort = new ThreadLocal<String>();
    private static ThreadLocal<String> wdaLocalPort = new ThreadLocal<String>();
    private static ThreadLocal<String> webKitDebugProxyPort = new ThreadLocal<String>();

    public String getPlatformName() { return platformName.get(); }

    public void setPlatformName(String platformName1) { platformName.set(platformName1);}

    public String getUdId() {return udId.get();}

    public void setUdId(String udId2) { udId.set(udId2); }

    public String getDeviceName() { return deviceName.get(); }

    public void setDeviceName(String deviceName2) { deviceName.set(deviceName2); }

    public String getSystemPort(){ return systemPort.get(); }

    public void setSystemPort(String systemPort2){ systemPort.set(systemPort2);}

    public String getChromeDriverPort() { return chromeDriverPort.get(); }

    public void setChromeDriverPort(String chromeDriverPort2) {chromeDriverPort.set(chromeDriverPort2);}

    public String getWdaLocalPort() { return wdaLocalPort.get(); }

    public void setWdaLocalPort(String wdaLocalPort2) {wdaLocalPort.set(wdaLocalPort2);}

    public String getWebkitDebugProxyPort() { return webKitDebugProxyPort.get(); }

    public void setWebKitDebugProxyPort(String webKitDebugProxyPort2) { webKitDebugProxyPort.set(webKitDebugProxyPort2); }

    public void initializeGlobalParams(){
        GlobalParams params = new GlobalParams();
        params.setPlatformName(System.getProperty("platformName", "Android"));
        params.setUdId(System.getProperty("udId", "emulator-5554"));
        params.setDeviceName(System.getProperty("deviceName", "Nexus 5X API 30"));

        switch(params.getPlatformName()){
            case "Android":
                params.setSystemPort(System.getProperty("systemPort", "10000"));
                params.setSystemPort(System.getProperty("chromeDriverPort", "11000"));
                break;
            case "iOS":
                params.setSystemPort(System.getProperty("wdaLocalPort", "10001"));
                params.setSystemPort(System.getProperty("webKitDebugProxyPort", "11001"));
                break;
            default:
                throw new IllegalStateException("Invalid Platform Name!");
        }
    }


}
